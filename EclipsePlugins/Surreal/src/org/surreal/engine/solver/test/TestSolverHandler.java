package org.surreal.engine.solver.test;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.surreal.common.utils.Configuration;
import org.surreal.engine.Engine;
import org.surreal.engine.EngineFactory;
import org.surreal.engine.query.QueryInstantiationDocument;
import org.surreal.engine.results.ResultSet;
import org.surreal.survivabilityGui.tools.Resources;

public class TestSolverHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
        IStructuredSelection structuredSelection = Resources.getStructuredSelection( event );
        if ( structuredSelection.getFirstElement() instanceof IFile ) {
            IFile inputFile = ( IFile ) structuredSelection.getFirstElement();
            String modelfilename = inputFile.getLocation().toString();
            Configuration cfg = Configuration.generate();
            String repositoryUrl = cfg.get("url");
    		Engine e = EngineFactory.generate(repositoryUrl,modelfilename);
    		QIBindingWrapper wrapper = new QIBindingWrapper(); 
    		QueryInstantiationDocument qs = wrapper.getInstantiation();
    		ResultSet res = e.solve(qs);
    		String report = res.report();
    		System.out.println(report);
        }
        return null;
	}

}
