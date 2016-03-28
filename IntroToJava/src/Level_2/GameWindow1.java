package Level_2;

import javax.swing.JFrame;

import com.sun.prism.Graphics;


public class GameWindow1{
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

JFrame window;
	GamePanel1 myPanel;

public static void main(String[] arg){
		new GameWindow1();
	}

	GameWindow1(){
		window = new JFrame();
		window.setVisible(true);
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new GamePanel1();
		
		window.add(myPanel); //This should not give you any errors.
	}
}

