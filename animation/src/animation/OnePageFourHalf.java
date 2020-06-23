package animation;

import java.awt.Color;
import java.lang.Math;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.border.EmptyBorder;

import java.awt.Insets;

public class OnePageFourHalf extends JFrame {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1500, 700));
		frame.setTitle("Routing");

		JPanel panel = new JPanel();

		TestPane8 testPane = new TestPane8();
		panel.add(testPane);
		TestPaneHi8 testPaneHi = new TestPaneHi8(frame);
		panel.add(testPaneHi);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}
}

class TestPane8 extends JPanel {

	Image img = new ImageIcon(this.getClass().getResource("/router.png")).getImage();

	int x = 960, y = 278, radius = 20, velX = 10, velY = 3, change = 0;
	boolean atTop = false;
	boolean atLeft = false;
	boolean atBottom = false;

	public TestPane8() {

		setLayout(null);
		JTextArea txt1 = new JTextArea();

		txt1.setText("Router checks the routing table\nand sends the IP packet to its \ndestination address");
		txt1.setBounds(950, 500, 200, 100);
		add(txt1);

		Timer timer = new Timer(80, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (y >= 119 && !atTop && !atLeft) {
					y -= velY;

				} else {
					atTop = true;
				}

				if (x >= 520 && atTop && !atLeft) {
					x -= velX;
				} else if (x < 520) {
					atLeft = true;
				}

				if (atTop && atLeft) {
					x += velX;
					y += velY + 4;
					if (x >= 890 && y >= 382) {
						x = 890;
						y = 382;
					}

				}

				System.out.println(atTop);
				System.out.println(atLeft);

				repaint();
				System.out.println(x + " " + y);
			}
		});
		timer.start();
	}

	public Dimension getPreferredSize() {
		return new Dimension(1500, 600);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		g.drawImage(img, 0, 0, this);
		setOpaque(false);
		g.setColor(Color.red);
		g.fillRect(x, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("TCP", x + 15, y - 5);
		g.drawString("Headers", x + 7, y + 7);

		g.setColor(Color.yellow);
		g.fillRect(x - 60, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("Data", x - 45, y + 1);

		g.setColor(Color.lightGray);
		g.fillRect(x + 60, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("IP", x + 82, y - 5);
		g.drawString("Headers", x + 65, y + 7);

		g.setColor(Color.black);

		g.drawRect(250, 20, 190, 200);
		g.drawString("Application Layer", 290, 40);

		// g.drawRect(910, 28, 190, 120);
		g.drawString("Transport Layer", 290, 80);

		// g.drawRect(910, 78, 190, 160);
		g.drawString("Network Layer", 290, 120);

		g.drawString("Physical Layer", 290, 200);

		g.setColor(Color.yellow);
		g.fillRect(250, 100, 190, 40);
		g.setColor(Color.black);
		g.setColor(Color.black);
		g.drawString("Network Layer", 290, 120);
		g.drawString("Datalink Layer", 290, 160);

		/*
		 * g.setColor(Color.black);
		 * 
		 * g.drawRect(1030, 20, 190, 200); g.drawString("Application Layer", 1070, 40);
		 * 
		 * // g.drawRect(910, 28, 190, 120); g.drawString("Transport Layer", 1070, 80);
		 * 
		 * // g.drawRect(910, 78, 190, 160);
		 * 
		 * 
		 * g.setColor(Color.yellow); g.fillRect(1030, 100, 190, 40);
		 * g.setColor(Color.black); g.drawString("Network Layer", 1070, 120);
		 * g.drawString("Datalink", 1070, 160); g.drawString("Physical Layer", 1070 ,
		 * 200);
		 * 
		 * 
		 * Font font = g.getFont().deriveFont(35.0f); g.setFont(font); g.
		 * drawString("OSI Model previously mentioned in Data Movement & Encapsulation",
		 * 150, 570);
		 */
	}

	public boolean atTop(int x, int y) {
		if (x == 960 && y == 122) {
			return true;
		}
		return false;
	}

	public boolean atLeft(int x, int y) {
		if (x == 520 && y == 119) {
			return true;
		}
		return false;
	}
}

@SuppressWarnings("serial")
class TestPaneHi8 extends JPanel {

	boolean isClicked;
	JButton btnNext = new JButton("next");

	public TestPaneHi8(JFrame frame) {

		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(false);
		setLocation(0, 600);

		// btnNext.addActionListener();
		btnNext.setBounds(460, 800, 117, 29);
		add(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					OnePageFour mD = new OnePageFour();
					JPanel panel = new JPanel();
					panel.add(new TestPane5());
					panel.add(new TestPaneHi5(mD));
					mD.add(panel);
					mD.getContentPane().add(panel);
					mD.setVisible(true);
					mD.setBounds(0, 0, 1500, 700);
				} catch (Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
			}
		});
	}

	public Dimension getPreferredSize() {
		return new Dimension(600, 200);
	}

	public boolean isClicked() {

		return isClicked;
	}

}