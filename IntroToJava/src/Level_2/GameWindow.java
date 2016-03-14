package Level_2;

import javax.swing.JFrame;

import com.sun.prism.Graphics;

public class GameWindow
{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

	JFrame window;
	GamePanel myPanel;

	public static void main(String[] arg)
	{
		new GameWindow();
	}

	GameWindow()
	{
		window = new JFrame();
		window.setVisible(true);
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new GamePanel();
		window.add(myPanel);

		window.setSize(1000, 800);
	}

	public void paintComponent(Graphics g)
	{
		g.fillRect(10, 10, 200, 200);
	}
}
