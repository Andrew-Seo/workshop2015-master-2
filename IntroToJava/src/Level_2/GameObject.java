package Level_2;

import java.util.Random;

import com.sun.prism.Graphics;

public class GameObject
{
	public int width = 200;
	public int height = 200;
	public int x = new Random().nextInt(500);
	public int y = new Random().nextInt(500);
	
	public void draw(Graphics g){
		g.fillRect(x, y, width, height);
	}
	
}
