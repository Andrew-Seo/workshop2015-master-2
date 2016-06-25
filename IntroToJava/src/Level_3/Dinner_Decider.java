package Level_3;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Dinner_Decider
{
	
public static void main(String[] args)
{
	int r = new Random().nextInt(7);
	ArrayList<String> fruit = new ArrayList<String>();
	fruit.add("Cheeseburgers");
	fruit.add("Bananas");
	fruit.add("Apples");
	fruit.add("Pears");
	fruit.add("Cookies");
	fruit.add("Steak");
	fruit.add("Papayas");
	
	JOptionPane.showMessageDialog(null, "The food you will eat today is " + "" + fruit.get(r));
}
}
