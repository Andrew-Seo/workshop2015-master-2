package Level_2;

import java.awt.Color;
import java.awt.Graphics;

public class Blocks
{
	public int x;
	public int y;
	public int height;
	public int width;
	public boolean breakable;
	public Color randommy;
	static Blocks[] Blox = new Blocks[85];
	public static int Blockamount;

	public Blocks(int a, int b, int c, int d, boolean sup, Color supper)
	{
		x = a;
		y = b;
		width = c;
		height = d;
		Blockamount++;
		breakable = sup;
		randommy = supper;

	}

	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(925, 450, 125, 50);

	}
}
