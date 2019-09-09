package org.surreal.samgen.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.surreal.samgen.Transformation;
import org.surreal.samgen.modes.Behaviour;
import org.surreal.samgen.modes.CTLProcessor;
import org.surreal.samgen.modes.Postprocessor;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CombinedHandler extends SurrealHandler {

	//TODO: update to the new version
	protected void call(IResource umlres, IResource outres) {
		Transformation t = new Transformation(umlres);
		String report = t.report_CTL();
		Postprocessor pp = new CTLProcessor(t.getServiceModes());
		pp.buildEvolution(report);
		Behaviour sme = pp.getEvolution();
		sme.bmc_shrink(t);
		t.getModelHandler().addStateMachine(sme);
		t.save((IFile) outres);
	}
}