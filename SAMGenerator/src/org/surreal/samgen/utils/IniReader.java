package org.surreal.samgen.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class IniReader {
    /**
     * Oggetto property 
     */
    private Properties propertyFile;

    /**
     * Costruttore
     * @param newFileName nome del file .ini
     * @throws FileNotFoundException
     * @throws IOException
     */
    public IniReader(String newFileName) throws FileNotFoundException, IOException {
        Properties p = new Properties();
        p.load(new FileInputStream(newFileName));
        propertyFile = p;
    }

    public IniReader(IResource resource) throws IOException, CoreException {
    	IFile ifile = (IFile) resource;
        Properties p = new Properties();
        p.load(ifile.getContents());
        propertyFile = p;
    }

    /**
     * Ritorna il valore desiderato
     * @param propName proprieta' di cui si vuole cercare il valore nel .ini
     * @return valore della proprieta' se esiste nel .ini, null altrimenti
     */
    public String get(String propName) {
        return propertyFile.getProperty(propName);
    }

    public boolean test(String propName) {
    	boolean retval = propertyFile.keySet().contains(propName);
        return retval; 
    }
}