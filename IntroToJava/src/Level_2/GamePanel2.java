package Level_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel2 extends JPanel implements KeyListener, ActionListener
{
	
	int Blockx = new Random().nextInt(500);
	int Blocky = new Random().nextInt(500);
	int panelWidth = 1000;
	int panelHeight = 1000;
	Timer gameTimer;
	JFrame frame;
	JPanel panel;
	
	public static void main(String[] args)
	{
		GamePanel2 j = new GamePanel2();
	}

	GamePanel2()
	{
		gameTimer = new Timer (50, (ActionListener) this);
		gameTimer.start();
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.addKeyListener(this);

		panel = new JPanel();
		frame.add(panel);
		frame.setSize(panelWidth, panelHeight);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(Blockx, Blocky, 200, 200);

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
		if (e.getSource() == ""){
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
