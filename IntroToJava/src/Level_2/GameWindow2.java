package Level_2;

import javax.swing.JFrame;

import com.sun.prism.Graphics;


public class GameWindow2{
	public static final int WIDTH = 1900;
	public static final int HEIGHT = 1000;

JFrame window;
	GamePanel2 myPanel;

public static void main(String[] arg){
		new GameWindow1();
	}

	GameWindow2(){
		window = new JFrame();
		window.setVisible(true);
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new GamePanel2();
		
		window.add(myPanel); //This should not give you any errors.
	}
}

