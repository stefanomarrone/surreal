package org.surreal.samgen.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.surreal.samgen.utils.Utils;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public abstract class SurrealHandler extends AbstractHandler {

	protected abstract void call(IResource umlres, IResource moderes, IResource outres);
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		SelectionFilter sf = new SelectionFilter(event);
		SelectionValidator valid;
		valid = new MucdValidator();
		IResource umlModel = sf.getSelected(valid);
		valid = new ModesValidator();
		IResource modesModel = sf.getSelected(valid);
		if ((modesModel != null) && (umlModel != null)) {
			IResource outModel = Utils.genOutFile(umlModel);
			this.call(umlModel,modesModel,outModel);
		}
		return null;
	}
}