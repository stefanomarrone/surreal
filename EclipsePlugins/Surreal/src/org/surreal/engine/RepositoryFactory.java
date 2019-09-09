package org.surreal.engine;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Factory class for the Repository
 * @author Stefano Marrone
 *
 */
public class RepositoryFactory {
	
	/**
	 * The method generates a repository according to the tag parameter
	 * @param tag a word identifying the kind of the Repository to generate 
	 * @param repo extra argument used according to the specific tag
	 * @return the Repository object
	 * @throws IOException 
	 * @throws MalformedURLException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static Repository generate(String tag, String repo) {
		Repository retval = null;
		// To add when new repository implementation is available
		if (tag.equals("json")) {
			retval = JSONRepositoryFactory.generate(repo);
		}
		return retval;
	}
}