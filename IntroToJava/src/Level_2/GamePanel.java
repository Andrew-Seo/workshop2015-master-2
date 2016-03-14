package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener
{
	Timer gameTimer;
	// int Blockx = 0;
	// int Blocky = 0;
	int Blockx = new Random().nextInt(500);
	int Blocky = new Random().nextInt(500);
	int l = new Random().nextInt(100);
	int d = new Random().nextInt(100);
	boolean rightmoving = true;

	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(Blockx, Blocky, 200, 200);

	}

	GamePanel()
	{
		gameTimer = new Timer(50, this);
		gameTimer.start();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		// Blockx = Blockx + 2;
		// Blocky = Blocky + 2;
		/*
		 * if (Blockx > 500 && rightmoving == true) { rightmoving = false;
		 * 
		 * } else if (rightmoving) { Blockx = Blockx + 2; } else { Blockx =
		 * Blockx - 2; }
		 */
		if (Blockx < 500)
		{
			Blockx = Blockx + l;
			Blockx = Blockx - d;
		}
		if (Blocky < 500)
		{
			Blocky = Blockx + l;
			Blocky = Blockx - d;
		}

		repaint();

	}
}
