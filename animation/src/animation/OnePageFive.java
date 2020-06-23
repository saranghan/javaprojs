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

public class OnePageFive extends JFrame {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1500, 700));
		frame.setTitle("Routing");

		JPanel panel = new JPanel();

		TestPane6 testPane = new TestPane6();
		panel.add(testPane);
		TestPaneHi6 testPaneHi = new TestPaneHi6(frame);
		panel.add(testPaneHi);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}
}

class TestPane6 extends JPanel {

	Image img = new ImageIcon(this.getClass().getResource("/r4.png")).getImage();

	int x = 960, y = 258, radius = 20, velX = 10, velY = 3, change = 0;

	public TestPane6() {
		
		setLayout(null);
		JTextArea txt1 = new JTextArea();
		
		txt1.setText("Data gets decapsulated \nand processed within their\nrespective layers");
		txt1.setBounds(1030, 430, 200, 200);
		add(txt1);
		setLayout(null);

		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if(y <= 50) {
					x = 960;
					y = 258;
				}
				
				x = 1240;
				y -= velY;
				System.out.println(y);
				repaint();

			}
		});
		timer.start();
	}

	public Dimension getPreferredSize() {
		return new Dimension(1500, 600);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		g.drawImage(img, 0, 0, this);
		setOpaque(false);

		g.setColor(Color.yellow);
		g.fillRect(x - 60, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("Data", x - 45, y + 1);

		g.setColor(Color.red);
		g.fillRect(x, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("TCP", x + 15, y - 5);
		g.drawString("Headers", x + 7, y + 7);
		

		g.setColor(Color.lightGray);
		g.fillRect(x + 60, y - radius, radius * 3, radius + 10);
		g.setColor(Color.black);
		g.drawString("IP", x + 82, y - 5);
		g.drawString("Headers", x + 65, y + 7);
		
		
		if( y <= 171) {
			g.setColor(Color.white);
			g.fillRect(x + 60, y - radius, radius * 3, radius + 10);
			g.setColor(Color.white);
			g.drawString("IP", x + 82, y - 5);
			g.drawString("Headers", x + 65, y + 7);
		}
		
		if(y <= 132) {
			g.setColor(Color.white);
			g.fillRect(x, y - radius, radius * 3, radius + 10);
			g.setColor(Color.white);
			g.drawString("TCP", x + 15, y - 5);
			g.drawString("Headers", x + 7, y + 7);
		}
		
		

		g.setColor(Color.black);

		g.drawRect(910, 68, 190, 160);
		g.drawString("Application Layer", 950, 93);

		// g.drawRect(910, 28, 190, 120);
		g.drawString("Transport Layer", 950, 278 - 145);

		// g.drawRect(910, 78, 190, 160);
		g.drawString("Network Layer", 950, 278 - 105);

		// g.drawRect(910, 28, 190, 200);
		g.drawString("Datalink Layer", 950, 278 - 65);

		Font font = g.getFont().deriveFont(35.0f);
		g.setFont(font);
		g.drawString("OSI Model previously mentioned in ", 180, 100);
		g.drawString('"' + "Data Movement & Encapsulation" + '"', 185, 145);

	}
}

class TestPaneHi6 extends JPanel {

	boolean isClicked;
	JButton btnNext = new JButton("next");

	public TestPaneHi6(JFrame frame) {

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
					IntroPage iP = new IntroPage();
					iP.setVisible(true);
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