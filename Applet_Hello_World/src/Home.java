import java.applet.Applet;
import java.awt.Graphics;

public class Home extends Applet 
{
		public void paint(Graphics g)
		{
			int x[] = {150, 300, 225};
			int y[] = {150, 150, 25 };
			g.drawRect(150,150, 150, 200);
			g.drawRect(200, 200, 50, 50);
			g.drawPolygon(x,y,3);;
		}
}
