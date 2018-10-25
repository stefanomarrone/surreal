package org.surreal.samgen;

import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.surreal.samgen.bmc.BmcRequest;
import org.surreal.samgen.bmc.BmcRequestM;
import org.surreal.samgen.bmc.BmcRequestS;
import org.surreal.samgen.execution.EMFactory;
import org.surreal.samgen.execution.ExecutionManager;
import org.surreal.samgen.kripkemodel.SystemModel;
import org.surreal.samgen.kripkemodel.SystemModelFactory;
import org.surreal.samgen.modeloracle.UMLFactory;
import org.surreal.samgen.modeloracle.UMLHandler;
import org.surreal.samgen.modes.Mode;
import org.surreal.samgen.modes.ServiceModes;
import org.surreal.samgen.modes.SystemModesFactory;

public class Transformation {

	protected UMLHandler h;
	
	protected SystemModel s;
	
	protected ServiceModes m;
	
	public Transformation(IResource mdl, IResource mds) {
		String path = mdl.getWorkspace().getRoot().getLocation().toString();
		IFile mdl_file = (IFile) mdl; 
		String modelFileName = path + mdl_file.getFullPath().toOSString();
		this.h = UMLFactory.generate(modelFileName);
		this.s = SystemModelFactory.generate(this.h);
		path = mds.getWorkspace().getRoot().getLocation().toString();
		IFile mds_file = (IFile) mds; 
		String modesFileName = path + mds_file.getFullPath().toOSString();
		this.m = SystemModesFactory.generate(modesFileName);
	}
	
	public String generateNuSMV_model() {
		String retval = this.s.toKripke();
		return retval;
	}
	
	public String generateNuSMV_levels() {
		String retval = this.m.toNuSMV(); 
		return retval;
	}

	public String generateNuSMV_properties() {
		String retval = this.m.genCTL(); 
		return retval;
	}

	public String generateNuSMV_ltl_properties(Vector<BmcRequest> todeepen) {
		String retval = this.m.genLTL(todeepen); 
		return retval;
	}

	public UMLHandler getModelHandler() {
		return this.h;
	}
	
	public String generateNuSMV() {
		String retval = this.generateNuSMV_model() + "\n\n";
		retval += this.generateNuSMV_levels() + "\n\n"; 
		retval += this.generateNuSMV_properties();
		return retval;
	}

	public String generateNuSMV_BMC(Vector<BmcRequest> todeepen) {
		String retval = this.generateNuSMV_model() + "\n\n";
		retval += this.generateNuSMV_levels() + "\n\n"; 
		retval += this.generateNuSMV_ltl_properties(todeepen);
		return retval;
	}

	private String execute(String payload) {
		ExecutionManager em = EMFactory.generate("CTL");
		String outcome = null;
		try {
			outcome = em.execution(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outcome;		
	}
	
	private String execute_bmc(String payload, int depth) {
		ExecutionManager em = EMFactory.generate("BMC",depth);
		String outcome = null;
		try {
			outcome = em.execution(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outcome;		
	}

	public String report_CTL() {
		// Generating analysis file
		String toAnalyse = this.generateNuSMV();
		return this.execute(toAnalyse);
	}

	public String report_BMC(Mode s, Mode t, int len) {
		Vector<BmcRequest> singleBatch = new Vector<BmcRequest>();
		singleBatch.add(new BmcRequestM(s,t,len));
		return this.innerReportBmc(singleBatch,len);
	}

	public String report_BMC(String s, String t,int len) {
		Vector<BmcRequest> singleBatch = new Vector<BmcRequest>();
		singleBatch.add(new BmcRequestS(s,t,len));
		return this.innerReportBmc(singleBatch,len);
	}

	public String report_BMC(Vector<BmcRequest> batch, int len) {
		return this.innerReportBmc(batch,40);
	}

	public String report_BMC(BmcRequest single, int len) {
		Vector<BmcRequest> singleBatch = new Vector<BmcRequest>();
		singleBatch.add(single);
		return this.innerReportBmc(singleBatch,len);
	}

	public String report_BMC() {
		return this.innerReportBmc(this.m.genFullBMC(),40);
	}

	public String report_BMC(int len) {
		return this.innerReportBmc(this.m.genFullBMC(),len);
	}
	
	public String innerReportBmc(Vector<BmcRequest> payload, int len) {
		String toAnalyse = this.generateNuSMV_BMC(payload);
		return this.execute_bmc(toAnalyse,len);		
	}

	public ServiceModes getServiceModes() {
		return this.m;
	}

	public void save(IFile f) {
		this.h.save(f);
	} 
}