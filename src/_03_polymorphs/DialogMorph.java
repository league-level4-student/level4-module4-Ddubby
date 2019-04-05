package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class DialogMorph extends Polymorph{

	DialogMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

}
