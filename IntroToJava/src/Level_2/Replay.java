package Level_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Replay implements ActionListener
{
	Atari_Breakout breakout;
	JFrame framer;
	JPanel panels;
	JButton DontPlay;
	JButton Start;

	public static void main(String[] args)
	{

		Replay hellop = new Replay();
	}

	Replay()
	{
		framer = new JFrame();
		framer.setDefaultCloseOperation(framer.EXIT_ON_CLOSE);
		framer.setVisible(true);

		panels = new JPanel();
		framer.add(panels);

		DontPlay = new JButton("Don't Play");
		panels.add(DontPlay);
		DontPlay.addActionListener(this);

		Start = new JButton("Start");
		panels.add(Start);
		Start.addActionListener(this);

		framer.setSize(1900, 1000);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == Start)
		{
			Atari_Breakout a = new Atari_Breakout();

		}
		if (e.getSource() == DontPlay)
		{
			System.exit(0);
		}
	}
}
