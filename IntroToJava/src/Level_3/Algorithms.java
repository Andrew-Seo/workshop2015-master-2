package Level_3;

import java.util.List;

public class Algorithms
{
	public static void main(String[] args)
	{

	}

	public static Object findBrokenEgg(List<String> eggs)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < eggs.size(); i++)
		{
			if (eggs.get(i).contains("cracked"))
			{
				return (i);
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters)
	{
		// TODO Auto-generated method stub
		for (int i = 0; i < oysters.size(); i++)
		{
			if (oysters.get(i) == true)
			{
				return (i);
			}
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps)
	{
		double tallest = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < peeps.size(); i++)
		{
			if (peeps.get(i) >= tallest)
			{
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static Object findLongestWord(List<String> words)
	{
		// TODO Auto-generated method stub
		String Longest = "smol";
		for (int i = 0; i < words.size(); i++)
		{
			if (words.get(i).length() > Longest.length())
			{
				Longest = words.get(i);
			}
		}
		System.out.println(Longest);
		return Longest;
	}

	public static Object containsSOS(List<String> message)
	{
		// TODO Auto-generated method stub
		String Code = "... --- ...";
		if (message)
		{

		}
	}
}
