package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EMR_Admin {

	private JFrame frmAdmin;
	private JTextField textFName;
	private JTextField textLName;
	private JTextField textEID;
	private JTextField textCName;
	private JTextField textAddress;
	private JTextField textSSN;
	private JTextField textDOB;
	private JTextField textEmail;
	private JTextField textUsername;
	private JTextField textPassword;
	private JTextField textNPI;
	private JTextField textLNum;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMR_Admin window = new EMR_Admin();
					window.frmAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EMR_Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdmin = new JFrame();
		frmAdmin.setTitle("Admin");
		frmAdmin.setBounds(100, 100, 835, 689);
		frmAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdmin.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 13, 793, 616);
		frmAdmin.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add/Update User", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("First Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(117, 54, 76, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Last Name:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_1.setBounds(117, 89, 76, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Employee ID:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_2.setBounds(104, 124, 89, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Clinic Name:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_3.setBounds(114, 229, 79, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_4.setBounds(136, 264, 57, 16);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("SSN:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_5.setBounds(162, 299, 31, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("DOB:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(158, 334, 35, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Email:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(155, 369, 38, 16);
		panel.add(label_7);
		
		textFName = new JTextField();
		textFName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFName.setColumns(10);
		textFName.setBounds(205, 51, 251, 22);
		panel.add(textFName);
		
		textLName = new JTextField();
		textLName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLName.setColumns(10);
		textLName.setBounds(205, 86, 251, 22);
		panel.add(textLName);
		
		textEID = new JTextField();
		textEID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEID.setColumns(10);
		textEID.setBounds(205, 121, 251, 22);
		panel.add(textEID);
		
		textCName = new JTextField();
		textCName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCName.setColumns(10);
		textCName.setBounds(205, 226, 500, 22);
		panel.add(textCName);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(205, 261, 500, 22);
		panel.add(textAddress);
		
		textSSN = new JTextField();
		textSSN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSSN.setColumns(10);
		textSSN.setBounds(205, 296, 251, 22);
		panel.add(textSSN);
		
		textDOB = new JTextField();
		textDOB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDOB.setColumns(10);
		textDOB.setBounds(205, 331, 136, 22);
		panel.add(textDOB);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(205, 366, 500, 22);
		panel.add(textEmail);
		
		JButton btnAddupdateUser = new JButton("Add/Update User");
		btnAddupdateUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddupdateUser.setBounds(287, 498, 169, 25);
		panel.add(btnAddupdateUser);
		
		JButton button_5 = new JButton("Clear");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFName.setText("");
				textLName.setText("");
				textEID.setText("");
				textLNum.setText("");
				textNPI.setText("");
				textCName.setText("");
				textAddress.setText("");
				textSSN.setText("");
				textDOB.setText("");
				textEmail.setText("");
				textUsername.setText("");
				textPassword.setText("");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(287, 548, 169, 25);
		panel.add(button_5);
		
		JLabel label_8 = new JLabel("Username:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(121, 404, 72, 16);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Password:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(127, 439, 66, 16);
		panel.add(label_9);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUsername.setColumns(10);
		textUsername.setBounds(205, 401, 251, 22);
		panel.add(textUsername);
		
		textPassword = new JTextField();
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPassword.setColumns(10);
		textPassword.setBounds(205, 436, 251, 22);
		panel.add(textPassword);
		
		JButton button_6 = new JButton("Exit");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAdmin = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmAdmin, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(607, 548, 169, 25);
		panel.add(button_6);
		
		JLabel label_10 = new JLabel("National Provider Identifier:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(18, 194, 175, 16);
		panel.add(label_10);
		
		textNPI = new JTextField();
		textNPI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNPI.setColumns(10);
		textNPI.setBounds(205, 191, 213, 22);
		panel.add(textNPI);
		
		JLabel label_11 = new JLabel("License Number:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(84, 159, 109, 16);
		panel.add(label_11);
		
		textLNum = new JTextField();
		textLNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLNum.setColumns(10);
		textLNum.setBounds(205, 156, 251, 22);
		panel.add(textLNum);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitle.setBounds(161, 25, 32, 16);
		panel.add(lblTitle);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Registration Clerk", "Physician", "Nurse"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(205, 23, 251, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Lock/Unlock/Delete User", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblSearchUser = new JLabel("Search User:");
		lblSearchUser.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSearchUser.setBounds(29, 51, 84, 16);
		panel_1.add(lblSearchUser);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_12.setBounds(138, 49, 302, 22);
		panel_1.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblUserList = new JLabel("Select User:");
		lblUserList.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserList.setBounds(29, 106, 84, 16);
		panel_1.add(lblUserList);
		
		JButton btnLockUser = new JButton("Lock User");
		btnLockUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLockUser.setBounds(340, 432, 127, 25);
		panel_1.add(btnLockUser);
		
		JButton btnUnlockUser = new JButton("Unlock User");
		btnUnlockUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUnlockUser.setBounds(340, 481, 127, 25);
		panel_1.add(btnUnlockUser);
		
		JButton btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteUser.setBounds(340, 529, 127, 25);
		panel_1.add(btnDeleteUser);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 15));
		list.setBounds(52, 135, 678, 270);
		panel_1.add(list);
		
		JButton button = new JButton("Exit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmAdmin = new JFrame ("Exit");
				if (JOptionPane.showConfirmDialog(frmAdmin, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(607, 548, 169, 25);
		panel_1.add(button);
	}
}
