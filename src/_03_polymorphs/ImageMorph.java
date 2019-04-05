package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {

	
	BufferedImage image;
	
	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("10578_Image.jpg"));
		} catch(Exception e) {
			
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(Color.WHITE);
		g.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

}
