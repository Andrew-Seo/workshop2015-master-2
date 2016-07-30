package Level_3;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers
{
	public static void main(String[] args)
	{
		ArrayList<Integer> LotNum = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
		{
			LotNum.add(new Random().nextInt(100) + 1);
		}
		System.out.println(LotNum);
		String J = JOptionPane.showInputDialog("Put in 5 numbers from 1-100. ex. [v, w, x, y, z]");
		System.out.println(J);
		
		if (J.equals(LotNum.toString()))
		{		
			System.out.println("You Won the Lottery!!!");
			System.out.println("Here's a Plastic, Golden Star.");
		}
		
	}
}
