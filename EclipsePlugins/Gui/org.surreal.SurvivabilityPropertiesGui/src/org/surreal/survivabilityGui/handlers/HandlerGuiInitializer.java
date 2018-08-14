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

import org.surreal.survivabilityGui.gui.GuiPropertySelection;
import org.surreal.survivabilityGui.tools.ConsoleDisplayManager;
import org.surreal.survivabilityGui.tools.Resources;

public class HandlerGuiInitializer extends AbstractHandler {

    public static String[] models;
    /**
     * 
     */
    public HandlerGuiInitializer() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    @Override
    public Object execute( ExecutionEvent event ) 
            throws ExecutionException {
        
        ConsoleDisplayManager console = ConsoleDisplayManager.getDefault( Resources.CONSOLE_TITLE );
        console.clear();
        
        IStructuredSelection structuredSelection = Resources.getStructuredSelection( event );
        
        if ( structuredSelection.getFirstElement() instanceof IFile ) {
            
            IFile inputFile = ( IFile ) structuredSelection.getFirstElement();
            String inputFilePathString = inputFile.getLocation().toString();
            
            GuiPropertySelection.pathUmlFile = inputFilePathString;
            GuiPropertySelection.executionEvent = event;
            GuiPropertySelection.structuredSelection = structuredSelection;
            GuiPropertySelection.main( null );
        }
        
        return null;
    }


}
