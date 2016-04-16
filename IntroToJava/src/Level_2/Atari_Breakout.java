package Level_2;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Atari_Breakout implements KeyListener, MouseMotionListener
{
	JFrame frame;
	Animation_Panel panel;

	public final int panelWidth = 1900;
	public final int panelHeight = 1000;
	
	public static void main(String[] args)
	{

		JOptionPane.showMessageDialog(null, "LOOK READ THE NEXT WINDOW CAREFULLY OR SUFFER THE CONSEQUENCES.\n IT IS VERY VERY IMPORTANT.");
		JOptionPane.showMessageDialog(null,
				"WARNING: If you have epilepsy or a seizure disorder. This may cause unexpected effects. \n DISCLAIMER: If you ignore the first sentence, and you get a seizure, it is not the creator's fault for he warned you. \n Also, there is a double jump effect that happens at random to spice the game up a bit. \n You have 5 Lives. \n Good Luck and have FUN.\n If you want to continue, press the \"START\" button. If you do not want to continue, press the \"Don't Start\" button.");

		Atari_Breakout Window = new Atari_Breakout();

	}

	Atari_Breakout()
	{

		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(this);
		frame.addMouseMotionListener(this);

		panel = new Animation_Panel(this);
		frame.add(panel);

		frame.setSize(panelWidth, panelHeight);
//
//		int currentX = 0;
//		int currentY = 400;
//
//		// Create Blox
//		Blocks.Blox[0] = new Blocks(0, 0, 2400, 5, false, Color.BLUE);
//		Blocks.Blox[1] = new Blocks(1895, 0, 5, 1000, false, Color.BLUE);
//		Blocks.Blox[2] = new Blocks(0, 0, 5, 1000, false, Color.BLUE);
//
//		/*
//		 * for (int i = 0; i < 1; i++) { Random random = new Random(); int
//		 * rWidth = random.nextInt(70) + 60;
//		 * 
//		 * Blocks.Blox[i + 3] = new Blocks(currentX, currentY, 1000, 50, true,
//		 * new Color((int) (Math.random() * 255), (int)
//		 * 
//		 * (Math.random() * 255), (int) (Math.random() * 255))); currentX =
//		 * currentX + rWidth + 5; if (currentX > 1850) { currentY = currentY +
//		 * 60; if (1 - i < 12) { break; } currentX = 0; } }
//		 * 
//		 * }
//		 */
//
//		for (int i = 0; i < 76; i++)
//		{
//			Random random = new Random();
//			int rWidth = random.nextInt(70) + 60;
//
//			Blocks.Blox[i + 3] = new Blocks(currentX, currentY, rWidth, 50, true, new Color((int) (Math.random() * 255), (int)
//
//			(Math.random() * 255), (int) (Math.random() * 255)));
//			currentX = currentX + rWidth + 5;
//			if (currentX > 1850)
//			{
//				currentY = currentY + 60;
//				if (76 - i < 12)
//				{
//					break;
//				}
//				currentX = 0;
//			}
//		}

	}

	public void playSound(String filename)
	{
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(filename));
		sound.play();
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
		panel.holdposition = e.getX();
		
		// TODO Auto-generated method stub
	}
}
