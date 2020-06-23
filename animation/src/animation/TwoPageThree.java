package animation;

import java.awt.BorderLayout;
import java.awt.Window;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TwoPageThree extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel arrowLabel, arrowLabel1, arrowLabel2;
	private JButton btnNext;
	private JButton btnNewButton;
	private JTextArea txt1;
	private JTextArea txt2;
	private JTextArea txt3;
	private JTextArea txt4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoPageThree frame = new TwoPageThree();
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
	public TwoPageThree() {
		setTitle("Data Movement & Encapsulation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txt = new JLabel();
		txt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt.setBackground(new Color(224, 255, 255));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setText("Holisitic view of data movement and encapsulation within the OSI model");
		txt.setBounds(45, 16, 581, 50);
		contentPane.add(txt);
		
		
		JLabel label1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/data4.png")).getImage();
		label1.setIcon(new ImageIcon(img1));
		label1.setBounds(50, 110, 170, 50);
		contentPane.add(label1);
		
		label2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/data3.png")).getImage();
		label2.setIcon(new ImageIcon(img2));
		label2.setBounds(50, 205, 270, 50);
		contentPane.add(label2);
		
		label3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/data2.png")).getImage();
		label3.setIcon(new ImageIcon(img3));
		label3.setBounds(50, 315, 370, 50);
		contentPane.add(label3);
		
		label4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/data1.png")).getImage();
		label4.setIcon(new ImageIcon(img4));
		label4.setBounds(50, 425, 470, 50);
		contentPane.add(label4);
		
		arrowLabel = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/arrowdown.png")).getImage();
		arrowLabel.setIcon(new ImageIcon(img5));
		arrowLabel.setBounds(110, 165, 32, 32);
		contentPane.add(arrowLabel);
		
		arrowLabel1 = new JLabel("");
		arrowLabel1.setIcon(new ImageIcon(img5));
		arrowLabel1.setBounds(110, 271, 32, 32);
		contentPane.add(arrowLabel1);
		
		arrowLabel2 = new JLabel("");
		arrowLabel2.setIcon(new ImageIcon(img5));
		arrowLabel2.setBounds(110, 381, 32, 32);
		contentPane.add(arrowLabel2);
		
		btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageFour mD = new TwoPageFour();
					JPanel panel = new JPanel();
					panel.add(new TestPane());
					panel.add(new TestPaneHi(mD));
					mD.add(panel);
					mD.getContentPane().add(panel);
					mD.setVisible(true);
					mD.setBounds(0,0,600,700);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
		});
		btnNext.setBounds(577, 543, 117, 29);
		contentPane.add(btnNext);
		
		btnNewButton = new JButton("previous");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				dispose();
				TwoPageTwo dM = new TwoPageTwo();
				dM.setVisible(true);
				}catch(Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
			}
		});
		btnNewButton.setBounds(5, 543, 117, 29);
		contentPane.add(btnNewButton);
		
		txt1 = new JTextArea();
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txt1.setText("TCP Headers are added to the data in the Transport layer;\nOSI layer 4");
		txt1.setBackground(new Color(224, 255, 255));
		txt1.setBounds(265, 161, 360, 32);
		contentPane.add(txt1);
		
		txt2 = new JTextArea();
		txt2.setBackground(new Color(224, 255, 255));
		txt2.setText("IP Headers are added to the TCP segment in the Network layer;\nOSI layer 3\n");
		txt2.setBounds(265, 267, 394, 36);
		contentPane.add(txt2);
		
		txt3 = new JTextArea();
		txt3.setBackground(new Color(224, 255, 255));
		txt3.setText("Ethernet Headers are added to the IP packet in the Datalink layer;\nOSI layer 2\n");
		txt3.setBounds(265, 382, 410, 36);
		contentPane.add(txt3);
		
		txt4 = new JTextArea();
		txt4.setBackground(new Color(224, 255, 255));
		txt4.setText("Data movement from user space to kernel space occurs in the \napplication layer; OSI layer 5\n");
		txt4.setBounds(265, 72, 394, 77);
		contentPane.add(txt4);
		
		
		
		
	}

}
