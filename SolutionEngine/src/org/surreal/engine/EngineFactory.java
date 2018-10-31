package org.surreal.engine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ModelImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

/**
 * Factory class for the Engine
 * @author Stefano Marrone
 */
public class EngineFactory {

	public static Engine generate(String iniFileName) throws Exception {
		Engine retval = new Engine();
		IniReader properties = new IniReader(iniFileName);
		String modelfile = properties.get("modelfile");
		String repkind = properties.get("rep_kind");
		String reparg = properties.get("repository");
		retval.setRepository(RepositoryFactory.generate(repkind,reparg));
		retval.setMucd(EngineFactory.getMUCD(modelfile));
		retval.setSam(EngineFactory.getSAM(modelfile));
		return retval;
	}
	
	/**
	 * It extracts the MUCD model from the file name
	 * @param filename: name of the file containing the MUCD model
	 * @return: EMF model containing the MUCD
	 */
	private static Model getMUCD(String filename) {
		Model retval = null;
		Resource res = EngineFactory.load(filename);
		EList<EObject> list = res.getContents();
		for(EObject o: list){
			EcoreUtil.resolveAll(o);
		}
		EObject it = null;
		for (int i=0; i<list.size(); i++) {
			it = list.get(i);
			if (it instanceof ModelImpl) {
				ModelImpl mit = (ModelImpl) it;
				retval = mit;
			}
		}
		return retval;
	}
	
	/**
	 * It extracts the SAM model from the file name
	 * @param filename: name of the file containing the SAM model
	 * @return: EMF model containing the SAM
	 */
	private static StateMachine getSAM(String filename) {
		Model root = EngineFactory.getMUCD(filename);
		EList<Element> list = root.allOwnedElements();
		StateMachine retval = null;
		int size = list.size();
		int counter = 0;
		while ((retval == null) && (counter<size)) {
			Element it = list.get(counter);
			if (it instanceof ClassImpl) {
				ClassImpl cit = (ClassImpl) it;
				if (cit.getName().equals("SM Container")) {
					retval = (StateMachine) cit.getOwnedBehavior("global mode");
				}
			}
			counter++;
		}
		return retval;
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