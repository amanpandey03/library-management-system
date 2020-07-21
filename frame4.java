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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frame4 extends JFrame {

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
					frame4 frame = new frame4();
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
	public frame4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookReturn = new JLabel("BOOK RETURN");
		lblBookReturn.setBounds(178, 11, 101, 14);
		contentPane.add(lblBookReturn);
		
		JLabel lblBookName = new JLabel("BOOK NAME");
		lblBookName.setBounds(69, 65, 101, 14);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("AUTHOR");
		lblAuthor.setBounds(69, 142, 101, 14);
		contentPane.add(lblAuthor);
		
		JButton btnUpdateAndReturn = new JButton("UPDATE AND RETURN");
		btnUpdateAndReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "RECORD UPDATED");
				JOptionPane.showMessageDialog(null, "BOOK RETURNED SUCCESSFULLY");
				System.exit(0);
				
			}
		});
		btnUpdateAndReturn.setBounds(139, 213, 163, 23);
		contentPane.add(btnUpdateAndReturn);
		
		textField = new JTextField();
		textField.setBounds(216, 62, 112, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 139, 112, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}


