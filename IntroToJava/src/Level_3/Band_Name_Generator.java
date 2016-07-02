package Level_3;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Band_Name_Generator
{
	public static void main(String[] args)
	{
		int random1 = new Random().nextInt(5);
		int random2 = new Random().nextInt(5);
		ArrayList<String> adj = new ArrayList <String>();
		ArrayList<String> noun = new ArrayList <String>();
		adj.add("Annoying");
		adj.add("Perturbed");
		adj.add("Sighing");
		adj.add("Indiscriminate");
		adj.add("Killer");
		noun.add("Wombats");
		noun.add("Frogs");
		noun.add("Wolves");
		noun.add("Melons");
		noun.add("Mill");
		JOptionPane.showMessageDialog(null, "Your Random Band Name Is: " + adj.get(random1) + " " + noun.get(random2) + "!");
	}
	
}
