package animation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.*;


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

public class TwoPageSix extends JFrame {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600, 700));
		frame.setTitle("Data Movement & Encapsulation");

		JPanel panel1 = new JPanel();

		TestPane2 testPane2 = new TestPane2();
		panel1.add(testPane2);
		TestPaneHi2 testPaneHi2 = new TestPaneHi2(frame);
		panel1.add(testPaneHi2);

		frame.add(panel1);
		frame.pack();
		frame.setVisible(true);

	}
}

class TestPane2 extends JPanel {

	Image img = new ImageIcon(this.getClass().getResource("/data6.png")).getImage();

	int x = 0, y = 560, radius = 20, velX = 10, velY = 10;

	public TestPane2() {

		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (x >= 410) {
					y = y - velY;
					x = 410;
				}

				if (y == 100 && x == 410) {
					x = 0;
					y = 560;
					x += velX;
					if (x >= 410) {
						y = y - velY;
						x = 410;
					}

				}
				x += velX;

				repaint();
				System.out.println(x + " " + y);

			}
		});
		timer.start();
	}

	public Dimension getPreferredSize() {
		return new Dimension(600, 600);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		g.drawImage(img, 0, 0, this);
		setOpaque(false);
		
		g.setColor(Color.yellow);
		g.fillRect(x - 45, y - radius, radius * 2, radius + 10);
		g.setColor(Color.black);
		g.drawString("Data", x - 40, y);
		
		g.setColor(Color.red);
		g.fillRect(x - 5, y - radius, radius + 40, radius + 10);
		g.setColor(Color.black);
		g.drawString("TCP", x+10, y - 5);
		g.drawString("Header", x + 3, y + 6);
		
		g.setColor(Color.blue);
		g.fillRect(x +55, y - radius, radius + 35, radius + 10);
		g.setColor(Color.black);
		g.drawString("IP", x+75, y - 5);
		g.drawString("Header", x + 60, y + 6);
		
		g.setColor(Color.lightGray);
		g.fillRect(x +110, y - radius, radius + 35, radius + 10);
		g.setColor(Color.black);
		g.drawString("Ethernet", x+110, y - 5);
		g.drawString("Header", x + 115, y + 6);
		
		if( y <= 460) {
			super.paintComponent(g);
			setLayout(null);
			g.drawImage(img, 0, 0, this);
			setOpaque(false);
			
			g.setColor(Color.yellow);
			g.fillRect(x - 45, y - radius, radius * 2, radius + 10);
			g.setColor(Color.black);
			g.drawString("Data", x - 40, y);
			
			g.setColor(Color.red);
			g.fillRect(x - 5, y - radius, radius + 40, radius + 10);
			g.setColor(Color.black);
			g.drawString("TCP", x+10, y - 5);
			g.drawString("Header", x + 3, y + 6);
			
			g.setColor(Color.blue);
			g.fillRect(x +55, y - radius, radius + 35, radius + 10);
			g.setColor(Color.black);
			g.drawString("IP", x+75, y - 5);
			g.drawString("Header", x + 60, y + 6);
			
		}
		if( y <= 360) {
			super.paintComponent(g);
			setLayout(null);
			g.drawImage(img, 0, 0, this);
			setOpaque(false);
			
			g.setColor(Color.yellow);
			g.fillRect(x - 45, y - radius, radius * 2, radius + 10);
			g.setColor(Color.black);
			g.drawString("Data", x - 40, y);
			
			g.setColor(Color.red);
			g.fillRect(x - 5, y - radius, radius + 40, radius + 10);
			g.setColor(Color.black);
			g.drawString("TCP", x+10, y - 5);
			g.drawString("Header", x + 3, y + 6);
			
		}
		if( y <= 260) {
			super.paintComponent(g);
			setLayout(null);
			g.drawImage(img, 0, 0, this);
			setOpaque(false);
			
			g.setColor(Color.yellow);
			g.fillRect(x - 45, y - radius, radius * 2, radius + 10);
			g.setColor(Color.black);
			g.drawString("Data", x - 40, y);
			
		}
	}
}

class TestPaneHi2 extends JPanel {

	boolean isClicked;
	JButton btnNext = new JButton("next");

	public TestPaneHi2(JFrame frame) {

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
					TwoPageSeven mD = new TwoPageSeven();
					mD.setVisible(true); 
					
					}catch(Exception d) {
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

/*
package animation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TwoPageSeven extends JFrame {

	private JPanel contentPane;

	
	 
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

	
	public TwoPageSeven() {
		setBackground(new Color(224, 255, 255));
		setTitle("Data Movement 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrTheNicThen = new JTextArea();
		txtrTheNicThen.setBackground(new Color(224, 255, 255));
		txtrTheNicThen.setText("Done :)");
		txtrTheNicThen.setBounds(15, 96, 573, 70);
		contentPane.add(txtrTheNicThen);
		
		JButton btnNewButton = new JButton("back to main menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					IntroPage jGD = new IntroPage();
					jGD.setVisible(true);
					}catch(Exception d) {
						JOptionPane.showMessageDialog(null, d);
					}
			}
			
		});
		btnNewButton.setBounds(423, 243, 165, 29);
		contentPane.add(btnNewButton);
		
	}

}

*/