package Level_3;

import java.util.Stack;

public class Stack_Practice
{
	static Stack<Character> stock = new Stack<Character>();
	static String j = "jk";
	public static void main(String[] args)
	{
		Stack_Practice s = new Stack_Practice();
		reverseWord(j);
		System.out.println(reverseWord(j));
	}

	static String reverseWord(String w)
	{
		String backwards = "";
		Character back;
		for (int i = 0; i < w.length(); i++)
		{
			w.charAt(i);
			stock.push(w.charAt(i));
		}
		for (int i = 0; i < w.length(); i++)
		{
			back = stock.pop();
			backwards = backwards + back;
		}
		backwards.toString();
		
		return backwards;
	}

	Stack_Practice()
	{
//		while (true)
//		{
//			stock.push(new Stack_Practice());
////			System.out.println(stock.capacity());
//
//		}
	}
}
