package test;

import ucd2nusmv.Transformation;
import ucd2nusmv.modes.Postprocessor;
import ucd2nusmv.modes.SMEvolution;
import ucd2nusmv.utils.Utils;

public class TestReaderQuery {

	public static void main(String[] args) {
		IFile model = Utils.genTemp(ip, filename)
		Transformation t = new Transformation(args[0],args[1]);
		String report = t.report();
		Postprocessor pp = new Postprocessor(t.getServiceModes());
		pp.buildEvolution(report);
		SMEvolution sme = pp.getEvolution();
		t.getModelHandler().addStateMachine(sme);
		t.save(args[2]);
	}
}