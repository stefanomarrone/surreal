/**
 * @author maria berenguer (from MASDES tool)
 *
 */

package org.surreal.survivabilityGui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.surreal.engine.Engine;
import org.surreal.engine.EngineFactory;
import org.surreal.engine.query.QueryInstantiationDocument;
import org.surreal.engine.results.ResultSet;
import org.surreal.survivabilityGui.gui.GuiPropertySelection;
import org.surreal.survivabilityGui.tools.ConsoleDisplayManager;
import org.surreal.survivabilityGui.tools.Resources;

public class HandlerGuiInitializer extends AbstractHandler {

    /* (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute( ExecutionEvent event ) 
            throws ExecutionException {
        ConsoleDisplayManager console = ConsoleDisplayManager.getDefault( Resources.CONSOLE_TITLE );
        console.clear();
 
//        if ( structuredSelection.getFirstElement() instanceof IFile ) {
//            IFile inputFile = ( IFile ) structuredSelection.getFirstElement();
//            String modelfilename = inputFile.getLocation().toString();
//    		Engine e = EngineFactory.generate(repositoryUrl,modelfilename);
//    		QIBindingWrapper wrapper = new QIBindingWrapper(); 
//    		QueryInstantiation qs = wrapper.getInstantiation();
//    		ResultSet res = e.solve(qs);
//    		String report = res.report();
//    		System.out.println(report);
//        }
        
        IStructuredSelection structuredSelection = Resources.getStructuredSelection( event );
        
        if ( structuredSelection.getFirstElement() instanceof IFile ) {
            
            IFile inputFile = ( IFile ) structuredSelection.getFirstElement();
            String inputFilePathString = inputFile.getLocation().toString();
            
            GuiPropertySelection.pathUmlFile = inputFilePathString;
            GuiPropertySelection.executionEvent = event;
            GuiPropertySelection.structuredSelection = structuredSelection;
            GuiPropertySelection.go();
            QueryInstantiationDocument qid = GuiPropertySelection.getDocument();            
			String report = null;
			if (qid.isEmpty()) {
				report = "No Query Selected!";
			} else {
				Engine eng = EngineFactory.generate(GuiPropertySelection.repository,inputFilePathString);
				ResultSet res = eng.solve(qid);
				report = res.report();					
			}				
            console.println(report,0);
        }
        
        return null;
    }


}
