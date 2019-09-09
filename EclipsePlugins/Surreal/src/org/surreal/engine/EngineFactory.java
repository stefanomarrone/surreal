package org.surreal.engine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.surreal.common.modeloracle.SAMHandler;
import org.surreal.common.modeloracle.UMLFactory;
import org.surreal.common.utils.Configuration;

/**
 * Factory class for the Engine
 * @author Stefano Marrone
 */
public class EngineFactory {

	public static Engine generate(String repositoryUrl, String modelfile) {
		Engine retval = new Engine();
		Configuration cfg = Configuration.generate();
		String repositoryKind = cfg.get("kind");
		retval.setRepository(RepositoryFactory.generate(repositoryKind,repositoryUrl));
		SAMHandler temp = UMLFactory.generateSAM(modelfile);
		retval.setHandler(temp);
		return retval;
	}

	/**
	 * It extracts the MUCD model from the file name
	 * @param filename: name of the file containing the MUCD model
	 * @return: EMF model containing the MUCD
	 */
	@SuppressWarnings("unused")
	private static EList<EObject> listGeneration(String filename) {
		Resource res = EngineFactory.load(filename);
		EList<EObject> list = res.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		return list;
	}
	
	
	private static Resource load(String modelpath) {
		ResourceSet set = new ResourceSetImpl();
		set.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		set.getPackageRegistry().put(EcorePackage.eNS_URI,EcorePackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		Resource res = set.getResource(URI.createFileURI(modelpath), true);
		return res;
	}
}