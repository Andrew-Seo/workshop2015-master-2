package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball
{

	public int x;
	public int y;
	private int height;
	private int width;
	public int direction = 2;
	boolean moveRight;
	boolean moveUp;
	int speed = 2;
	boolean lose;
	private Rectangle collisionbox;

	public Ball(int a, int b, int c, int d)
	{
		x = a;
		y = b;
		width = c;
		height = d;
		collisionbox = new Rectangle(a, b, c, d);
		moveUp = true;
		moveRight = true;
		lose = false;
	}

	public void update()
	{
		//moveBall();
		
		if (moveRight)
		{
			x+=speed;
		}
		else {
			x-=speed;
		}
		if (moveUp)
		{
			y-=speed;
		}
		else {
			y+=speed;
		}
		if (x<=0)
		{
			moveRight=true;
		}
		if (x>= Atari_Breakout.panelWidth- width)
		{
			moveRight=false;
		}
		if (y<= 0)
		{
			moveUp=false;
		}
		if (y>= Atari_Breakout.panelHeight)
		{
			lose=true;
		}
		
		collisionbox.setBounds(x, y, width, height);
	}
	
	void changeUpDirection(){
		moveUp=! moveUp;
	}

	public Rectangle getCollisionBox()
	{
		return collisionbox;
	}
	
	public boolean lost(){
		return lose;
	}

	public void setlost(boolean d){
		lose=d;
	}
	
	public void changeDirection()
	{
		if (moveUp)
		{
			moveUp=false;
		}
		
		else {
			moveUp=true;
		}
	}

	public void moveBall()
	{
		if (direction == 0)
		{
			x = x + 1;
			y = y + 1;
		}
		if (direction == 1)
		{
			x = x - 1;
			y = y + 1;
		}
		if (direction == 2)
		{
			x = x - 1;
			y = y - 1;
		}
		if (direction == 3)
		{
			x = x + 1;
			y = y - 1;
		}
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillOval(x, y, height, width);

	}
}
