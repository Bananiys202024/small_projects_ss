package put_image_on_text;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class God {
	
	public void please_put_image_on_text()
	{
		System.out.println("start");
		try {
		BufferedImage image = ImageIO.read(new File("input_image.jpg"));
		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(50f));
		g.setColor(new Color(50));
		g.drawString("Someone did put me here, fuck...", 100, 800);
		g.dispose();
		ImageIO.write(image, "png", new File("output_image.png"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
