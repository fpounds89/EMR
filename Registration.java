package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Registration {

	private JFrame frmRegistration;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frmRegistration.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistration = new JFrame();
		frmRegistration.setTitle("Registration");
		frmRegistration.setBounds(100, 100, 929, 759);
		frmRegistration.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmRegistration.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Patient Registration", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Last Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(58, 39, 76, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("First Name:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(375, 39, 76, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Middle Initial:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(694, 39, 89, 16);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(146, 36, 188, 22);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(463, 36, 188, 22);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(795, 37, 63, 22);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Address:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(77, 84, 57, 16);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(146, 81, 712, 22);
		panel.add(textField_3);
		
		JLabel label_4 = new JLabel("City:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(105, 132, 29, 16);
		panel.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(146, 129, 188, 22);
		panel.add(textField_4);
		
		JLabel label_5 = new JLabel("State:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(375, 132, 39, 16);
		panel.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(426, 129, 70, 22);
		panel.add(comboBox);
		
		JLabel label_6 = new JLabel("Zip:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(537, 132, 23, 16);
		panel.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(572, 129, 116, 22);
		panel.add(textField_5);
		
		JLabel label_7 = new JLabel("Phone:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(89, 175, 45, 16);
		panel.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBounds(146, 172, 116, 22);
		panel.add(textField_6);
		
		JLabel label_8 = new JLabel("SSN:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(321, 175, 31, 16);
		panel.add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setColumns(10);
		textField_7.setBounds(364, 172, 132, 22);
		panel.add(textField_7);
		
		JLabel label_9 = new JLabel("DOB:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(99, 222, 35, 16);
		panel.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setColumns(10);
		textField_8.setBounds(146, 219, 116, 22);
		panel.add(textField_8);
		
		JLabel label_10 = new JLabel("Sex:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(321, 222, 29, 16);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Marital Status:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(463, 222, 93, 16);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Driver's License:");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(29, 267, 105, 16);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Employer Name:");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_13.setBounds(25, 317, 109, 16);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("Employer Address:");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_14.setBounds(12, 364, 122, 16);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("Work Phone:");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_15.setBounds(463, 317, 84, 16);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Email Address:");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_16.setBounds(38, 412, 96, 16);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("Cell Phone:");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_17.setBounds(485, 412, 71, 16);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("Emergency Contact Name:");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_18.setBounds(38, 461, 178, 16);
		panel.add(label_18);
		
		JLabel label_19 = new JLabel("Emergency Contact Phone:");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_19.setBounds(485, 461, 178, 16);
		panel.add(label_19);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_9.setColumns(10);
		textField_9.setBounds(364, 220, 39, 22);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_10.setColumns(10);
		textField_10.setBounds(146, 264, 188, 22);
		panel.add(textField_10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Single", "Married", "Divorced", "Widowed"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(575, 220, 116, 22);
		panel.add(comboBox_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_11.setColumns(10);
		textField_11.setBounds(146, 315, 257, 22);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_12.setColumns(10);
		textField_12.setBounds(146, 362, 712, 22);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_13.setColumns(10);
		textField_13.setBounds(575, 315, 116, 22);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_14.setColumns(10);
		textField_14.setBounds(146, 410, 257, 22);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_15.setColumns(10);
		textField_15.setBounds(575, 410, 116, 22);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_16.setColumns(10);
		textField_16.setBounds(228, 459, 223, 22);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_17.setColumns(10);
		textField_17.setBounds(675, 459, 116, 22);
		panel.add(textField_17);
		
		JButton button = new JButton("Save");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(386, 548, 97, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmRegistration = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmRegistration, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(386, 594, 97, 25);
		panel.add(button_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search Patient", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_20 = new JLabel("Search Patient:");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_20.setBounds(107, 39, 98, 16);
		panel_1.add(label_20);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_18.setColumns(10);
		textField_18.setBounds(217, 37, 397, 22);
		panel_1.add(textField_18);
		
		JLabel label_21 = new JLabel("Select Patient:");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_21.setBounds(113, 145, 92, 16);
		panel_1.add(label_21);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setBounds(113, 174, 698, 339);
		panel_1.add(list);
		
		JButton button_2 = new JButton("Check-In Patient");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(374, 538, 170, 25);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Check-Out Patient");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.setBounds(374, 576, 170, 25);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Exit");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmRegistration = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmRegistration, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_4.setBounds(412, 614, 97, 25);
		panel_1.add(button_4);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Insurance Holder", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label_22 = new JLabel("Responsible Party Information");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_22.setBounds(12, 13, 246, 16);
		panel_2.add(label_22);
		
		JLabel label_23 = new JLabel("Relationship of Responsible Party to Patient:");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_23.setBounds(66, 57, 284, 16);
		panel_2.add(label_23);
		
		JCheckBox checkBox = new JCheckBox("Self");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox.setBounds(358, 53, 70, 25);
		panel_2.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Spouse");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_1.setBounds(426, 53, 83, 25);
		panel_2.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("Parent");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_2.setBounds(513, 53, 83, 25);
		panel_2.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Other");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		checkBox_3.setBounds(600, 53, 75, 25);
		panel_2.add(checkBox_3);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_19.setColumns(10);
		textField_19.setBounds(683, 54, 116, 22);
		panel_2.add(textField_19);
		
		JLabel label_24 = new JLabel("Last Name:");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_24.setBounds(58, 104, 76, 16);
		panel_2.add(label_24);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_20.setColumns(10);
		textField_20.setBounds(146, 102, 188, 22);
		panel_2.add(textField_20);
		
		JLabel label_25 = new JLabel("First Name:");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_25.setBounds(375, 104, 76, 16);
		panel_2.add(label_25);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_21.setColumns(10);
		textField_21.setBounds(463, 101, 188, 22);
		panel_2.add(textField_21);
		
		JLabel label_26 = new JLabel("Address:");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_26.setBounds(77, 150, 57, 16);
		panel_2.add(label_26);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_22.setColumns(10);
		textField_22.setBounds(146, 147, 712, 22);
		panel_2.add(textField_22);
		
		JLabel label_27 = new JLabel("Middle Initial:");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_27.setBounds(694, 104, 89, 16);
		panel_2.add(label_27);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(795, 102, 63, 22);
		panel_2.add(textField_23);
		
		JLabel label_28 = new JLabel("City:");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_28.setBounds(105, 198, 29, 16);
		panel_2.add(label_28);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_24.setColumns(10);
		textField_24.setBounds(146, 195, 188, 22);
		panel_2.add(textField_24);
		
		JLabel label_29 = new JLabel("State:");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_29.setBounds(375, 198, 39, 16);
		panel_2.add(label_29);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV", "WY"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setBounds(426, 195, 70, 22);
		panel_2.add(comboBox_2);
		
		JLabel label_30 = new JLabel("Zip:");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_30.setBounds(540, 198, 23, 16);
		panel_2.add(label_30);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_25.setColumns(10);
		textField_25.setBounds(575, 195, 116, 22);
		panel_2.add(textField_25);
		
		JLabel label_31 = new JLabel("Phone:");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_31.setBounds(89, 247, 45, 16);
		panel_2.add(label_31);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_26.setColumns(10);
		textField_26.setBounds(146, 244, 116, 22);
		panel_2.add(textField_26);
		
		JLabel label_32 = new JLabel("SSN:");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_32.setBounds(321, 247, 31, 16);
		panel_2.add(label_32);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_27.setColumns(10);
		textField_27.setBounds(364, 244, 132, 22);
		panel_2.add(textField_27);
		
		JLabel label_33 = new JLabel("DOB:");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_33.setBounds(528, 247, 35, 16);
		panel_2.add(label_33);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_28.setColumns(10);
		textField_28.setBounds(575, 244, 116, 22);
		panel_2.add(textField_28);
		
		JLabel label_34 = new JLabel("Sex:");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_34.setBounds(719, 247, 29, 16);
		panel_2.add(label_34);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_29.setColumns(10);
		textField_29.setBounds(760, 244, 39, 22);
		panel_2.add(textField_29);
		
		JLabel label_35 = new JLabel("Employer Name:");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_35.setBounds(25, 296, 109, 16);
		panel_2.add(label_35);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_30.setColumns(10);
		textField_30.setBounds(146, 293, 257, 22);
		panel_2.add(textField_30);
		
		JLabel label_36 = new JLabel("Work Phone:");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_36.setBounds(444, 296, 84, 16);
		panel_2.add(label_36);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_31.setColumns(10);
		textField_31.setBounds(540, 293, 116, 22);
		panel_2.add(textField_31);
		
		JLabel label_37 = new JLabel("Employer Address:");
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_37.setBounds(12, 338, 122, 16);
		panel_2.add(label_37);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_32.setColumns(10);
		textField_32.setBounds(146, 335, 712, 22);
		panel_2.add(textField_32);
		
		JButton button_5 = new JButton("Save");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(375, 463, 97, 25);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("Exit");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmRegistration = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmRegistration, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(375, 501, 97, 25);
		panel_2.add(button_6);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Insurance Information", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel label_38 = new JLabel("Primary Insurance");
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_38.setBounds(47, 13, 154, 16);
		panel_3.add(label_38);
		
		JLabel label_39 = new JLabel("Plan Name:");
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_39.setBounds(99, 57, 75, 16);
		panel_3.add(label_39);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_33.setColumns(10);
		textField_33.setBounds(186, 54, 188, 22);
		panel_3.add(textField_33);
		
		JLabel label_40 = new JLabel("Insured's Name:");
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_40.setBounds(444, 57, 109, 16);
		panel_3.add(label_40);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_34.setColumns(10);
		textField_34.setBounds(565, 54, 198, 22);
		panel_3.add(textField_34);
		
		JLabel label_41 = new JLabel("Insured's Social Security:");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_41.setBounds(13, 97, 161, 16);
		panel_3.add(label_41);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_35.setColumns(10);
		textField_35.setBounds(186, 94, 188, 22);
		panel_3.add(textField_35);
		
		JLabel label_42 = new JLabel("Insured's Date of Birth:");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_42.setBounds(400, 97, 153, 16);
		panel_3.add(label_42);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_36.setColumns(10);
		textField_36.setBounds(565, 94, 116, 22);
		panel_3.add(textField_36);
		
		JLabel label_43 = new JLabel("Policy/ID #:");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_43.setBounds(96, 140, 78, 16);
		panel_3.add(label_43);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_37.setColumns(10);
		textField_37.setBounds(186, 137, 188, 22);
		panel_3.add(textField_37);
		
		JLabel label_44 = new JLabel("Group #:");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_44.setBounds(433, 140, 60, 16);
		panel_3.add(label_44);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_38.setColumns(10);
		textField_38.setBounds(505, 137, 116, 22);
		panel_3.add(textField_38);
		
		JLabel label_45 = new JLabel("Eff Date:");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_45.setBounds(662, 143, 59, 16);
		panel_3.add(label_45);
		
		JLabel label_46 = new JLabel("Claims Address:");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_46.setBounds(71, 180, 103, 16);
		panel_3.add(label_46);
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_39.setColumns(10);
		textField_39.setBounds(186, 177, 712, 22);
		panel_3.add(textField_39);
		
		JLabel label_47 = new JLabel("Claims Phone:");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_47.setBounds(83, 216, 91, 16);
		panel_3.add(label_47);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_40.setColumns(10);
		textField_40.setBounds(186, 213, 116, 22);
		panel_3.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_41.setColumns(10);
		textField_41.setBounds(733, 137, 91, 22);
		panel_3.add(textField_41);
		
		JLabel label_48 = new JLabel("Secondary Insurance");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_48.setBounds(13, 269, 188, 16);
		panel_3.add(label_48);
		
		JLabel label_49 = new JLabel("Plan Name:");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_49.setBounds(99, 310, 75, 16);
		panel_3.add(label_49);
		
		textField_42 = new JTextField();
		textField_42.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_42.setColumns(10);
		textField_42.setBounds(186, 307, 188, 22);
		panel_3.add(textField_42);
		
		JLabel label_50 = new JLabel("Insured's Name:");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_50.setBounds(444, 310, 109, 16);
		panel_3.add(label_50);
		
		textField_43 = new JTextField();
		textField_43.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_43.setColumns(10);
		textField_43.setBounds(565, 307, 198, 22);
		panel_3.add(textField_43);
		
		JLabel label_51 = new JLabel("Insured's Social Security:");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_51.setBounds(13, 353, 161, 16);
		panel_3.add(label_51);
		
		textField_44 = new JTextField();
		textField_44.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_44.setColumns(10);
		textField_44.setBounds(186, 350, 188, 22);
		panel_3.add(textField_44);
		
		JLabel label_52 = new JLabel("Insured's Date of Birth:");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_52.setBounds(400, 353, 153, 16);
		panel_3.add(label_52);
		
		textField_45 = new JTextField();
		textField_45.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_45.setColumns(10);
		textField_45.setBounds(565, 350, 116, 22);
		panel_3.add(textField_45);
		
		JLabel label_53 = new JLabel("Policy/ID #:");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_53.setBounds(96, 396, 78, 16);
		panel_3.add(label_53);
		
		textField_46 = new JTextField();
		textField_46.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_46.setColumns(10);
		textField_46.setBounds(186, 393, 188, 22);
		panel_3.add(textField_46);
		
		JLabel label_54 = new JLabel("Group #:");
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_54.setBounds(433, 396, 60, 16);
		panel_3.add(label_54);
		
		textField_47 = new JTextField();
		textField_47.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_47.setColumns(10);
		textField_47.setBounds(505, 393, 116, 22);
		panel_3.add(textField_47);
		
		JLabel label_55 = new JLabel("Eff Date:");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_55.setBounds(662, 396, 59, 16);
		panel_3.add(label_55);
		
		JLabel label_56 = new JLabel("Claims Address:");
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_56.setBounds(71, 436, 103, 16);
		panel_3.add(label_56);
		
		textField_48 = new JTextField();
		textField_48.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_48.setColumns(10);
		textField_48.setBounds(186, 433, 712, 22);
		panel_3.add(textField_48);
		
		JLabel label_57 = new JLabel("Claims Phone:");
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_57.setBounds(83, 472, 91, 16);
		panel_3.add(label_57);
		
		textField_49 = new JTextField();
		textField_49.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_49.setColumns(10);
		textField_49.setBounds(186, 469, 116, 22);
		panel_3.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_50.setColumns(10);
		textField_50.setBounds(733, 393, 91, 22);
		panel_3.add(textField_50);
		
		JButton button_7 = new JButton("Save");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(377, 551, 97, 25);
		panel_3.add(button_7);
		
		JButton button_8 = new JButton("Exit");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmRegistration = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmRegistration, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(377, 589, 97, 25);
		panel_3.add(button_8);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Appointment", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblAppointmentTime = new JLabel("Appointment Time:");
		lblAppointmentTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAppointmentTime.setBounds(189, 77, 125, 16);
		panel_4.add(lblAppointmentTime);
		
		JLabel lblAppointmentDate = new JLabel("Appointment Date:");
		lblAppointmentDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAppointmentDate.setBounds(191, 118, 123, 16);
		panel_4.add(lblAppointmentDate);
		
		textField_51 = new JTextField();
		textField_51.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_51.setBounds(326, 75, 146, 22);
		panel_4.add(textField_51);
		textField_51.setColumns(10);
		
		textField_52 = new JTextField();
		textField_52.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_52.setBounds(326, 116, 146, 22);
		panel_4.add(textField_52);
		textField_52.setColumns(10);
		
		JLabel lblAppointments = new JLabel("Appointments:");
		lblAppointments.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAppointments.setBounds(109, 267, 109, 16);
		panel_4.add(lblAppointments);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(109, 308, 723, 220);
		panel_4.add(textArea);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setBounds(390, 561, 97, 25);
		panel_4.add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmRegistration = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmRegistration, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(390, 599, 97, 25);
		panel_4.add(btnExit);
	}
}
