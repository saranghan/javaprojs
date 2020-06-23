package animation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TwoPageFourHalf extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoPageFourHalf frame = new TwoPageFourHalf();
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
	public TwoPageFourHalf() {
		setBackground(new Color(224, 255, 255));
		setTitle("Data Movement & Encapsulation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTheEthernetFrame = new JTextArea();
		txtrTheEthernetFrame.setBackground(new Color(224, 255, 255));
		txtrTheEthernetFrame.setText("The Ethernet frame is then sent to the sending devices network interface card (NIC) using \ndirect memory access (DMA). DMA allows for the CPU to not get involved thus not wasting \nits time");
		txtrTheEthernetFrame.setBounds(15, 19, 573, 57);
		contentPane.add(txtrTheEthernetFrame);
		
		JTextArea txtrTheNicThen = new JTextArea();
		txtrTheNicThen.setBackground(new Color(224, 255, 255));
		txtrTheNicThen.setText("The NIC then sends the frame to the recieving devices NIC, where it will be detected upon \narrival, sending an interrupt to the CPU. The CPU then invokes the NIC driver to copy the \nframe to RAM using DMA\n");
		txtrTheNicThen.setBounds(15, 96, 573, 70);
		contentPane.add(txtrTheNicThen);
		
		JTextArea txtrTheFrameIs = new JTextArea();
		txtrTheFrameIs.setBackground(new Color(224, 255, 255));
		txtrTheFrameIs.setText("The Frame is then processed by its corresponding protocols within their layers of the OSI \nmodel\n");
		txtrTheFrameIs.setBounds(15, 177, 573, 42);
		contentPane.add(txtrTheFrameIs);
		
		JButton btnNewButton = new JButton("next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoPageFive dM5 = new TwoPageFive();
					dM5.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
			
		});
		btnNewButton.setBounds(471, 243, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("previous");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(6, 243, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
