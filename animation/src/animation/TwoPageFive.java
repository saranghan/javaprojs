package animation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TwoPageFive extends JFrame {

	private JPanel contentPane;
	private JLabel label1, label2, label3, label4;
	private JTextField txt;
	private JLabel arrowLabel, arrowLabel1, arrowLabel2;
	private JTextArea txt1, txt2, txt3;
	private JButton btnNext;
	private JButton btnPrevious;
	private JTextArea txtrFinallyTheData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoPageFive frame = new TwoPageFive();
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
	public TwoPageFive() {
		setTitle("Data Movement & Encapsulation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel txt = new JLabel();
		txt.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt.setBackground(new Color(224, 255, 255));
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setText("Holisitic view of data processing and movement within the OSI model");
		txt.setBounds(45, 16, 581, 50);
		contentPane.add(txt);
		
		
		JLabel label1 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/data4.png")).getImage();
		label1.setIcon(new ImageIcon(img1));
		label1.setBounds(50, 425, 170, 50);
		contentPane.add(label1);
		
		label2 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/data3.png")).getImage();
		label2.setIcon(new ImageIcon(img2));
		label2.setBounds(50, 315, 270, 50);
		contentPane.add(label2);
		
		label3 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/data2.png")).getImage();
		label3.setIcon(new ImageIcon(img3));
		label3.setBounds(51, 209, 370, 50);
		contentPane.add(label3);
		
		label4 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/data1.png")).getImage();
		label4.setIcon(new ImageIcon(img4));
		label4.setBounds(50, 110, 470, 50);
		contentPane.add(label4);
		
		arrowLabel = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/arrowdown.png")).getImage();
		arrowLabel.setIcon(new ImageIcon(img5));
		arrowLabel.setBounds(110, 172, 32, 32);
		contentPane.add(arrowLabel);
		
		arrowLabel1 = new JLabel("");
		arrowLabel1.setIcon(new ImageIcon(img5));
		arrowLabel1.setBounds(110, 271, 32, 32);
		contentPane.add(arrowLabel1);
		
		arrowLabel2 = new JLabel("");
		arrowLabel2.setIcon(new ImageIcon(img5));
		arrowLabel2.setBounds(110, 381, 32, 32);
		contentPane.add(arrowLabel2);
		
		txt1 = new JTextArea();
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txt1.setText("Ethernet headers are processed in the Datalink layer\nusing ethernet protocols; OSI layer 2\n\n\n");
		txt1.setBackground(new Color(224, 255, 255));
		txt1.setBounds(266, 165, 360, 32);
		contentPane.add(txt1);
		
		txt2 = new JTextArea();
		txt2.setBackground(new Color(224, 255, 255));
		txt2.setText("IP Headers are processed in the network layer using IP\nprotocols; OSI layer 3\n");
		txt2.setBounds(265, 271, 394, 36);
		contentPane.add(txt2);
		
		txt3 = new JTextArea();
		txt3.setBackground(new Color(224, 255, 255));
		txt3.setText("TCP headers are processed in the transport layer using TCP\nprotocols; OSI layer 4");
		txt3.setBounds(265, 382, 410, 36);
		contentPane.add(txt3);
		
		btnNext = new JButton("next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageSix mD = new TwoPageSix();
					JPanel panel = new JPanel();
					JFrame frame1 = new JFrame();
					panel.add(new TestPane2());
					panel.add(new TestPaneHi2(mD));
					mD.add(panel);
					mD.getContentPane().add(panel);
					mD.setVisible(true);
					mD.setBounds(0,0,600,700);
					
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
		});
		
		btnNext.setBounds(577, 573, 117, 29);
		contentPane.add(btnNext);
		
		btnPrevious = new JButton("previous");
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageFourHalf mD = new TwoPageFourHalf();
					mD.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
		});
		btnPrevious.setBounds(6, 573, 117, 29);
		contentPane.add(btnPrevious);
		
		txtrFinallyTheData = new JTextArea();
		txtrFinallyTheData.setText("Finally, the data is copied from the socket in kernel space (kernel memory space) to the \nrecieving user process (user memory space) via a buffer");
		txtrFinallyTheData.setBackground(new Color(224, 255, 255));
		txtrFinallyTheData.setBounds(60, 487, 581, 50);
		contentPane.add(txtrFinallyTheData);
	}

}
