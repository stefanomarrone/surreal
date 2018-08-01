package engine.solver;

import java.net.URL;
import java.net.URLClassLoader;

public class SolverFactory {
	
	public static Solver generate(URL uri) {
		DelegateSolver retval = null;
		try {
		    URL[] urls = new URL[]{uri};
		    URLClassLoader loader = URLClassLoader.newInstance(urls);
//		    boolean stop = false;
//		    InputStream is;
//			try {
//				is = fakeuri.openStream();
//				JarInputStream jfile = new JarInputStream(is);
//				while (stop == false) {
//					JarEntry je = jfile.getNextJarEntry();
//					stop = true;
//					if (je != null) {
//						stop = false;
//						if ((je.getName().endsWith(".class"))) {
//							String className = je.getName().replaceAll("/", "\\.");
//							String myClass = className.substring(0, className.lastIndexOf('.'));
//							System.out.println(">>" + myClass);
//						}
//					}
//				} 
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		    Class<?> s = loader.loadClass("engine.specific.FakeSolver");
		    retval = new DelegateSolver(s);
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		return retval;
	}
}