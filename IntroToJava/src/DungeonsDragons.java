import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DungeonsDragons implements ActionListener
{
	JFrame peh;

	JPanel panel;

	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton ButtonClear;

	JTextField Modifier;

	JLabel CurrentRoll;
	JLabel Total;

	int x = 0;
	int y = 0;
	int z = 0;

	public static void main(String[] args)
	{
		DungeonsDragons flappy = new DungeonsDragons();
	}

	DungeonsDragons()
	{
		peh = new JFrame();
		peh.setDefaultCloseOperation(peh.EXIT_ON_CLOSE);
		peh.setVisible(true);

		panel = new JPanel();
		peh.add(panel);
		Button1 = new JButton("Dice: 4");
		panel.add(Button1);
		Button2 = new JButton("Dice: 6");
		panel.add(Button2);
		Button3 = new JButton("Dice: 8");
		panel.add(Button3);
		Button4 = new JButton("Dice: 10");
		panel.add(Button4);
		Button5 = new JButton("Dice: 12");
		panel.add(Button5);
		Button6 = new JButton("Dice: 20");
		panel.add(Button6);
		ButtonClear = new JButton("Clear");
		panel.add(ButtonClear);
		CurrentRoll = new JLabel(x + "");
		panel.add(CurrentRoll);
		Total = new JLabel(x + "");
		panel.add(Total);
		Modifier = new JTextField(10);
		panel.add(Modifier);

		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Button4.addActionListener(this);
		Button5.addActionListener(this);
		Button6.addActionListener(this);
		ButtonClear.addActionListener(this);
		Modifier.addActionListener(this);

		peh.setSize(900, 700);
		peh.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Random lol = new Random();
		// TODO Auto-generated method stub
		try
		{
			z = Integer.parseInt(Modifier.getText());

		} catch (Exception e2)
		{
			z = 0;
		}
		y += x + z;

		if (e.getSource() == Button1)
		{
			x = lol.nextInt(4) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == Button2)
		{
			x = lol.nextInt(6) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == Button3)
		{
			x = lol.nextInt(8) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == Button4)
		{
			x = lol.nextInt(10) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == Button5)
		{
			x = lol.nextInt(12) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == Button6)
		{
			x = lol.nextInt(20) + 1;
			CurrentRoll.setText(x + "");
			y += x;
			Total.setText(y + "");
		}

		else if (e.getSource() == ButtonClear)
		{
			x = 0;
			y = 0;
			CurrentRoll.setText(x + "");
			Total.setText(y + "");
		}

	}
}