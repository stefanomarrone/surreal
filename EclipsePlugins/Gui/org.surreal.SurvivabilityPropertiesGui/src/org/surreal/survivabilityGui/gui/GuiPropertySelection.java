/**
 * @author simona bernardi
 * Code rearranged from MASDES analyzer tool
 */

package org.surreal.survivabilityGui.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.surreal.survivabilityGui.tools.UmlToGui;
import org.surreal.survivabilityGui.tools.Resources;


@SuppressWarnings("serial")
public class GuiPropertySelection extends JFrame {
	
	public static String pathUmlFile;
	public static ExecutionEvent executionEvent;
	public static IStructuredSelection structuredSelection;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPropertySelection frame = new GuiPropertySelection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiPropertySelection() {
		
		setTitle("Survivability properties verification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 550, 955, 858);
		getContentPane().setLayout(null);
		
		//Loads the selected UML model
		final Model umlModel = UmlToGui.loadUmlModel( GuiPropertySelection.pathUmlFile );

		// Retrieve uses cases from the UML model
        final Collection<NamedElement> useCases = UmlToGui.loadUmlOwnedElements( umlModel, UMLPackage.Literals.USE_CASE );
       
        // Select misuse,and strategy use cases
        ArrayList<String> ucNamesMisuse = UmlToGui.filterElementsByStereotype( useCases, Resources.ST_MISUSE );
        ArrayList<String> ucNamesRecovery = UmlToGui.filterElementsByStereotype( useCases, Resources.ST_RECOVERY );
        ArrayList<String> ucNamesResistance = UmlToGui.filterElementsByStereotype( useCases, Resources.ST_RESISTANCE );
        ArrayList<String> ucNamesRecognition = UmlToGui.filterElementsByStereotype( useCases, Resources.ST_RECOGNITION );
        ArrayList<String> ucNamesStrategy = ucNamesRecovery;       
        ucNamesStrategy.addAll( ucNamesResistance );
        ucNamesStrategy.addAll( ucNamesRecognition );

        // Retrieve constraints from the UML model
        final Collection<NamedElement> constr = UmlToGui.loadUmlOwnedElements( umlModel, UMLPackage.Literals.CONSTRAINT );
        
        // Select ServiceModesDefinition constraints
        ArrayList<String> serviceModes = UmlToGui.getTaggedValuesFromStereotype( constr, Resources.ST_SERVICEMODEDEF, Resources.TAG_FORMULA );
		
        // Security level group: presentation the third one (at the bottom)
		JLabel lblSecLevel = new JLabel("Security Level");
		lblSecLevel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblSecLevel.setBounds(6, 548, 116, 16);
		getContentPane().add(lblSecLevel);
		
		// P1:Reversibility
		JCheckBox chckbxP1 = new JCheckBox("It is always possible to recover to the service mode");
		chckbxP1.setBounds(6, 588, 378, 23);
		getContentPane().add(chckbxP1);
		
		JComboBox<String> comboBox1 = new JComboBox<String>();
		comboBox1.setBounds(373, 588, 153, 27);
		getContentPane().add(comboBox1);
		
		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox1, serviceModes );

        //P2: Reversibility stronger
		JCheckBox chckbxP2 = new JCheckBox("It is always possible to recover to the service mode");
		chckbxP2.setBounds(6, 623, 378, 23);
		getContentPane().add(chckbxP2);

		JComboBox<String> comboBox2 = new JComboBox<String>();
		comboBox2.setBounds(373, 623, 153, 27);
		getContentPane().add(comboBox2);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox2, serviceModes );

		JLabel lbl2 = new JLabel("without further degradation.");
		lbl2.setBounds(528, 627, 191, 16);
		getContentPane().add(lbl2);
		
		//P3: Recoverability
		JCheckBox chckbxP3 = new JCheckBox("It is always possible to recover to the service mode");
		chckbxP3.setBounds(6, 662, 378, 23);
		getContentPane().add(chckbxP3);
		
