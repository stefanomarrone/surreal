package org.surreal.engine.solver;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;

import org.eclipse.core.runtime.CoreException;

import xeus.jcl.JarClassLoader;
import xeus.jcl.JclObjectFactory;

public class SolverFactory {
	
	private static String packagename = "org.surreal.engine.solver.specific.";
	private ByteArrayInputStream bufferedJar;
	
	public Solver generate(URL uri) {
		DelegatingSolver retval = null;
		try {
			this.downloadJAR(uri);
		    String classname = this.getSolverClassName(uri);
		    JarClassLoader jcl = new JarClassLoader();
		    jcl.add(this.bufferedJar);
		    JclObjectFactory factory = JclObjectFactory.getInstance();
		    Object obj = null;
			obj = factory.create(jcl,classname);
		    retval = new DelegatingSolver(obj.getClass());
		} catch (IOException | CoreException | IllegalArgumentException | SecurityException | ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		return retval;
	}
	
	private String getSolverClassName(URL uri) {
		String retval = null;
		String base = uri.toString();
		int index = base.lastIndexOf(".");
		String solverPreamble = base.substring(0,index);
		int upCut = solverPreamble.lastIndexOf('/') + 1;
		retval = SolverFactory.packagename + solverPreamble.substring(upCut);
		return retval;
	}
	
	private void downloadJAR(URL fromUri) throws IOException, CoreException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		URLConnection conn = fromUri.openConnection();
		InputStream in = conn.getInputStream();
	    byte[] buffer = new byte[1024];
	    int numRead;
	    while ((numRead = in.read(buffer)) != -1) {
	        os.write(buffer, 0, numRead);
	    }
	    if (in != null) {
	        in.close();
	    }
		this.bufferedJar = new ByteArrayInputStream(os.toByteArray());
	}
}