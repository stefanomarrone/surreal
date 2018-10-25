package org.surreal.samgen.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;

public class Utils {

	public static String indent(String s, int indLvl) {
		String pad = "";
		for (int i = 0; i<indLvl; i++) {
			pad += "\t";
		}
		String temp = s.substring(0,s.length()-1);
		String retval = pad + temp.replace("\n", "\n" + pad) + '\n';
		return retval;
	}
	
	private static String marshalling(String n, String header) {
		return header + n;  
	}

	private static String unmarshalling(String total, String header) {
		String retval = total.startsWith(header) ? total.substring(header.length(),total.length()): total;
		return retval;
	}

	public static String parametrize(String n) {
		return Utils.marshalling(n,"p_");  
	}

	public static String unparametrize(String n) {
		return Utils.unmarshalling(n,"p_");  
	}

	public static String processorize(String n) {
		return Utils.marshalling(n,"proc_");  
	}

	public static String unprocessorize(String n) {
		return Utils.unmarshalling(n,"proc_");  
	}

	public static IResource genOutFile(IResource inRes) {
		IFile retval = null;
		String wpath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String rpath = ((IFile) inRes).getFullPath().toOSString();
		int slashIndex =  rpath.lastIndexOf(File.separator);
		String pname = inRes.getProject().getFullPath().toOSString() + File.separator;
		String fname = rpath.substring(slashIndex+1,rpath.length());
		String fnamemod = fname.replaceFirst("_in.uml","_out.uml");
		String dname =  new String(rpath.replaceAll(pname,""));
		dname = dname.replaceAll(fname,"");
		File f = new File(wpath + pname + dname + fnamemod);
		f.getParentFile().mkdirs(); 
		try {
			f.createNewFile();
			FileInputStream fi = new FileInputStream(f);
			retval = inRes.getProject().getFile(dname + fnamemod);
			if (!retval.exists()) {
				retval.create(fi, true, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}

	public static IFile genTemp(IProject ip, String filename) {
		IFile retval = ip.getFile(filename);
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		path += ip.getFullPath().toOSString() + File.separator;
		path += filename;
		File f = new File(path);
		f.getParentFile().mkdirs(); 
		try {
			f.createNewFile();
			FileInputStream fi = new FileInputStream(f);
			retval = ip.getFile(filename);
			if (!retval.exists()) {
				retval.create(fi, true, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retval;
	}

	public static File getDir(IProject ip) {
		String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		path += ip.getFullPath().toOSString() + File.separator;
		File f = new File(path);
		return f;
	}

}
