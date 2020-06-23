package animation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroPage extends JFrame {

	private JPanel contentPane;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroPage frame = new IntroPage();
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
	public IntroPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(224, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text = new JLabel();
		text.setBounds(115, 5, 440, 29);
		
		text.setText("What would you like to learn today?");
		text.setBackground(new Color(224, 255, 255));
		contentPane.add(text);
		
		
		JButton btnRouting = new JButton("Routing");
		btnRouting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					OnePageOne mD = new OnePageOne();
					JPanel panel = new JPanel();
					panel.add(new TestPane7());
					panel.add(new TestPaneHi7(mD));
					mD.add(panel);
					mD.getContentPane().add(panel);
					mD.setVisible(true);
					mD.setBounds(0,0,1500,700);
				}catch(Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
			}
		});
		
		btnRouting.setBounds(260, 164, 93, 45);
		contentPane.add(btnRouting);
		
		JButton btnNewButton = new JButton("Data Movement and Encapsulation");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageTwo tP2 = new TwoPageTwo();
					tP2.setVisible(true);
				}catch(Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
			}
		});
		
		btnNewButton.setBounds(172, 95, 261, 45);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image1.png"));
		label.setIcon(img);
		label.setBounds(21, 79, 130, 130);
		contentPane.add(label);
	}
}
