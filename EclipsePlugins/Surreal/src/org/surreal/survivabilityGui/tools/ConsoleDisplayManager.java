package org.surreal.survivabilityGui.tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
 
/**
 * Create an instance of this class in any of your plugin classes.
 * Source: http://www.eclipsezone.com/eclipse/forums/t52910.html
 * 
 * Use it as follows ...
 * 
 * ConsoleDisplayMgr.getDefault().println("Some error msg", ConsoleDisplayMgr.MSG_ERROR);
 * ...
 * ...
 * ConsoleDisplayMgr.getDefault().clear();
 * ...  
 */
public class ConsoleDisplayManager
{
    // Message types
    public static final int MSG_TYPE_INFORMATION = 1;
    public static final int MSG_TYPE_ERROR = 2;
    public static final int MSG_TYPE_WARNING = 3;
    public static final int MSG_TYPE_LOG = 4;
    
    // Message tyexts
    public static final String MSG_TEXT_INFORMATION = "INFO: ";
    public static final String MSG_TEXT_ERROR = "ERROR: ";
    public static final String MSG_TEXT_WARNING = "WARNING: ";
    
    // Color messages
    public static final int COLOR_INFORMATION = SWT.COLOR_DARK_GREEN;
    public static final int COLOR_ERROR = SWT.COLOR_DARK_MAGENTA;
    public static final int COLOR_WARNING = SWT.COLOR_DARK_YELLOW;
    public static final int COLOR_LOG = SWT.COLOR_DARK_GRAY;
    
    
    private static ConsoleDisplayManager fDefault = null;

    private String fTitle = null;
    private MessageConsole fMessageConsole = null;
        
    
    private static void setfDefault( ConsoleDisplayManager fDefault ) {
        
        ConsoleDisplayManager.fDefault = fDefault;
    }


    private static ConsoleDisplayManager getfDefault() {
        
        return fDefault;
    }
    
    
    private void setfTitle( String fTitle ) {
        
        this.fTitle = fTitle;
    }
    
    
    public ConsoleDisplayManager( String messageTitle ) {
        
        setfDefault( this );
        setfTitle( messageTitle );
    }
    
    
    public static ConsoleDisplayManager getDefault() {
        
        return getfDefault();
    }   
    

    public static ConsoleDisplayManager getDefault( String messageTitle ) {
        
        ConsoleDisplayManager defaultConsole = getfDefault();
        
        if ( defaultConsole == null ) {
            defaultConsole = new ConsoleDisplayManager( messageTitle );
        }
            
        return getfDefault();
    } 
    
    
    public void println( String message, int messageKind ) {
        
        if( message == null ) return;
        
        /* if console-view in Java-perspective is not active, then show it and
         * then display the message in the console attached to it */        
        if( !displayConsoleView() )
        {
            /* If an exception occurs while displaying in the console, then just display 
             * at least the same in a message-box */
            MessageDialog.openError( 
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
                    "Error", 
                    message 
            );
            return;
        }
        
        /* display message on console */    
        getNewMessageConsoleStream( messageKind ).println( message );               
    }
    
    
    public void println( String[] messages, int messageKind ) {
        
        if( messages == null ) return;
        
        StringBuilder builder = new StringBuilder();
        
        for( String message : messages ) {
            builder.append( message + "\n");
        }
        
        this.println( builder.toString(), messageKind );
    }
    
    
    public void printFile( String file ) {
        
        try {
            BufferedReader buffer = new BufferedReader( new FileReader( file ) );
            String line = buffer.readLine();
            while ( line != null ) {
                this.println( line, ConsoleDisplayManager.MSG_TYPE_LOG );
                line = buffer.readLine();
            }
            buffer.close();
        } catch ( FileNotFoundException e ) {
            
            String[] errorMessage = { 
                    "FileNotFoundException",
                    e.getMessage(), 
                    e.getStackTrace().toString() 
            };
            this.println( errorMessage, ConsoleDisplayManager.MSG_TYPE_ERROR );
        } catch (IOException e) {
            
            String[] errorMessage = { 
                    "IOException",
                    e.getMessage(), 
                    e.getStackTrace().toString() 
            };
            this.println( errorMessage, ConsoleDisplayManager.MSG_TYPE_ERROR );
        }
    }
    
    public void clear() {  
        
        IDocument document = getMessageConsole().getDocument();
        if ( document != null ) {
            document.set( "" );
        }           
    }   
        
    
    private boolean displayConsoleView() {
        
        try {
            IWorkbenchWindow activeWorkbenchWindow = 
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            if ( activeWorkbenchWindow != null ) {
                
                IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
                if ( activePage != null )
                    activePage.showView(
                            IConsoleConstants.ID_CONSOLE_VIEW, 
                            null, 
                            IWorkbenchPage.VIEW_VISIBLE
                );
            }
            
        } catch ( PartInitException partEx ) {            
            return false;
        }
        
        return true;
    }
    
    
    private MessageConsoleStream getNewMessageConsoleStream( int messageKind ) {
        
        int swtColorId = COLOR_INFORMATION;
        String swtMessageType = "";
        
        switch ( messageKind )
        {
            case MSG_TYPE_INFORMATION:
                swtColorId = COLOR_INFORMATION;
                swtMessageType = MSG_TEXT_INFORMATION;
                break;
            case MSG_TYPE_ERROR:
                swtColorId = COLOR_ERROR;
                swtMessageType = MSG_TEXT_ERROR;
                break;
            case MSG_TYPE_WARNING:
                swtColorId = COLOR_WARNING;
                swtMessageType = MSG_TEXT_WARNING;
                break;
            case MSG_TYPE_LOG:
                swtColorId = COLOR_LOG;
                break;
            default:
        }   
        
        MessageConsoleStream msgConsoleStream = getMessageConsole().newMessageStream();     
        msgConsoleStream.setColor( Display.getCurrent().getSystemColor( swtColorId ) );
        msgConsoleStream.print( swtMessageType );
        return msgConsoleStream;
    }
    
    
    private MessageConsole getMessageConsole() {
        
        if( this.fMessageConsole == null )
            createMessageConsoleStream( this.fTitle ); 
        
        return this.fMessageConsole;
    }
        
    
    private void createMessageConsoleStream( String title ) {
        
        this.fMessageConsole = new MessageConsole( title, null ); 
        ConsolePlugin.getDefault().getConsoleManager().addConsoles(
                new IConsole[]{ this.fMessageConsole }
        );
    }
    
}
