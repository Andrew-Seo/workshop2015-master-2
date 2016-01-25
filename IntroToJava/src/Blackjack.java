import java.util.Random;

import javax.swing.JOptionPane;

public class Blackjack
{
	public static void main(String[] args)
	{
		JOptionPane
				.showMessageDialog(null,
						"The object of this game is to get the number 21. Anything over 21, is a bust. Anything below is acceptable, but the goal is 21.");
		int card = new Random().nextInt(20) + 1;
		int hit = new Random().nextInt(10);
		JOptionPane.showMessageDialog(null, "YOU got " + card);
		int hat = JOptionPane.showConfirmDialog(null, "Do you want a HIT?", "", JOptionPane.YES_NO_OPTION);
		if (JOptionPane.YES_OPTION == hat)
		{
			while (JOptionPane.YES_OPTION == hat)
			{
				hit = new Random().nextInt(10);
				card += hit;
				JOptionPane.showMessageDialog(null, "YOU got " + card);
				JOptionPane.showConfirmDialog(null, "Do you want a HIT AGAIN?", "", JOptionPane.YES_NO_OPTION);
				int lat = JOptionPane.showConfirmDialog(null, "Do you want a HIT?", "", JOptionPane.YES_NO_OPTION);
				if (card > 21)
				{
					JOptionPane.showMessageDialog(null, "BUST!!!");
				} else if (JOptionPane.NO_OPTION == hat)
				{
					
					String stand = JOptionPane.showInputDialog(null, "In the end, YOU got " + card);
				}
			}
		}

		else if (card > 21)
		{
			JOptionPane.showMessageDialog(null, "BUST!!!");
		}

		else if (card <= 21)
		{
			String stand = JOptionPane.showInputDialog(null, "In the end, YOU got " + card);
			JOptionPane.showMessageDialog(null, "OK!!!");
		}
	}
}