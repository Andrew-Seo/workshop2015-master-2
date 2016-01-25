import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
		
		int one = 1;
		 // 1. Use the dance method to make the Tortoise spin.
		 dance(one);
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
		 String numberOfSpins = JOptionPane.showInputDialog("How Dizzy Do You want to be? Choose the number of spins from 1 - 10. ");
		 int NumberOfSpins = Integer.parseInt(numberOfSpins);
		 dance(NumberOfSpins);
		
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
