package Level_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Atari_Breakout implements ActionListener, KeyListener, MouseMotionListener
{
	JFrame frame;
	JButton play;
	JButton exit;
	Animation_Panel panel;
	Timer timer;

	public final int panelWidth = 1900;
	public final int panelHeight = 1000;

	public static void main(String[] args)
	{
		Atari_Breakout Window = new Atari_Breakout();

	}

	Atari_Breakout()
	{

		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(this);
		frame.addMouseMotionListener(this);

		panel = new Animation_Panel();
		frame.add(panel);

		timer = new Timer(1000 / 240, this);
		timer.start();

		play = new JButton("Play");
		panel.add(play);
		play.addActionListener(this);

		exit = new JButton("Exit");
		panel.add(exit);
		exit.addActionListener(this);

		frame.setSize(panelWidth, panelHeight);

		int currentX = 0;
		int currentY = 400;

		// Create Blox
		Blocks.Blox[0] = new Blocks(0, 0, 2400, 5, false);
		Blocks.Blox[1] = new Blocks(1895, 0, 5, 1000, false);
		Blocks.Blox[2] = new Blocks(0, 0, 5, 1000, false);
		for (int i = 0; i < 76; i++)
		{
			Random random = new Random();
			int rWidth = random.nextInt(70) + 60;

			Blocks.Blox[i + 3] = new Blocks(currentX, currentY, rWidth, 50, true);
			currentX = currentX + rWidth + 5;
			if (currentX > 1850)
			{
				currentY = currentY + 60;
				if (76 - i < 12)
				{
					break;
				}
				currentX = 0;
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		panel.update();
		panel.repaint();
		if (e.getSource() == play)
		{
			timer.stop();
		}
		if ()
		{
			
		}
		if (e.getSource() == exit)
		{
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		}
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e)
	{
		// TODO Auto-generated method stub
		panel.movePinger(e.getX());
	}
}