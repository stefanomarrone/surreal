package org.surreal.samgen.handlers;

import org.eclipse.core.resources.IResource;

public interface SelectionValidator {

	public boolean isValid(IResource res);
}
