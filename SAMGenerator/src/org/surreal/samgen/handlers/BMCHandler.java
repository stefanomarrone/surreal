package org.surreal.samgen.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.surreal.samgen.Transformation;
import org.surreal.samgen.modes.BMCProcessor;
import org.surreal.samgen.modes.Behaviour;
import org.surreal.samgen.modes.Postprocessor;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class BMCHandler extends SurrealHandler {

	protected void call(IResource umlres, IResource moderes, IResource outres) {
		Transformation t = new Transformation(umlres,moderes);
		String report = t.report_BMC();
		Postprocessor pp = new BMCProcessor(t.getServiceModes());
		pp.buildEvolution(report);
		Behaviour sme = pp.getEvolution();
		t.getModelHandler().addStateMachine(sme);
		t.save((IFile) outres);
	}
}