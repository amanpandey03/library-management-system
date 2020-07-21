import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame3 frame = new frame3();
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
	public frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookDetails = new JLabel("BOOK DETAILS");
		lblBookDetails.setBounds(185, 11, 93, 14);
		contentPane.add(lblBookDetails);
		
		JLabel lblBookName = new JLabel("BOOK NAME");
		lblBookName.setBounds(64, 66, 102, 14);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setBounds(64, 112, 46, 14);
		contentPane.add(lblAuthor);
		
		JLabel lblTimePerod = new JLabel("TIME PEROD");
		lblTimePerod.setBounds(64, 152, 102, 14);
		contentPane.add(lblTimePerod);
		
		JButton btnIssue = new JButton("ISSUE");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "BOOK ISSUED");
				System.exit(0);
			}
		});
		btnIssue.setBounds(165, 214, 89, 23);
		contentPane.add(btnIssue);
		
		textField = new JTextField();
		textField.setBounds(250, 63, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 109, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		String s[]={"<5 DAYS", ">5 DAYS", ">10 DAYS"};
		JComboBox<String> comboBox = new JComboBox<String>(s);
		
		comboBox.setBounds(250, 149, 86, 20);
		contentPane.add(comboBox);
	}
}
