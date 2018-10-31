package org.surreal.engine;

/**
 * Factory class for the Repository
 * @author Stefano Marrone
 *
 */
public class RepositoryFactory {
	
	/**
	 * The method generates a repository according to the tag parameter
	 * @param tag a word identifying the kind of the Repository to generate 
	 * @param arg extra argument used according to the specific tag
	 * @return the Repository object
	 */
	public static Repository generate(String tag, String arg) {
		Repository retval = null;
		// To add when new repository implementation is available
		if (tag.equals("fake")) {
			retval = new FakeRepository();
		}
		return retval;
	}
}