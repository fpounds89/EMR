
package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.Choice;
import java.awt.List;
import java.awt.ScrollPane;
import javax.swing.JRadioButton;

public class EMR {

   JFrame frame;
   private final JLabel lblNewLabel = new JLabel("ELECTRONIC MEDICAL RECORD");
   private JTextField txtPatientNameMrn;
   private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JList list;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JEditorPane editorPane_6;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JCheckBox chckbxNewCheckBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox_3;
	private JTextField txtPulse;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField txtRepository;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;


   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               EMR window = new EMR();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public EMR() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(0, 0, 1250, 799);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
      lblNewLabel.setBounds(10, 0, 697, 35);
      frame.getContentPane().add(lblNewLabel);
      
      // column tab
      JPanel panel_2 = new JPanel();
      panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel_2.setBounds(30, 90, 190, 900);
      frame.getContentPane().add(panel_2);	
		panel_2.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(171, 47, 1135, 713);
		frame.getContentPane().add(tabbedPane);
		
		panel = new JPanel();
		tabbedPane.addTab("Home", null, panel, null);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Allergy", null, panel_1, null);
		panel_1.setLayout(null);
		
		list = new JList();
		list.setBounds(4, 17, 0, 0);
		panel_1.add(list);
		
		lblNewLabel_13 = new JLabel("Substance");
		lblNewLabel_13.setBounds(4, 9, 61, 16);
		panel_1.add(lblNewLabel_13);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 7, 114, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_12 = new JLabel("Type");
		lblNewLabel_12.setBounds(4, 41, 27, 16);
		panel_1.add(lblNewLabel_12);
		
