package org.surreal.survivabilityGui.tools;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class Resources  {

    public static final String EMPTY_STRING_CMBOX = "";
    public static final String ST_MISUSE = "misuse";
    public static final String ST_RECOGNITION = "recognition";
    public static final String ST_RECOVERY = "recovery";
    public static final String ST_RESISTANCE = "resistance";
    public static final String ST_SERVICEMODEDEF = "ServiceModeDefinition";
    public static final String TAG_FORMULA = "formula";
    public static final String TAG_DELIMITER = "\\),";
       
	public static final String CONSOLE_TITLE = "Survivability Properties Checker";
	
	
	  /**
     * @param event
     * @return
     * @throws ExecutionException
     */
    public static IStructuredSelection getStructuredSelection( ExecutionEvent event )
        throws ExecutionException {
        
        // get workbench window
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
        // set selection service
        ISelectionService service = window.getSelectionService();
        // set structured selection
        IStructuredSelection structured = ( IStructuredSelection ) service.getSelection();
        return structured;
    }
  
}
