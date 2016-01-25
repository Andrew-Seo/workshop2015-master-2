package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Animation_Panel extends JPanel
{
	Pinger pinger;
	Blocks blocks;
	Ball ball;
	int spawnX = 975;
	int spawnY = 750;

	Animation_Panel()
	{
		pinger = new Pinger(800, 900, 400, 15);
		ball = new Ball(spawnX, spawnY, 20, 20);
		blocks = new Blocks(925, 450, 125, 50, false);

	}

	public void paint(Graphics g)
	{

		g.fillRect(0, 0, 1900, 10000);
		;

		for (int i = 0; i < Blocks.Blockamount - 1; i++)
		{
			g.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
			g.fillRect(Blocks.Blox[i].x, Blocks.Blox[i].y, Blocks.Blox[i].width, Blocks.Blox[i].height);

		}

		pinger.paint(g);
		// blocks.paint(g);
		ball.paint(g);
	}

	private void checkcollisionbox()
	{
		Rectangle r1 = pinger.getCollisionBox();
		Rectangle r2 = ball.getCollisionBox();
		if (r1.intersects(r2))
		{
			ball.changeDirection();
		}
		// System.out.println(r2.getWidth());
		// System.out.println(r1.getWidth());
		// System.out.println(r2.getHeight());
		// System.out.println(r1.getHeight());
		for (int i = 0; i < Blocks.Blockamount - 1; i++)
		{
			if (r2.intersects(Blocks.Blox[i].x, Blocks.Blox[i].y, Blocks.Blox[i].width, Blocks.Blox[i].height))
			{
				ball.changeDirection();
				if (blocks.Blox[i].breakable)
				{
					blocks.Blox[i].y = -100;
				}
			}
		}

	}

	public void update()
	{
		ball.update();
		pinger.update();
		checkcollisionbox();
		if (ball.y > 1000)
		{
			ball.x = spawnX;
			ball.y = spawnY;
		}
	}

	public void movePinger(int a)
	{
		pinger.x = a;

	}

}
