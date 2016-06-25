package Level_3;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jokes_Punches
{
public static void main(String[] args)
{
	ArrayList <String> Funny = new ArrayList <String> ();
	Funny.add("I’m employed at a computer security company and have a colleague whose name is M. Alware. ");
	Funny.add("My ex-boss’s name is R. Stone.");
	Funny.add("My high school assignment  was to ask a veteran about World War II. Since my father had served  in the Philippines during the war,  I chose him. After a few basic questions, I very gingerly asked, “Did you ever kill anyone?”");
	Funny.add("");
 	int s = new Random().nextInt(4);
	
	JOptionPane.showMessageDialog(null, Funny.get(s));
	
	ArrayList <String> Punchline = new ArrayList <String> ();
	Punchline.add("His e-mail address is malware@company.com.");
	Punchline.add("His e-mail was stoner@company.co.in.");
	Punchline.add("");
	Punchline.add("");
 	int d = new Random().nextInt(4);
	
	JOptionPane.showMessageDialog(null, Funny.get(d));
}
}
