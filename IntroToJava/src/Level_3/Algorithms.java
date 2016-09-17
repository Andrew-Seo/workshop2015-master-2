package Level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Algorithms
{
	static Stack<Character> stock = new Stack<Character>();

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
		for (int i = 0; i < message.size(); i++)
		{
			if (message.get(i).contains(Code))
			{
				return true;
			}
		}
		return false;
	}

	static int findIndexOfSmallest(List<Double> results)
	{
		double smallest = 60.3;
		int indexOfSmallest = 0;
		for (int i = 0; i < results.size(); i++)
		{
			if (results.get(i) <= smallest)
			{
				smallest = results.get(i);
				indexOfSmallest = i;
			}
		}
		System.out.println(indexOfSmallest);
		return indexOfSmallest;
	}

	public static ArrayList<Double> sortScores(List<Double> results)
	{
		ArrayList<Double> sorted = new ArrayList<Double>();
		int size = results.size();
		for (int i = 0; i < size; i++)
		{
			int indexOfSmallest = findIndexOfSmallest(results);
			sorted.add(results.get(indexOfSmallest));
			results.set(indexOfSmallest, 1000.0);
		}
		System.out.println(results);
		return sorted;
	}

	public static Object sortDNA(List<String> unsortedSequences)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> sortWords(List<String> words)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
