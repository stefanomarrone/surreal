package engine;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.StateMachine;

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
		//TODO: implement the method
		return retval;
	}
	
	/**
	 * It extracts the SAM model from the file name
	 * @param filename: name of the file containing the SAM model
	 * @return: EMF model containing the SAM
	 */
	private static StateMachine getSAM(String filename) {
		StateMachine retval = null;
		//TODO: implement the method
		return retval;
	}
}