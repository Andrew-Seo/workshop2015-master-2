// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		
		boolean isWeekday, isVacation;
		
		
		  //Ask the user for these values using
		  
		  int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		  
		if (result == JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "get up lazybones!");
		}
		else if (result == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "sleep in ");
		}
		 
		 
	}
}