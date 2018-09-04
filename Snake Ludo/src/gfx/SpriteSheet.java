package gfx;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	private BufferedImage sheet1;
	
	public SpriteSheet(BufferedImage sheet1) {
		this.sheet1 = sheet1;
	}
	
	public BufferedImage crop(int x, int y, int width, int height) {
		return sheet1.getSubimage(x, y, width, height);
	}
	
}
