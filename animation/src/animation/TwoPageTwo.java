package animation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TwoPageTwo extends JFrame {

	private JPanel contentPane;
	private JTextArea txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoPageTwo frame = new TwoPageTwo();
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
	public TwoPageTwo() {
		setTitle("Data Movement & Encapsulation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setForeground(new Color(238, 130, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txt1 = new JTextArea();
		txt1.setBackground(new Color(224, 255, 255));
		txt1.setText("Firstly, data is copied from the user process (user memory space) to a socket in the OS kernel (kernel \nmemory space)");
		txt1.setBounds(34, 32, 639, 49);
		contentPane.add(txt1);
		
		JTextArea txt2 = new JTextArea();
		txt2.setBackground(new Color(224, 255, 255));
		txt2.setText("TCP headers are added to the data, wrapping it into a TCP segment");
		txt2.setBounds(34, 93, 639, 42);
		contentPane.add(txt2);
		
		JTextArea txt3 = new JTextArea();
		txt3.setBackground(new Color(224, 255, 255));
		txt3.setText("IP Headers are then added to the TCP segment wrapping it into an IP packet");
		txt3.setBounds(33, 136, 483, 42);
		contentPane.add(txt3);
		
		JTextArea txt4 = new JTextArea();
		txt4.setBackground(new Color(224, 255, 255));
		txt4.setText("More headers, that are specific to Ethernet, are added putting the IP packet into an ethernet frame");
		txt4.setBounds(34, 182, 660, 49);
		contentPane.add(txt4);
		
		JButton btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageThree dM2 = new TwoPageThree();
					dM2.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
				}
			
				
							
		});
		btnNext.setBounds(556, 228, 117, 29);
		contentPane.add(btnNext);
		
		
	}
}
