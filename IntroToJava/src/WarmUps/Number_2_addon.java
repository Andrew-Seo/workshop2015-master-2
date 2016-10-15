package WarmUps;

import java.util.ArrayList;
import java.util.HashMap;

public class Number_2_addon
{

	public int[] maxFill(int[] input)
	{
		int[] result = new int[input.length];
		int[] finals = new int[input.length];
		int x = 0;
		for (int i = 0; i < input.length; i++)
		{
			if (x < input[i])
			{
				x = input[i];
			}
		}
		for (int i = 0; i < finals.length; i++)
		{
			finals[i] = x;
		}
		
		return finals;
	}

	public String mixString(String string, String string2)
	{
		String x = "";
		for (int i = 0; i < string.length(); i++)
		{
			if ("" + string.charAt(i) == "")
			{
				x+= string2.charAt(i);
			}
			if ("" + string2.charAt(i) == "")
			{
				x+= string.charAt(i);
			}
			x += "" + string.charAt(i) + string2.charAt(i);
		}
		System.out.println(x);
		return x;
	}

}
