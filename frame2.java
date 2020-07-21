import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBookIssue = new JButton("BOOK ISSUE");
		btnBookIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame3 obj3=new frame3();
				obj3.setVisible(true);
			}
		});
		btnBookIssue.setBounds(160, 75, 111, 23);
		contentPane.add(btnBookIssue);
		
		JButton btnBookReturn = new JButton("BOOK RETURN");
		btnBookReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4 obj4=new frame4();
				obj4.setVisible(true);
			}
		});
		btnBookReturn.setBounds(160, 150, 111, 23);
		contentPane.add(btnBookReturn);
	}

}
