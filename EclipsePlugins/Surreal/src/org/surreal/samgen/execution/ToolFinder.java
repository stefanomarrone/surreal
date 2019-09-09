package org.surreal.samgen.execution;

import java.util.ArrayList;
import java.util.List;

import org.surreal.common.utils.Configuration;
import org.surreal.common.utils.Dictionary;

public abstract class ToolFinder {
	
	protected List<String> defaultNames;
	
	protected ToolChecker checker;
	
	protected abstract void set();
	
	public ToolFinder() {
		this.defaultNames = new ArrayList<String>();
		this.checker = null;
		this.set();
	}
	
	public String getToolName() throws ToolNotFound {
		String retval = null;
		
		// Search in configuration
		Configuration config = Configuration.generate();
		if (config.test("tool")) {
			this.defaultNames.add(config.get("tool"));
		}

		if (Dictionary.embeddedToolFlag == true) {
			// Get embedded solution
			String embedded = this.getEmbeddedName();
			this.defaultNames.add(embedded);
		}
		
		// Search in default system alternatives
		boolean found = false;
		int counter = 0;
		while ((found == false) && (counter < this.defaultNames.size())) {
			retval = this.defaultNames.get(counter);
			found = checker.check(retval);
			counter++;
		} 
		if (found != true) {
			throw new ToolNotFound();
		}
		return retval;
	}

	private String getEmbeddedName() {
		String path = "platform:/plugin/" + Dictionary.pluginID + "/" + Dictionary.nusmvDir;
		String retval = path + "nusmv";
		String osname = System.getProperty("os.name");
		if (osname.contains("Windows")) {
			retval += "_win_";	
		} else if (osname.contains("Linux")) {
			retval += "_linux_";				
		}
		String bit = System.getProperty("sun.arch.data.model");
		retval += bit;
		return retval;
	}
}