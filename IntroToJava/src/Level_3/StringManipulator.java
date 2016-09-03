package Level_3;

import java.util.ArrayList;

public class StringManipulator
{

	public Object reverseWord(String string)
	{
		String backwards = "";

		for (int i = 0; i < string.length(); i++)
		{
			int index = i;
			char x = string.charAt(index);
			backwards = x + backwards;
		}
		return backwards;
	}

	public Object capitalizeWord(String string)
	{
		// TODO Auto-generated method stub
		return string.toUpperCase();
	}

	public Object uncapitalizeWord(String string)
	{
		// TODO Auto-generated method stub
		return string.toLowerCase();
	}

}
