package org.surreal.samgen;

import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.surreal.common.modeloracle.MUCDHandler;
import org.surreal.common.modeloracle.UMLFactory;
import org.surreal.samgen.bmc.BmcRequest;
import org.surreal.samgen.bmc.BmcRequestM;
import org.surreal.samgen.bmc.BmcRequestS;
import org.surreal.samgen.execution.EMFactory;
import org.surreal.samgen.execution.ExecutionManager;
import org.surreal.samgen.kripkemodel.SystemModel;
import org.surreal.samgen.kripkemodel.SystemModelFactory;
import org.surreal.samgen.modes.Mode;
import org.surreal.samgen.modes.ServiceModes;
import org.surreal.samgen.modes.SystemModesFactory;

public class Transformation {

	protected MUCDHandler handler;
	
	protected SystemModel system;
	
	protected ServiceModes modes;
	
	public Transformation(IResource mdl) {
		String path = mdl.getWorkspace().getRoot().getLocation().toString();
		IFile mdl_file = (IFile) mdl; 
		String modelFileName = path + mdl_file.getFullPath().toOSString();
		this.handler = UMLFactory.generateMUCD(modelFileName);
		this.system = SystemModelFactory.generate(this.handler);
		Vector<String> tempModes = this.handler.getModesDefinitions();
		this.modes = SystemModesFactory.generate(tempModes);
	}
	
	public Transformation() {
		this.handler = null;
		this.system = null;
		this.modes = null;
	}

	public String generateNuSMV_model() {
		String retval = this.system.toKripke();
		return retval;
	}
	
	public String generateNuSMV_levels() {
		String retval = this.modes.toNuSMV(); 
		return retval;
	}

	public String generateNuSMV_properties() {
		String retval = this.modes.genCTL(); 
		return retval;
	}

	public String generateNuSMV_ltl_properties(Vector<BmcRequest> todeepen) {
		String retval = this.modes.genLTL_existence(todeepen); 
		return retval;
	}

	public MUCDHandler getModelHandler() {
		return this.handler;
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
		String outcome = null;
		try {
			ExecutionManager em = EMFactory.generate("CTL");
			outcome = em.execution(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outcome;		
	}
	
	private String execute_bmc(String payload, int depth) {
		String outcome = null;
		try {
			ExecutionManager em = EMFactory.generate("BMC",depth);
			outcome = em.execution(payload);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outcome;		
	}

	public String report_CTL() {
		// Generating analysis file
		String toAnalyse = this.generateNuSMV();
		String retval = this.execute(toAnalyse);
		return retval;
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

	public String report_BMC(Vector<BmcRequest> requests) {
		return this.innerReportBmc(requests,40);	
	} 

	public String report_BMC() {
		return this.innerReportBmc(this.modes.genFullBMC(),40);
	}

	public String report_BMC(int len) {
		return this.innerReportBmc(this.modes.genFullBMC(),len);
	}
	
	public String innerReportBmc(Vector<BmcRequest> payload, int len) {
		String toAnalyse = this.generateNuSMV_BMC(payload);
		return this.execute_bmc(toAnalyse,len);		
	}

	public ServiceModes getServiceModes() {
		return this.modes;
	}

	public void save(IFile f) {
		this.handler.save(f);
	} 
}