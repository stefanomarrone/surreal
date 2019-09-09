package org.surreal.samgen.execution;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.surreal.common.utils.Utils;

public class ExecutionManager {
	
	protected String temporaryFileName;
	
	protected String toolname;
	
	protected String resultFileName;
	
	protected String prefix;
	
	protected IProject pj;
	
	public ExecutionManager(String tlnm, String tfn, String rfn) throws ToolNotFound {
		this.temporaryFileName = tfn;
		this.toolname = tlnm;
		this.resultFileName = rfn;
		this.prefix = "";
		this.pj = null;
		this.setPrefix();
	}

	public ExecutionManager(String tlnm, String tfn, String rfn, int bmclen) throws ToolNotFound {
		this.temporaryFileName = tfn;
		this.toolname = tlnm;
		this.resultFileName = rfn;
		this.prefix = "";
		this.pj = null;
		this.setPrefix();
	}

	public ExecutionManager(String tlnm) throws ToolNotFound {
		this.set(tlnm);
	}
	
	private void set(String tlnm) {
		Random generator = new Random();
		long seed = generator.nextInt();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String infix = dateFormat.format(date) + seed;
		this.temporaryFileName = "temp" + infix + ".smv";
		this.resultFileName = "temp" + infix + ".rslt";
		this.toolname = tlnm;
		this.prefix = "";
		this.pj = null;
		this.setPrefix();
	}

	public ExecutionManager() throws ToolNotFound {
		ToolFinder finder = new NusmvFinder(); 		
		String name = finder.getToolName();
		this.set(name);
	}

	public String execution(String model) throws Exception {
		this.prepare(model);
		String retval = this.execWrap();
		return retval;
	}

	protected String acquireResult() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(this.resultFileName));
		String retval = null;
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		reader.close();
		retval = stringBuilder.toString();
		return retval;
	}

	//OPEN implement meaningful postprocessing mechanisms
	protected String postprocess(String retval) {
		return retval;
	}

	protected String execWrap() throws IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(this.toolname,this.temporaryFileName);
		return this.execute(builder);
	}
	

	protected String execWrap(String toolName) throws IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(toolName);
		return this.execute(builder);
	}

	protected String execute(ProcessBuilder builder) throws IOException, InterruptedException {
		String result = "";
		builder.directory(Utils.getDir(this.pj));
		Process process = builder.start();
		process.waitFor();
		InputStream inputStream = process.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			result += line + '\n';
		}
		inputStream.close();
		bufferedReader.close();
		try {
			IFile rslt = Utils.genTemp(this.pj,this.resultFileName);
			InputStream stream = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));
			rslt.setContents(stream,true,false,null);
		} catch (CoreException e) {
		}
		return result;
	}

	protected void setPrefix() {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		String wpath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		this.prefix = "";
		int i = 0;
		while ((this.prefix.equals("")) && (i<projects.length)) {
			if (projects[i].isOpen()) {
				this.prefix = wpath + projects[i].toString().substring(1) + File.separator;
				this.pj = projects[i];
			}			
			i++;
		}				
	}
	
	protected void prepare(String payload) throws Exception {
		IFile temp = Utils.genTemp(this.pj,this.temporaryFileName);
		InputStream stream = new ByteArrayInputStream(payload.getBytes(StandardCharsets.UTF_8));
		temp.setContents(stream,true,false,null);
	}
}