/**
 * @author simona bernardi
 * Code rearranged from MASDES analyzer tool
 */

package org.surreal.survivabilityGui.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.surreal.common.utils.Configuration;
import org.surreal.engine.Engine;
import org.surreal.engine.EngineFactory;
import org.surreal.engine.query.QueryInstantiationDocument;
import org.surreal.engine.results.ResultSet;
import org.surreal.survivabilityGui.tools.Resources;
import org.surreal.survivabilityGui.tools.UmlToGui;

@SuppressWarnings("serial")
public class GuiPropertySelection extends JFrame {
	
	public static String pathUmlFile;
	public static ExecutionEvent executionEvent;
	public static IStructuredSelection structuredSelection;
	public static GuiQIData data;
	private static QueryInstantiationDocument document;
	public static boolean flag;
	public static String repository = "http://localhost:8081/repository.json";
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GuiPropertySelection frame = new GuiPropertySelection();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public GuiPropertySelection() {
        Configuration cfg = Configuration.generate();
        GuiPropertySelection.repository = cfg.get("url");

		GuiPropertySelection.data = new GuiQIData();
		GuiQIElement tempQIDE = null;
		
		setTitle("Survivability properties verification");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setUndecorated(true);
		setBounds(100, 550, 1050, 858);
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

        // Stefano - commented section START
        // Retrieve constraints from the UML model
        // Select ServiceModesDefinition constraints
        ArrayList<String> serviceModes = UmlToGui.getServiceModes(umlModel);
        // Stefano - commented section END

        // These are the parameters for visualizing the GUI
        int ySecurityGroup = 25;
        int yThreatGroup = 248;
		int yMitigationGroup = 500;
		int visibilityOffset = 6;

        // Security level group
		JLabel lblSecLevel = new JLabel("Security Level");
		lblSecLevel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblSecLevel.setBounds(6, ySecurityGroup, 150, 16);
		getContentPane().add(lblSecLevel);
		
		// P1:Reversibility
		JCheckBox chckbxP1 = new JCheckBox("(P1) It is always possible to recover to the service mode");
		ySecurityGroup += 40;
		chckbxP1.setBounds(6, ySecurityGroup, 430-visibilityOffset, 23);
		getContentPane().add(chckbxP1);		
		ComboDataProvider comboBox1 = new ComboDataProvider();
		comboBox1.setBounds(430, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox1);		
		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox1, serviceModes );
        // Saving meaningful features
        tempQIDE = new GuiQIElement("P1",chckbxP1);
        tempQIDE.addParam("SM",comboBox1);
        GuiPropertySelection.data.addElement(tempQIDE);
        

