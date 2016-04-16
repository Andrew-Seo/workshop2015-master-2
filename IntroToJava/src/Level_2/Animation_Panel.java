package Level_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Animation_Panel extends JPanel implements ActionListener
{
	public int holdposition=0;
	Pinger pinger;
	Blocks blocks;
	Ball ball;
	Atari_Breakout frum;
	Font Big;
	int spawnX = new Random().nextInt(1875) + 25;
	int spawnY = 750;
	int lives = 5;
	int blockwidth=100;
	int blockheight=100;
	int row = 4;
	int column = 19;
	boolean sound = true;
	Timer timer;
	
	ArrayList <Blocks> blocklist;

	Animation_Panel(Atari_Breakout x)
	{
		
		frum = x;
		pinger = new Pinger(800, 900, 400, 15);
		ball = new Ball(spawnX, spawnY, 20, 20);
		//blocks = new Blocks(925, 450, 125, 50, false, Color.BLUE);
		Big = new Font("Times New Roman", Font.BOLD, 100);
		
		blocklist = new ArrayList <Blocks>();
		generateBlocks();
		
		
		timer = new Timer(1000 / 240, this);
		timer.start();

	}
	
	private void generateBlocks(){
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				Blocks b = new Blocks(j*blockwidth, i*blockheight,blockwidth, blockheight, true); 
				blocklist.add(b);
			}
		}
	}

	public void paint(Graphics g)
	{

		g.fillRect(0, 0, 1900, 10000);
		
		for (Blocks c: blocklist)
		{
			c.paint(g);
			
		}
		
	pinger.paint(g);
		// blocks.paint(g);
		ball.paint(g);
		g.setColor(Color.WHITE);
		g.setFont(Big);
		g.drawString("Lives:" + lives, 50, 100);

	}

	private void checkcollisionbox()
	{
		Rectangle r1 = pinger.getCollisionBox();
		Rectangle r2 = ball.getCollisionBox();
		
		if (r1.intersects(r2))
		{
			
			ball.changeDirection();
			frum.playSound("18529.wav");
		} 
		
		for (Blocks b: blocklist)
		{
			Rectangle rb = b.getCollisionBox();
			if (rb.intersects(r2))
			{
				b.breakblox();
				ball.changeDirection();
				frum.playSound("18528.wav");
			}
		}
//				frum.playSound("18529.wav"); pinger intersects blox

	}

	public void update()
	{
		pinger.move(holdposition);
		ball.update();
//      pinger.update();
	checkcollisionbox();
//		if (ball.y > 1000)
//		{
//			ball.x = spawnX;
//			ball.y = spawnY;
//			lives = lives - 1;
//		}
//		if (lives == 0)
//		{
//			frum.playSound("18533.wav");
//			JOptionPane.showMessageDialog(null, "YOU LOSE!!!");
//			System.exit(0);
//		}
//		System.out.println(Blocks.Blox.length);
//		boolean allbroken = true;
//		for (int i = 0; i < Blocks.Blockamount - 1; i++)
//		{
//			if (Blocks.Blox[i].breakable)
//			{
//				if (Blocks.Blox[i].y != -100)
//				{
//					allbroken = false;
//				}
//			}
//		}
//		if (allbroken)
//		{
//
//			// replay = new Replay();
//			System.exit(0);
//		}
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		update();
		repaint();
	}

}
