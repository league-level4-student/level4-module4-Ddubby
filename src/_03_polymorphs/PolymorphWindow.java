package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	
	Polymorph polymorph;
	Polymorph polymorph2;
	Polymorph polymorph3;
	Polymorph polymorph4;
	Polymorph polymorph5;
	Polymorph polymorph6;
	Polymorph polymorph7;
	
	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>();

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);

		polymorph = new BluePolymorph(0, 0);
		polymorph2 = new RedMorph(50, 50);
		polymorph3 = new MovingMorph(100, 100);
		polymorph4 = new CircleMorph(250, 250);
		polymorph5 = new MousePolymorph(0, 0);
		polymorph6 = new ImageMorph(0, 400);
		polymorph7 = new DialogMorph(400, 400);
		window.addMouseListener(this);
		polymorphs.add(polymorph);
		polymorphs.add(polymorph2);
		polymorphs.add(polymorph3);
		polymorphs.add(polymorph4);
		polymorphs.add(polymorph5);
		polymorphs.add(polymorph6);
		polymorphs.add(polymorph7);

		timer = new Timer(1000 / 15, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (Polymorph polymorph : polymorphs) {
			polymorph.draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph polymorph : polymorphs) {
			polymorph.update();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (400 < e.getX() && 400 < e.getY()) {
			JOptionPane.showMessageDialog(null, "Click");
		}
		polymorph5.setX(e.getX());
		polymorph5.setY(e.getY() - 25);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