		JComboBox<String> comboBox3_1 = new JComboBox<String>();
		comboBox3_1.setBounds(373, 658, 153, 27);
		getContentPane().add(comboBox3_1);	

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox3_1, serviceModes );
		
		JLabel lbl3 = new JLabel("from");
		lbl3.setBounds(528, 666, 41, 16);
		getContentPane().add(lbl3);

		JComboBox<String> comboBox3_2 = new JComboBox<String>();
		comboBox3_2.setBounds(576, 662, 153, 27);
		getContentPane().add(comboBox3_2);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox3_2, serviceModes );

		//P4: Recoverability stronger
		JCheckBox chckbxP4 = new JCheckBox("It is always possible to recover to the service mode");
		chckbxP4.setBounds(6, 697, 378, 23);
		getContentPane().add(chckbxP4);

		JComboBox<String> comboBox4_1 = new JComboBox<String>();
		comboBox4_1.setBounds(373, 697, 153, 27);
		getContentPane().add(comboBox4_1);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox4_1, serviceModes );

		JLabel lbl4_1 = new JLabel("from");
		lbl4_1.setBounds(528, 701, 41, 16);
		getContentPane().add(lbl4_1);
		
		JComboBox<String> comboBox4_2 = new JComboBox<String>();
		comboBox4_2.setBounds(576, 697, 153, 27);
		getContentPane().add(comboBox4_2);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox4_2, serviceModes );

		JLabel lbl4_2 = new JLabel("without degradation.");
		lbl4_2.setBounds(743, 701, 138, 16);
		getContentPane().add(lbl4_2);
		
		//Threats group: presentation the first one (at the top)
		JLabel lblThreats = new JLabel("Threats");
		lblThreats.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblThreats.setBounds(6, 25, 61, 16);
		getContentPane().add(lblThreats);
		
		//P5: Threat consequence (single occurrence)
		JCheckBox checkBox5 = new JCheckBox("Does a single occurrence of");
		checkBox5.setBounds(6, 65, 220, 23);
		getContentPane().add(checkBox5);
		
		JComboBox<String> comboBox5 = new JComboBox<String>();
		comboBox5.setBounds(223, 65, 153, 27);
		getContentPane().add(comboBox5);
	
	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox5, ucNamesMisuse );

		JLabel lbl5 = new JLabel("provoke a system degradation?");
		lbl5.setBounds(400, 69, 212, 16);
		getContentPane().add(lbl5);
		    
		//P6: Threat consequence (multiple occurrences)
		JCheckBox checkBox6 = new JCheckBox("Does multiple occurrences of");
		checkBox6.setBounds(6, 100, 220, 23);
		getContentPane().add(checkBox6);
		
		JComboBox<String> comboBox6 = new JComboBox<String>();
		comboBox6.setBounds(223, 100, 153, 27);
		getContentPane().add(comboBox6);
	    
		// Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox6, ucNamesMisuse );
	
		JLabel lbl6 = new JLabel("provoke a system degradation?");
		lbl6.setBounds(400, 104, 212, 16);
		getContentPane().add(lbl6);
		
		//P7: Security level threat impact (single occurrence)
		JCheckBox checkBox7 = new JCheckBox("Given the fully operational service mode, which is the service mode reached by a single occurrence of");
		checkBox7.setBounds(6, 135, 687, 23);
		getContentPane().add(checkBox7);
		
		JComboBox<String> comboBox7 = new JComboBox<String>();
		comboBox7.setBounds(705, 135, 153, 27);
		getContentPane().add(comboBox7);

	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox7, ucNamesMisuse );

		JLabel lbl7 = new JLabel("?");
		lbl7.setBounds(864, 137, 21, 16);
		getContentPane().add(lbl7);

		//P8: Security level threat impact (multiple occurrences)
		JCheckBox checkBox8 = new JCheckBox("Given the fully operational service mode, which is the service mode reached by multiple occurrences of");
		checkBox8.setBounds(6, 168, 687, 23);
		getContentPane().add(checkBox8);
		
		JComboBox<String> comboBox8 = new JComboBox<String>();
		comboBox8.setBounds(699, 168, 153, 27);
		getContentPane().add(comboBox8);

	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox8, ucNamesMisuse );

		JLabel lbl8 = new JLabel("?");
		lbl8.setBounds(864, 172, 21, 16);
		getContentPane().add(lbl8);

		//P9: Threat scenario
		JCheckBox checkBox9 = new JCheckBox("Given the fully operational service mode, which is the smallest set of misuses that leads to the service mode");
		checkBox9.setBounds(6, 203, 723, 23);
		getContentPane().add(checkBox9);
		
		JComboBox<String> comboBox9 = new JComboBox<String>();
		comboBox9.setBounds(722, 203, 153, 27);
		getContentPane().add(comboBox9);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox9, serviceModes );

		JLabel lbl9 = new JLabel("?");
		lbl9.setBounds(889, 207, 21, 16);
		getContentPane().add(lbl9);

		//Mitigation group: presentation the second one (in the middle)
		JLabel lblMitigation = new JLabel("Mitigation");
		lblMitigation.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblMitigation.setBounds(6, 248, 93, 23);
		getContentPane().add(lblMitigation);
		
		//P10: 	Recovery feasibility	
		JCheckBox checkBox10 = new JCheckBox("The strategy");
		checkBox10.setBounds(6, 288, 116, 23);
		getContentPane().add(checkBox10);
		
		JComboBox<String> comboBox10 = new JComboBox<String>();
		comboBox10.setBounds(134, 288, 153, 27);
		getContentPane().add(comboBox10);
		
	    // Initialize comboBox with strategies
        UmlToGui.initComboxWithStrings( comboBox10, ucNamesStrategy );

		JLabel lbl10 = new JLabel("is needed.");
		lbl10.setBounds(299, 292, 104, 16);
		getContentPane().add(lbl10);
		
		//P11: Multiple recovery feasibility
		JCheckBox checkBox11 = new JCheckBox("The strategies");
		checkBox11.setBounds(6, 323, 131, 23);
		getContentPane().add(checkBox11);		
		
		JScrollPane scrollPane11 = new JScrollPane();
		scrollPane11.setBounds(135, 327, 225, 40);
		getContentPane().add(scrollPane11);
		JList<String> list11 = new JList<String>();		
		// Initialize list with strategies
        UmlToGui.initListWithStrings( list11,  ucNamesStrategy );
		scrollPane11.setViewportView(list11);

		JLabel lbl11 = new JLabel("are always needed together.");
		lbl11.setBounds(372, 327, 184, 16);
		getContentPane().add(lbl11);
		
		//P12: Recovery mutual exclusion
		JCheckBox checkBox12 = new JCheckBox("The strategies");
		checkBox12.setBounds(6, 379, 131, 23);
		getContentPane().add(checkBox12);

		JScrollPane scrollPane12 = new JScrollPane();
		scrollPane12.setBounds(135, 379, 225, 40);
		getContentPane().add(scrollPane12);
		JList<String> list12 = new JList<String>();	
		// Initialize list with strategies
        UmlToGui.initListWithStrings( list12,  ucNamesStrategy );
		scrollPane12.setViewportView(list12);

		JLabel lbl12 = new JLabel("are never enabled together.");
		lbl12.setBounds(372, 383, 184, 16);
		getContentPane().add(lbl12);
		
		//P13: Threat/recovery effectiveness
		JCheckBox checkBox13 = new JCheckBox("Is the strategy");
		checkBox13.setBounds(6, 434, 122, 23);
		getContentPane().add(checkBox13);
		
		JComboBox<String> comboBox13_1 = new JComboBox<String>();
		comboBox13_1.setBounds(135, 434, 153, 27);
		getContentPane().add(comboBox13_1);
		
	    // Initialize comboBox with strategies
        UmlToGui.initComboxWithStrings( comboBox13_1, ucNamesStrategy );

		JLabel lbl13_1 = new JLabel("effective to mitigate the threat");
		lbl13_1.setBounds(302, 438, 205, 16);
		getContentPane().add(lbl13_1);
		
		JComboBox<String> comboBox13_2 = new JComboBox<String>();
		comboBox13_2.setBounds(506, 434, 153, 27);
		getContentPane().add(comboBox13_2);
		
	    // Initialize comboBox with misuses
        UmlToGui.initComboxWithStrings( comboBox13_2, ucNamesMisuse );

		JLabel lbl13_2 = new JLabel("?");
		lbl13_2.setBounds(671, 438, 21, 16);
		getContentPane().add(lbl13_2);
		
		//P14: Best set of strategies in a service mode
		JCheckBox checkBox14 = new JCheckBox("Among the feasible strategies in service mode");
		checkBox14.setBounds(6, 469, 323, 23);
		getContentPane().add(checkBox14);
		
		JComboBox<String> comboBox14 = new JComboBox<String>();
		comboBox14.setBounds(329, 469, 153, 27);
		getContentPane().add(comboBox14);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox14, serviceModes );

		JLabel lbl14 = new JLabel("which is the smallest set of strategies that leads to the full operational service mode?");
		lbl14.setBounds(32, 504, 558, 16);
		getContentPane().add(lbl14);
		
		//The button that launches the checker
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(409, 744, 117, 29);
		getContentPane().add(btnCheck);		
		
	}
		
}
