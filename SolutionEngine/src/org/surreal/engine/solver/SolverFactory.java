package org.surreal.engine.solver;

import java.net.URL;
import java.net.URLClassLoader;

public class SolverFactory {
	
	public static Solver generate(URL uri) {
		DelegateSolver retval = null;
		try {
		    URL[] urls = new URL[]{uri};
		    URLClassLoader loader = URLClassLoader.newInstance(urls);
		    Class<?> s = loader.loadClass("org.surreal.engine.solver.specific.FakeSolver");
		    retval = new DelegateSolver(s);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		return retval;
	}
}