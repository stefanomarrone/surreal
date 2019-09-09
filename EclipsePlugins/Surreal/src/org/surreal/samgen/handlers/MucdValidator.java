package org.surreal.samgen.handlers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

@SuppressWarnings("restriction")
public class MucdValidator implements SelectionValidator {

	@Override
	public boolean isValid(IResource res) {
		boolean retval = false;
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		// Get workspace path
		String wpath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String rpath = ((IFile) res).getFullPath().toOSString();
		Resource eres = set.getResource(URI.createFileURI(wpath + rpath), true);
		EList<EObject> list = eres.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		EObject it = null;
		int i = 0;
		while ((!retval) && (i<list.size())) {
			it = list.get(i);
			retval = (it instanceof ModelImpl);  
			i++;
		}
		return retval;
	}
}
