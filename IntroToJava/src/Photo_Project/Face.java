package Photo_Project;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class Face
{
	JFrame spen;

	public static void main(String[] args)
	{
		Face fa = new Face();

	}

	Face()
	{
		spen = new JFrame();
		spen.setDefaultCloseOperation(spen.EXIT_ON_CLOSE);
		Robot Anderz = new Robot();
		Anderz.setPenWidth(5);
		Anderz.penDown();
		Anderz.setSpeed(10);
		head(Anderz);
		eye1(Anderz);
		eye2(Anderz);
		nose(Anderz);
		mouth(Anderz);

		spen.setSize(700, 700);
	}

	void head(Robot s)
	{

		s.setX(450);
		s.setY(350);
		for (int i = 0; i < 360; i++)
		{
			s.turn(1);
			s.move(5);
		}
	}

	void eye1(Robot s)
	{

		s.setX(550);
		s.setY(350);
		for (int i = 0; i < 360; i++)
		{
			s.turn(1);
			s.move(1);
		}
	}

	void eye2(Robot s)
	{

		s.setX(825);
		s.setY(350);
		for (int i = 0; i < 360; i++)
		{
			s.turn(1);
			s.move(1);
		}
	}

	void nose(Robot s)
	{

		s.setX(750);
		s.setY(350);

		s.turn(150);
		s.move(150);
		s.turn(120);
		s.move(150);
		s.turn(120);
		s.move(150);
		s.turn(150);
	}

	void mouth(Robot s)
	{

		s.setX(862);
		s.setY(500);
		for (int i = 0; i < 180; i++)
		{
			s.turn(1);
			s.move(2);
		}
	}

}
