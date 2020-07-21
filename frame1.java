import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frame1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLibraryManagement = new JLabel("LIBRARY MANAGEMENT");
		lblLibraryManagement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLibraryManagement.setBounds(100, 11, 202, 14);
		frame.getContentPane().add(lblLibraryManagement);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(73, 65, 71, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblRegisterNo = new JLabel("REGISTER NO");
		lblRegisterNo.setBounds(73, 111, 105, 14);
		frame.getContentPane().add(lblRegisterNo);
		
		JLabel lblTermsAndConditions = new JLabel("TERMS AND CONDITIONS*");
		lblTermsAndConditions.setBounds(73, 158, 168, 14);
		frame.getContentPane().add(lblTermsAndConditions);
		
		textField = new JTextField();
		textField.setBounds(271, 62, 94, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 108, 94, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxIAgree = new JCheckBox("I AGREE");
		chckbxIAgree.setBounds(268, 154, 97, 23);
		frame.getContentPane().add(chckbxIAgree);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame2 obj=new frame2();
				obj.setVisible(true);
			}
		});
		btnRegister.setBounds(101, 227, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(JOptionPane.showConfirmDialog(null, "sure you want to close")==0)
				System.exit(0);
			}
		});
		btnClose.setBounds(281, 227, 89, 23);
		frame.getContentPane().add(btnClose);
	}
}