		lblNewLabel_11 = new JLabel("Category");
		lblNewLabel_11.setBounds(4, 69, 51, 16);
		panel_1.add(lblNewLabel_11);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 71, 114, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Severity");
		lblNewLabel_10.setBounds(4, 97, 46, 16);
		panel_1.add(lblNewLabel_10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Low", "Medium", "High", "Critical"}));
		comboBox_1.addContainerListener(new ContainerAdapter() {
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox_1.setBounds(133, 93, 90, 25);
		comboBox_1.setToolTipText("");
		panel_1.add(comboBox_1);
		
		lblNewLabel_9 = new JLabel("Reactions");
		lblNewLabel_9.setBounds(4, 125, 57, 16);
		panel_1.add(lblNewLabel_9);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 123, 114, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Interaction");
		lblNewLabel_8.setBounds(4, 198, 61, 16);
		panel_1.add(lblNewLabel_8);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_2.setBounds(133, 194, 80, 25);
		panel_1.add(comboBox_2);
		
		lblNewLabel_7 = new JLabel("Comment");
		lblNewLabel_7.setBounds(306, 102, 55, 16);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_7);
		
		editorPane_6 = new JEditorPane();
		editorPane_6.setBounds(420, 97, 106, 22);
		panel_1.add(editorPane_6);
		
		lblNewLabel_6 = new JLabel("Source");
		lblNewLabel_6.setBounds(4, 242, 41, 16);
		panel_1.add(lblNewLabel_6);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Drug", "Food ", "Rhinitis", "Seasonal", "Skin", "Pet"}));
		comboBox.setBounds(133, 238, 100, 25);
		panel_1.add(comboBox);
		
		lblNewLabel_5 = new JLabel("Reaction Status");
		lblNewLabel_5.setBounds(4, 153, 90, 16);
		panel_1.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(420, 67, 114, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Reviewed By Who?");
		lblNewLabel_4.setBounds(306, 41, 108, 16);
		panel_1.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(420, 35, 114, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Estimated Onset");
		lblNewLabel_3.setBounds(308, 69, 94, 16);
		panel_1.add(lblNewLabel_3);
		
		textField_7 = new JTextField();
		textField_7.setBounds(99, 155, 114, 20);
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Updated Time");
		lblNewLabel_2.setBounds(306, 9, 78, 16);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(420, 7, 114, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("Show As Red");
		chckbxNewCheckBox.setBounds(4, 297, 100, 24);
		panel_1.add(chckbxNewCheckBox);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"FOOD", "Balsam of Peru", "Egg", "Fish or shellfish", "Fruit", "Gluten", "Garlic", "Hot peppers", "Oats", "Meat", "Milk", "Peanut", "Rice", "Sesame", "Soy", "Sulfites", "Tartrazine", "Tree nut", "Wheat", "", "DRUG", "Balsam of Peru", "Cephalosporins", "Dilantin", "Intravenous contrast dye", "Local anesthetics", "Non-Seroidal anti-inflammatories", "(Cromolyn sodium, nedocrmil sodium, etc.)", "Penicillin", "Sulfonamides", "Tegretol", "Tetracycline", "", "ENVIRONMENTAL", "Balsam of Peru", "Cat", "Chromium", "Cobalt Chloride", "Cosmetics", "Dog ", "Formaldehyde", "Fungicide", "Gold (gold sodium thiosulfate)", "House dust mite", "Insect Sting", "Latex", "Mold", "Nickel(nickel sulfate hexahydrate)", "Perfume", "Photographic developers", "Pollen", "Semen", "Water"}));
		comboBox_3.setBounds(133, 32, 150, 25);
		panel_1.add(comboBox_3);
		
		panel_3 = new JPanel();
		tabbedPane.addTab("Patient Charges", null, panel_3, null);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Vital Signs", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblPulseRate = new JLabel("Pulse Rate");
		lblPulseRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPulseRate.setBounds(89, 72, 88, 16);
		panel_4.add(lblPulseRate);
		
		JLabel lblRhythm = new JLabel("Rhythm");
		lblRhythm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRhythm.setBounds(89, 144, 56, 16);
		panel_4.add(lblRhythm);
		
		JLabel lblBloodPressure = new JLabel("Blood Pressure");
		lblBloodPressure.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBloodPressure.setBounds(89, 221, 100, 16);
		panel_4.add(lblBloodPressure);
		
		JLabel lblRepsoitoryRate = new JLabel("Repsoitory Rate");
		lblRepsoitoryRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRepsoitoryRate.setBounds(89, 339, 117, 16);
		panel_4.add(lblRepsoitoryRate);
		
		JLabel lblTemperatre = new JLabel("Temperatre");
		lblTemperatre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTemperatre.setBounds(89, 442, 88, 16);
		panel_4.add(lblTemperatre);
		
		JLabel lblTemperatureMeasurementLocation = new JLabel("Location");
		lblTemperatureMeasurementLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTemperatureMeasurementLocation.setBounds(466, 442, 80, 16);
		panel_4.add(lblTemperatureMeasurementLocation);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHeight.setBounds(89, 513, 56, 16);
		panel_4.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeight.setBounds(89, 567, 56, 16);
		panel_4.add(lblWeight);
		
		txtPulse = new JTextField();
		txtPulse.setBounds(217, 69, 116, 22);
		panel_4.add(txtPulse);
		txtPulse.setColumns(10);
		
		JLabel lblBeatsPerMinute = new JLabel("beats per minute");
		lblBeatsPerMinute.setBounds(345, 72, 127, 16);
		panel_4.add(lblBeatsPerMinute);
		
		JLabel label = new JLabel("(60-100)");
		label.setBounds(89, 90, 56, 16);
		panel_4.add(label);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBounds(287, 167, 1, 1);
		panel_4.add(verticalBox);
		
		JList list_1 = new JList();
		list_1.setBounds(173, 143, 1, 1);
		panel_4.add(list_1);
		
		JLabel lblSystolic = new JLabel("Systolic");
		lblSystolic.setBounds(217, 221, 56, 16);
		panel_4.add(lblSystolic);
		
		JLabel lblDiastolic = new JLabel("Diastolic");
		lblDiastolic.setBounds(305, 221, 56, 16);
		panel_4.add(lblDiastolic);
		
		JLabel label_1 = new JLabel("(90-119)");
		label_1.setBounds(217, 238, 56, 16);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("(60-79)");
		label_2.setBounds(305, 238, 56, 16);
		panel_4.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(217, 267, 56, 22);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(305, 267, 56, 22);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel label_3 = new JLabel("/");
		label_3.setBounds(287, 270, 22, 19);
		panel_4.add(label_3);
		
		JLabel lblMmhg = new JLabel("mmHg");
		lblMmhg.setBounds(387, 270, 56, 16);
		panel_4.add(lblMmhg);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocation.setBounds(466, 72, 56, 16);
		panel_4.add(lblLocation);
		
		JLabel label_8 = new JLabel("Location");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(466, 270, 56, 16);
		panel_4.add(label_8);
		
		txtRepository = new JTextField();
		txtRepository.setBounds(217, 336, 116, 22);
		panel_4.add(txtRepository);
		txtRepository.setColumns(10);
		
		JLabel lblUnitType = new JLabel("Unit Type");
		lblUnitType.setBounds(121, 375, 56, 16);
		panel_4.add(lblUnitType);
		
		JRadioButton rdbtnUsStandard = new JRadioButton("U.S. Standard");
		rdbtnUsStandard.setBounds(202, 371, 127, 25);
		panel_4.add(rdbtnUsStandard);
		
		JRadioButton rdbtnMetric = new JRadioButton("Metric");
		rdbtnMetric.setBounds(329, 371, 127, 25);
		panel_4.add(rdbtnMetric);
		
		textField_9 = new JTextField();
		textField_9.setBounds(217, 439, 116, 22);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblF = new JLabel("(92-103 F)");
		lblF.setBounds(345, 442, 68, 16);
		panel_4.add(lblF);
		
		textField_10 = new JTextField();
		textField_10.setBounds(217, 510, 116, 22);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(217, 564, 116, 22);
		panel_4.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(710, 70, 116, 22);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPosition.setBounds(710, 270, 56, 16);
		panel_4.add(lblPosition);
		
		textField_13 = new JTextField();
		textField_13.setBounds(710, 440, 116, 22);
		panel_4.add(textField_13);
		textField_13.setColumns(10);
		
		JComboBox comboBox_Rythm = new JComboBox();
		comboBox_Rythm.setModel(new DefaultComboBoxModel(new String[] {"-choose", "Regular", "Arrhythmia", "Tachycardia", "Bradycardia"}));
		comboBox_Rythm.setToolTipText("");
		comboBox_Rythm.setBounds(217, 142, 116, 22);
		panel_4.add(comboBox_Rythm);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"-choose", "Left Arm", "Right Arm"}));
		comboBox_4.setBounds(558, 267, 116, 22);
		panel_4.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"-choose", "Sitting", "Standing", "Laying"}));
		comboBox_5.setBounds(788, 267, 108, 22);
		panel_4.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"-choose", "Radial", "Carotid", "Femoral", "Pedal", "Brachial", "Apical"}));
		comboBox_6.setBounds(558, 70, 116, 22);
		panel_4.add(comboBox_6);
		
		textField_14 = new JTextField();
		textField_14.setBounds(356, 142, 142, 22);
		panel_4.add(textField_14);
		textField_14.setColumns(10);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"-choose", "Orally", "Rectally", "Axillary", "By Ear", "By Skin"}));
		comboBox_7.setBounds(557, 440, 117, 22);
		panel_4.add(comboBox_7);
		
		JLabel lblInches = new JLabel("inches");
		lblInches.setBounds(345, 514, 56, 16);
		panel_4.add(lblInches);
		
		JLabel lblLbs = new JLabel("lbs");
		lblLbs.setBounds(345, 568, 56, 16);
		panel_4.add(lblLbs);
		
		lblNewLabel_1 = new JLabel("New label");
		panel_3.add(lblNewLabel_1);
	
    

      JButton regInfo = new JButton("Registration");
      JButton patTrack = new JButton("Patient tracker");
      JButton phyExam = new JButton("Physical Exam");
      JButton meds = new JButton("Medication");
      JButton orders = new JButton("Orders");
      JButton labRes = new JButton("Lab Results");
      JButton radRes = new JButton("Radiology Results");
      JButton asess = new JButton("Asessment");
      JButton probList = new JButton("Problem List");
      JButton diag = new JButton("Diagnoses");
      JButton vital = new JButton("Vital Signs");
      JButton addRemove = new JButton("Add/Remove Patient");
      JButton patientInfo = new JButton("Patient Information");
      JButton physRep = new JButton("Physician Reports");
      JButton inbox = new JButton("Inbox");
      JButton complaints = new JButton("Complaints");
      
      panel_2.add(regInfo);
      panel_2.add(patTrack);
      panel_2.add(phyExam);
      panel_2.add(meds);
      panel_2.add(orders);
      panel_2.add(labRes);
      panel_2.add(radRes);
      panel_2.add(asess);
      panel_2.add(probList);
      panel_2.add(diag);
      panel_2.add(vital);
      panel_2.add(addRemove);
      panel_2.add(patientInfo);
      panel_2.add(physRep);
      panel_2.add(inbox);
      panel_2.add(complaints);

      frame.getContentPane().add(panel_2);   

      JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
      tabbedPane_1.setBounds(220, 67, 1735, 920);
      frame.getContentPane().add(tabbedPane_1);
      
      // Row tab
      JButton btnNewButton = new JButton("");
      tabbedPane_1.addTab("Visit History", null, btnNewButton, null);
      

      
   }
}
