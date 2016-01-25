import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JStuff implements ActionListener
{
	JFrame k;
	JPanel panel;
	JLabel label;
	Font TimesNewRoman;
	JButton Up;
	JButton Down;
	JButton color;
	JButton FontUp;
	JButton FontDown;
	int start = 0;
	int fontstart = 200;
	Random rand;

	public static void main(String[] args)
	{
		new JStuff();

	}

	JStuff()
	{
		k = new JFrame();
		k.setVisible(true);
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		label = new JLabel(start + "");
		TimesNewRoman = new Font("Times New Roman", Font.BOLD, fontstart);
		label.setFont(TimesNewRoman);
		label.setForeground(Color.GREEN);
		Up = new JButton("Up");
		panel.add(label);
		panel.add(Up);
		Down = new JButton("Down");
		panel.add(Down);
		color = new JButton("Color");
		panel.add(color);
		FontUp = new JButton("FontSizeUp");
		panel.add(FontUp);
		FontDown = new JButton("FontSizeDown");
		panel.add(FontDown);
		k.add(panel);
		FontUp.addActionListener(this);
		FontDown.addActionListener(this);
		Up.addActionListener(this);
		Down.addActionListener(this);
		color.addActionListener(this);

		k.setSize(500, 500);

		rand = new Random();
		new Color(rand.nextInt(256));
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == Up)
		{
			start++;
			label.setText(start + "");
		} else if (e.getSource() == Down)

		{
			start--;
			label.setText(start + "");
		} else if (e.getSource() == color)

		{
			label.setForeground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));

		} else if (e.getSource() == FontUp)
		{
			fontstart++;
			TimesNewRoman = new Font("Times New Roman", Font.BOLD, fontstart);
			label.setFont(TimesNewRoman);
		} else if (e.getSource() == FontDown)
		{
			fontstart--;
			TimesNewRoman = new Font("Times New Roman", Font.BOLD, fontstart);
			label.setFont(TimesNewRoman);
		}

	}
}
