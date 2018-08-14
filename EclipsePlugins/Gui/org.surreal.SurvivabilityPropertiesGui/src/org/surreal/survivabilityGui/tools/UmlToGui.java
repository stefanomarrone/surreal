package org.surreal.survivabilityGui.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UmlToGui {

    /**
     * @param umlModel
     *          Source Uml Model to extract elements
     * @param umlType
     *          Indicates the type of the elements to return
     * @return 
     *          a collection of Named Elements that are directly children of umlModel, and are umlType
     */
    public static Collection<NamedElement> loadUmlOwnedElements( Model umlModel, EClassifier umlType ) {
        
        Collection<NamedElement> ownedElements = EcoreUtil.getObjectsByType( umlModel.getOwnedElements(), umlType );
        return ownedElements;
    }
    
       
    
    public static void initComboxWithStrings( JComboBox<String> cmbox, ArrayList<String> cmboxStrings ) {
        
        cmbox.removeAllItems();
        cmbox.addItem( Resources.EMPTY_STRING_CMBOX );
        Iterator<String> cmboxStr = cmboxStrings.iterator();
        while ( cmboxStr.hasNext() ) {
            cmbox.addItem( cmboxStr.next() );
        }
        cmbox.setSelectedIndex( 0 );
    }

    public static void initListWithStrings( JList<String> list, ArrayList<String> listStrings) {
    	
    	DefaultListModel<String> listModel = new DefaultListModel<String>();
    	listModel.addElement(Resources.EMPTY_STRING_CMBOX );
    	Iterator<String> listStr = listStrings.iterator();   	
    	while( listStr.hasNext()) {
    		listModel.addElement(listStr.next());
    	}    	
    	list.setModel(listModel);
    	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	list.setLayoutOrientation(JList.VERTICAL);
    	list.setVisibleRowCount(-1);
    	
    }
    
    /**
     * @return
     *      Model with all UML components
     */
    public static Model loadUmlModel( String pathUmlFile ) {
        
        URI typesUri = URI.createFileURI( pathUmlFile );
        ResourceSet set = new ResourceSetImpl();
        
        set.getPackageRegistry().put( UMLPackage.eNS_URI, UMLPackage.eINSTANCE );
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put( UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE );
        set.createResource( typesUri );
        Resource resource = set.getResource( typesUri, true );
        
        Model umlModel = ( Model ) EcoreUtil.getObjectByType( resource.getContents(), UMLPackage.Literals.MODEL );
        return umlModel;
    }
    
    
    public static ArrayList<String> filterElementsByStereotype( Collection<NamedElement> namedElements, String stName ) {
        
        Iterator<NamedElement> itElement = namedElements.iterator();
        
        ArrayList<String> elementNames = new ArrayList<String>();
        while ( itElement.hasNext()) {
            
            NamedElement namedElement = itElement.next();
            EList<Stereotype> stereotypes = namedElement.getAppliedStereotypes();
            if ( isStereotypeAppliedInElement( stereotypes, stName ) ) {
                
                elementNames.add( namedElement.getName() );
            }
        }
        
        return elementNames;
    }
    

    /**
     * @param listSt
     */
    public static boolean isStereotypeAppliedInElement( EList<Stereotype> stereotypes, String stName ) {
        
        if ( stereotypes.isEmpty() ) {
            return false;
        }
        Iterator<Stereotype> itStereotype = stereotypes.iterator();
        while ( itStereotype.hasNext() ) {
            
            String stereotypeName = itStereotype.next().getName();
            if ( stereotypeName.equals( stName ) ) {
                return true;
            }
        }
        return false;
    }
  
 
   public static ArrayList<String> getTaggedValuesFromStereotype( Collection<NamedElement> namedElements, String stName, String tgName ) {
        
        Iterator<NamedElement> itElement = namedElements.iterator();
        
        ArrayList<String> taggedValues = new ArrayList<String>();
        while ( itElement.hasNext()) {
            
        	NamedElement namedElement = itElement.next();
            
            EList<Stereotype> stereotypes = namedElement.getAppliedStereotypes();
            Iterator<Stereotype> itStereotype = stereotypes.iterator();
            while ( itStereotype.hasNext() ) {
                
            	Stereotype st = itStereotype.next();
                String stereotypeName = st.getName();
                if ( stereotypeName.equals( stName ) ) {
                	System.out.println("Find it");
                	String tgvalues = namedElement.getValue(st, tgName).toString();
                	//Parsing the string
                	Scanner scan = new Scanner(tgvalues);
                	scan.useDelimiter(Resources.TAG_DELIMITER);
                	while (scan.hasNext()) {
                		String tgvalue = scan.next();
                	    taggedValues.add( tgvalue ); 
                	}
                	scan.close();
                	
                }  		   
            
        	}
        }
        
		return taggedValues;
    }
 
    
    /**
     * @param umlModel
     *          Model with all UML components
     * @return 
     */
    public static ArrayList<String> getCollectionNames( Collection<NamedElement> collection ) {
        
        Iterator<NamedElement> element = collection.iterator();
        
        ArrayList<String> elementNames = new ArrayList<String>();
        while ( element.hasNext()) {
            
            NamedElement namedElement = element.next();
            elementNames.add( namedElement.getName() );
        }
        
        return elementNames;
    }
}
