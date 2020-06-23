package animation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TwoPageSeven extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoPageSeven frame = new TwoPageSeven();
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
	public TwoPageSeven() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Data Movement & Encapsulation");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text = new JLabel("");
		text.setText("Done:)");
		text.setBounds(197, 41, 62, 56);
		text.setBackground(new Color(224, 255, 255));
		contentPane.add(text);
		
		JButton button = new JButton("Return to Main Menu");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					IntroPage mD = new IntroPage();
					mD.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
		});
		button.setBounds(123, 243, 191, 29);
		contentPane.add(button);
	}
}
