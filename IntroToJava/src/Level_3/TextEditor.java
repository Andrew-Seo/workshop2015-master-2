package Level_3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextEditor implements KeyListener
{
	static JFrame frame;
	static JPanel panel;
	static JLabel text;
	static String tex = "";

	static final int frameLength = 500;
	static final int frameWidth = 500;
	static Stack<Character> stock = new Stack<Character>();

	public static void main(String[] args)
	{
		TextEditor s = new TextEditor();
	}

	TextEditor()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);

		text = new JLabel();
		panel.add(text);

		frame.addKeyListener(this);

		frame.setSize(frameLength, frameWidth);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
		{
			stock.push(tex.charAt(tex.length() -1));
			tex = tex.substring(0, tex.length() -1);
			
			text.setText(tex);
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT){
			tex = tex + stock.pop();
			text.setText(tex);
		}
		else {
			char s = e.getKeyChar();
		tex = tex + s;
		text.setText(tex);}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}
}
