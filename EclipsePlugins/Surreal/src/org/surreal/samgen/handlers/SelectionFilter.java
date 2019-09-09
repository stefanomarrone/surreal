package org.surreal.samgen.handlers;

import java.util.Vector;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class SelectionFilter {
	
	private Vector<IResource> pool;
	
	public SelectionFilter() {
		this.setSelection(null);
	}

	public SelectionFilter(Vector<IResource> selection) {
		this.setSelection(selection);
	}

	public SelectionFilter(ExecutionEvent event) {
		try {
			this.setSelection(this.getSelection(event));
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void setSelection(Vector<IResource> selection) {
		this.pool = selection;
	}

	public IFile getSelected(SelectionValidator v) {
		IFile retval = this.select(v);
		return retval;
	}

	private IFile select(SelectionValidator v) {
		IFile retval = null;
		int i = 0;
		int maxI = this.pool.size();
		boolean flag = false;
		while ((!flag) && (i<maxI)) {
			IResource temp = this.pool.get(i);
			flag = v.isValid(temp);
			retval = (flag) ? (IFile) temp : null;
			i++;
		}
		return retval;
	}

	public IResource getSelected(Vector<IResource> selection, SelectionValidator v) {
		this.setSelection(selection);
		return this.getSelected(v);
	}
	
	private Vector<IResource> getSelection(ExecutionEvent event) throws ExecutionException {
		Vector<IResource> retval = new Vector<IResource>();
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		for (Object o: selection.toList()) {
			retval.add((IResource) o);
		}
		return retval;
	}

}