import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestPreview2 implements ActionListener
{
	JFrame frame;
	JPanel panel;
	JButton butt1;
	JButton butt2;
	JButton butt3;
	JButton butt4;
	int last = -1;
	int u = 0;
	int d = 1;
	int l = 2;
	int r = 3;

	public static void main(String[] args)
	{
		TestPreview2 frame = new TestPreview2();

	}

	TestPreview2()
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		panel = new JPanel();
		frame.add(panel);

		butt1 = new JButton("Up");
		panel.add(butt1);
		butt2 = new JButton("Down");
		panel.add(butt2);
		butt3 = new JButton("Left");
		panel.add(butt3);
		butt4 = new JButton("Right");
		panel.add(butt4);

		butt1.addActionListener(this);
		butt2.addActionListener(this);
		butt3.addActionListener(this);
		butt4.addActionListener(this);

		frame.setSize(900, 700);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

		if (e.getSource() == butt1)
		{
			if (last != u)
			{
				System.out.print("Up" + "\n");
				last = u;
			}
		}
		if (e.getSource() == butt2)
		{
			if (last != d)
			{
				System.out.print("Down" + "\n");
				last = d;
			}
		}
		if (e.getSource() == butt3)
		{
			if (last != l)
			{
				System.out.print("Left" + "\n");
				last = l;
			}
		}
		if (e.getSource() == butt4)
		{
			if (last != r)
			{
				System.out.print("Right" + "\n");
				last = r;
			}

		}
	}
}
