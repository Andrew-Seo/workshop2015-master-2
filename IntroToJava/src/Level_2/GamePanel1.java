package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel1 extends JPanel implements ActionListener
{
	Timer gameTimer;
	// int Blockx = 0;
	// int Blocky = 0;
	int Blockx = new Random().nextInt(500);
	int Blocky = new Random().nextInt(500);
	int l = new Random().nextInt(100);
	int d = new Random().nextInt(100);
	public int width = 200;
	public int height = 200;
	public int x = new Random().nextInt(500);
	public int y = new Random().nextInt(500);
	JFrame frame;
	JPanel panel;
	boolean rightmoving = true;
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(x, y + 100, width, height);
		g.fillRect(x, y + 100, width, height);
		g.fillRect(x, y + 100, width, height);
		
		
		
		
		//g.fillRect(Blockx, Blocky, width, 200);
	}

	GamePanel1()
	{
		
		gameTimer = new Timer(50, this);
		gameTimer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{

		 Blockx = Blockx + 2;
		 //Blocky = Blocky + 2;
		
//		  if (Blockx > 500 && rightmoving == true) 
//		  { 
//			  rightmoving = false;
//		  } 
//		  else if (rightmoving) 
//		  {
//			  Blockx = Blockx + 2;
//		  } 
//		  else 
//		  { 
//			  System.out.println(Blockx = Blockx - 2 ); 
//		  }
		 
//		if (Blockx < 500 && rightmoving == false)
//		{
//			Blockx = Blockx + l;
//			Blockx = Blockx - d;
//			rightmoving = true;
//		}
//		if (Blocky < 500 && rightmoving == false)
//		{
//			Blocky = Blockx + l;
//			Blocky = Blockx - d;
//		}
//		if (Blockx < 500 && rightmoving == true){
//			Blockx = Blockx - l;
//			Blockx = Blockx + d;
//		}
//		if (Blocky < 500 && rightmoving == true){
//			Blocky = Blockx - l;
//			Blocky = Blockx + d;
//		}
//		if(Blockx > 0 && rightmoving == true){
//			Blockx = Blockx - l;
//			Blockx = Blockx - d;
//			Blocky = Blocky + d;
//			Blocky = Blocky + l;
//		}

		repaint();

	}
}
