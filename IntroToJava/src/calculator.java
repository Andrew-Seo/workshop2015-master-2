
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener
{

	JFrame meh;
	JButton add;
	JButton mult;
	JPanel panel;
	JTextField num1;
	JTextField num2;

	public static void main(String[] args)
	{
		calculator lol = new calculator();
	}

	calculator()
	{
		JFrame meh = new JFrame();
		meh = new JFrame();
		meh.setDefaultCloseOperation(meh.EXIT_ON_CLOSE);
		meh.setVisible(true);

		JPanel panel = new JPanel();
		meh.add(panel);
		JTextField num1 = new JTextField(6);
		panel.add(num1);
		JTextField num2 = new JTextField(6);
		panel.add(num2);
		JButton add = new JButton("add");
		panel.add(add);
		JButton mult = new JButton("mult");
		panel.add(mult);

		meh.setSize(900, 700);
		meh.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		if (e.getSource() == num1)
		{

		}

	}
}
