package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph {
	
	Random random = new Random();
	Random random2 = new Random();
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		int number = random.nextInt(400);
		int number2 = random2.nextInt(400);
		g.fillRect(number, number2, getWidth(), getHeight());
		
	}

}