        //P2: Reversibility stronger
		JCheckBox chckbxP2 = new JCheckBox("(P2) It is always possible to recover to the service mode");
		ySecurityGroup += 40;
		chckbxP2.setBounds(6, ySecurityGroup, 430-visibilityOffset, 23);
		getContentPane().add(chckbxP2);
		ComboDataProvider comboBox2 = new ComboDataProvider();
		comboBox2.setBounds(430, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox2);
		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox2, serviceModes );
        // ending the property
		JLabel lbl2 = new JLabel("without further degradation.");
		lbl2.setBounds(430+140, ySecurityGroup, 230-visibilityOffset, 16);
		getContentPane().add(lbl2);
        // Saving meaningful features
        tempQIDE = new GuiQIElement("P2",chckbxP2);
        tempQIDE.addParam("SM",comboBox2);
        GuiPropertySelection.data.addElement(tempQIDE);

		//P3: Recoverability
		JCheckBox chckbxP3 = new JCheckBox("(P3) It is always possible to recover to the service mode");
		ySecurityGroup += 40;
		chckbxP3.setBounds(6, ySecurityGroup, 430-visibilityOffset, 23);
		getContentPane().add(chckbxP3);
		ComboDataProvider comboBox3_1 = new ComboDataProvider();
		comboBox3_1.setBounds(430, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox3_1);	
		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox3_1, serviceModes );
		// continue...
		JLabel lbl3 = new JLabel("from");
		lbl3.setBounds(430 + 140, ySecurityGroup, 40-visibilityOffset, 16);
		getContentPane().add(lbl3);
		ComboDataProvider comboBox3_2 = new ComboDataProvider();
		comboBox3_2.setBounds(430 + 140 + 40, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox3_2);
		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox3_2, serviceModes );
        // Saving meaningful features
        tempQIDE = new GuiQIElement("P3",chckbxP3);
        tempQIDE.addParam("DegradedState",comboBox3_1);
        tempQIDE.addParam("WorserDegradedState",comboBox3_2);
        GuiPropertySelection.data.addElement(tempQIDE);


		//P4: Recoverability stronger
		JCheckBox chckbxP4 = new JCheckBox("(P4) It is always possible to recover to the service mode");
		ySecurityGroup += 40;
		chckbxP4.setBounds(6, ySecurityGroup, 430-visibilityOffset, 23);
		getContentPane().add(chckbxP4);
		ComboDataProvider comboBox4_1 = new ComboDataProvider();
		comboBox4_1.setBounds(430, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox4_1);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox4_1, serviceModes );

		JLabel lbl4_1 = new JLabel("from");
		lbl4_1.setBounds(430 + 140, ySecurityGroup, 40-visibilityOffset, 16);
		getContentPane().add(lbl4_1);
		ComboDataProvider comboBox4_2 = new ComboDataProvider();
		comboBox4_2.setBounds(430 + 140 + 40, ySecurityGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox4_2);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox4_2, serviceModes );

		JLabel lbl4_2 = new JLabel("without degradation.");
		lbl4_2.setBounds(430 + 140 + 40 + 140, ySecurityGroup, 170-visibilityOffset, 16);
		getContentPane().add(lbl4_2);
		
		// Saving meaningful features
        tempQIDE = new GuiQIElement("P4",chckbxP4);
        tempQIDE.addParam("DegradedState",comboBox4_1);
        tempQIDE.addParam("WorserDegradedState",comboBox4_2);
        GuiPropertySelection.data.addElement(tempQIDE);

		
		
		//Threats group
		JLabel lblThreats = new JLabel("Threats");
		lblThreats.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblThreats.setBounds(6, yThreatGroup, 80-visibilityOffset, 16);
		getContentPane().add(lblThreats);
		
		//P5: Threat consequence (single occurrence)
		JCheckBox checkBox5 = new JCheckBox("(P5) Does a single occurrence of");
		yThreatGroup += 40;
		checkBox5.setBounds(6, yThreatGroup, 270-visibilityOffset, 23);
		getContentPane().add(checkBox5);
		
		ComboDataProvider comboBox5 = new ComboDataProvider();
		comboBox5.setBounds(270, yThreatGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox5);
	
	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings(comboBox5,ucNamesMisuse );

		JLabel lbl5 = new JLabel("provoke a system degradation?");
		lbl5.setBounds(270 + 140, yThreatGroup, 240-visibilityOffset, 16);
		getContentPane().add(lbl5);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P5",checkBox5);
        tempQIDE.addParam("M",comboBox5);
        GuiPropertySelection.data.addElement(tempQIDE);

		//P6: Threat consequence (multiple occurrences)
		JCheckBox checkBox6 = new JCheckBox("(P6) Does multiple occurrences of");
		yThreatGroup += 40;
		checkBox6.setBounds(6, yThreatGroup, 270-visibilityOffset, 23);
		getContentPane().add(checkBox6);
		
		ComboDataProvider comboBox6 = new ComboDataProvider();
		comboBox6.setBounds(270, yThreatGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox6);
	    
		// Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox6, ucNamesMisuse );
	
		JLabel lbl6 = new JLabel("provoke a system degradation?");
		lbl6.setBounds(270 + 140, yThreatGroup, 240-visibilityOffset, 16);
		getContentPane().add(lbl6);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P6",checkBox6);
        tempQIDE.addParam("M",comboBox6);
        GuiPropertySelection.data.addElement(tempQIDE);

		//P7: Security level threat impact (single occurrence)
		JCheckBox checkBox7 = new JCheckBox("(P7) Given the fully operational service mode, which is the service mode reached by a single occurrence of");
		yThreatGroup += 40;
		checkBox7.setBounds(6, yThreatGroup, 800-visibilityOffset, 23);
		getContentPane().add(checkBox7);
		
		ComboDataProvider comboBox7 = new ComboDataProvider();
		comboBox7.setBounds(800, yThreatGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox7);

	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox7, ucNamesMisuse );

		JLabel lbl7 = new JLabel("?");
		lbl7.setBounds(800 + 140, yThreatGroup, 21-visibilityOffset, 16);
		getContentPane().add(lbl7);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P7",checkBox7);
        tempQIDE.addParam("M",comboBox7);
        GuiPropertySelection.data.addElement(tempQIDE);

        //P8: Security level threat impact (multiple occurrences)
		JCheckBox checkBox8 = new JCheckBox("(P8) Given the fully operational service mode, which is the service mode reached by multiple occurrences of");
		yThreatGroup += 40;
		checkBox8.setBounds(6, yThreatGroup, 800-visibilityOffset, 23);
		getContentPane().add(checkBox8);
		
		ComboDataProvider comboBox8 = new ComboDataProvider();
		comboBox8.setBounds(800, yThreatGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox8);

	    // Initialize comboBox with misuse cases
        UmlToGui.initComboxWithStrings( comboBox8, ucNamesMisuse );

		JLabel lbl8 = new JLabel("?");
		lbl8.setBounds(800 + 140, yThreatGroup, 21-visibilityOffset, 16);
		getContentPane().add(lbl8);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P8",checkBox8);
        tempQIDE.addParam("M",comboBox8);
        GuiPropertySelection.data.addElement(tempQIDE);

		//P9: Threat scenario
		JCheckBox checkBox9 = new JCheckBox("(P9) Given the fully operational service mode, which is the smallest set of misuses that leads to the service mode");
		yThreatGroup += 40;
		checkBox9.setBounds(6, yThreatGroup, 840-visibilityOffset, 23);
		getContentPane().add(checkBox9);
		
		ComboDataProvider comboBox9 = new ComboDataProvider();
		comboBox9.setBounds(840, yThreatGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox9);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox9, serviceModes );

		JLabel lbl9 = new JLabel("?");
		lbl9.setBounds(830 + 140 + 10, yThreatGroup, 21-visibilityOffset, 16);
		getContentPane().add(lbl9);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P9",checkBox9);
        tempQIDE.addParam("DegradedState",comboBox9);
        GuiPropertySelection.data.addElement(tempQIDE);
		

        
		//Mitigation group
		JLabel lblMitigation = new JLabel("Mitigation");
		lblMitigation.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblMitigation.setBounds(6, yMitigationGroup , 100-visibilityOffset, 23);
		getContentPane().add(lblMitigation);
		
		//P10: 	Recovery feasibility	
		JCheckBox checkBox10 = new JCheckBox("(P10) The strategy");
		yMitigationGroup += 40;
		checkBox10.setBounds(6, yMitigationGroup, 200-visibilityOffset, 23);
		getContentPane().add(checkBox10);
		
		ComboDataProvider comboBox10 = new ComboDataProvider();
		comboBox10.setBounds(200, yMitigationGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox10);
		
	    // Initialize comboBox with strategies
        UmlToGui.initComboxWithStrings( comboBox10, ucNamesStrategy );

		JLabel lbl10 = new JLabel("is needed.");
		lbl10.setBounds(140 + 200, yMitigationGroup, 150-visibilityOffset, 16);
		getContentPane().add(lbl10);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P10",checkBox10);
        tempQIDE.addParam("R",comboBox10);
        GuiPropertySelection.data.addElement(tempQIDE);


        //P11: Multiple recovery feasibility
		JCheckBox checkBox11 = new JCheckBox("(P11) The strategies");
		yMitigationGroup += 40;
		checkBox11.setBounds(6, yMitigationGroup, 200-visibilityOffset, 23);
		getContentPane().add(checkBox11);		
		
		JScrollPane scrollPane11 = new JScrollPane();
		scrollPane11.setBounds(200, yMitigationGroup, 140-visibilityOffset, 40);
		getContentPane().add(scrollPane11);
		ListDataProvider list11 = new ListDataProvider();		
		// Initialize list with strategies
        UmlToGui.initListWithStrings( list11,  ucNamesStrategy );
		scrollPane11.setViewportView(list11);

		JLabel lbl11 = new JLabel("are always needed together.");
		lbl11.setBounds(140 + 200, yMitigationGroup, 220-visibilityOffset, 16);
		getContentPane().add(lbl11);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P11",checkBox11);
        tempQIDE.addParam("R",list11);
        GuiPropertySelection.data.addElement(tempQIDE);

		//P12: Recovery mutual exclusion
		JCheckBox checkBox12 = new JCheckBox("(P12) The strategies");
		yMitigationGroup += 40;
		checkBox12.setBounds(6, yMitigationGroup, 200-visibilityOffset, 23);
		getContentPane().add(checkBox12);

		JScrollPane scrollPane12 = new JScrollPane();
		scrollPane12.setBounds(200, yMitigationGroup, 140-visibilityOffset, 40);
		getContentPane().add(scrollPane12);
		ListDataProvider list12 = new ListDataProvider();	
		// Initialize list with strategies
        UmlToGui.initListWithStrings( list12,  ucNamesStrategy );
		scrollPane12.setViewportView(list12);

		JLabel lbl12 = new JLabel("are never enabled together.");
		lbl12.setBounds(200 + 140, yMitigationGroup, 220-visibilityOffset, 16);
		getContentPane().add(lbl12);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P12",checkBox12);
        tempQIDE.addParam("R",list12);
        GuiPropertySelection.data.addElement(tempQIDE);

		
		//P13: Threat/recovery effectiveness
		JCheckBox checkBox13 = new JCheckBox("(P13) Is the strategy");
		yMitigationGroup += 40;
		checkBox13.setBounds(6, yMitigationGroup, 200-visibilityOffset, 23);
		getContentPane().add(checkBox13);
		
		ComboDataProvider comboBox13_1 = new ComboDataProvider();
		comboBox13_1.setBounds(200, yMitigationGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox13_1);
		
	    // Initialize comboBox with strategies
        UmlToGui.initComboxWithStrings( comboBox13_1, ucNamesStrategy );

		JLabel lbl13_1 = new JLabel("effective to mitigate the threat");
		lbl13_1.setBounds(200 + 140, yMitigationGroup, 230-visibilityOffset, 16);
		getContentPane().add(lbl13_1);
		
		ComboDataProvider comboBox13_2 = new ComboDataProvider();
		comboBox13_2.setBounds(200+140+230, yMitigationGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox13_2);
		
	    // Initialize comboBox with misuses
        UmlToGui.initComboxWithStrings( comboBox13_2, ucNamesMisuse );

		JLabel lbl13_2 = new JLabel("?");
		lbl13_2.setBounds(200+140+230+140, yMitigationGroup, 21-visibilityOffset, 16);
		getContentPane().add(lbl13_2);
		
		// Saving meaningful features
        tempQIDE = new GuiQIElement("P13",checkBox13);
        tempQIDE.addParam("R",comboBox13_1);
        tempQIDE.addParam("M",comboBox13_2);
        GuiPropertySelection.data.addElement(tempQIDE);

        
        //P14: Best set of strategies in a service mode
		JCheckBox checkBox14 = new JCheckBox("(P14) Among the feasible strategies in service mode");
		yMitigationGroup += 40;
		checkBox14.setBounds(6, yMitigationGroup, 440-visibilityOffset, 23);
		getContentPane().add(checkBox14);
		
		ComboDataProvider comboBox14 = new ComboDataProvider();
		comboBox14.setBounds(440, yMitigationGroup, 140-visibilityOffset, 27);
		getContentPane().add(comboBox14);

		// Initialize comboBox with service modes
        UmlToGui.initComboxWithStrings( comboBox14, serviceModes );

		JLabel lbl14 = new JLabel("which is the smallest set of strategies that leads to the full operational service mode?");
		yMitigationGroup += 30;
		lbl14.setBounds(32, yMitigationGroup, 700-visibilityOffset, 16);
		getContentPane().add(lbl14);

		// Saving meaningful features
        tempQIDE = new GuiQIElement("P14",checkBox14);
        tempQIDE.addParam("S",comboBox14);
        GuiPropertySelection.data.addElement(tempQIDE);

		//The button that launches the checker
		JButton btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Handler globalExceptionHandler = new Handler();
				Thread.setDefaultUncaughtExceptionHandler(globalExceptionHandler);
				QueryInstantiationDocument qs = GuiPropertySelection.data.generateInstantiation();
				GuiPropertySelection.setDocument(qs);
				GuiPropertySelection.super.setVisible(false);
//				JButton button = (JButton) e.getSource();
//				JFrame frame = (JFrame) button.getParent().getParent().getParent();
//				frame.dispose();
				//GuiPropertySelection.flag = true;
				
			}
		});
		btnCheck.setBounds(409, 770, 117, 30);
		getContentPane().add(btnCheck);			
	}

	protected static void setDocument(QueryInstantiationDocument qid) {
		GuiPropertySelection.document = qid;
	}

	public static void go() {
		try {
			GuiPropertySelection frame = new GuiPropertySelection();
			//GuiPropertySelection.flag = false;
			frame.setVisible(true);
			while (frame.isVisible()) {
				Thread.sleep(1000);
			}
//			while (GuiPropertySelection.flag == false) {
//				Thread.sleep(1000);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static QueryInstantiationDocument getDocument() {
		return GuiPropertySelection.document;
	}
	
	
		
}
