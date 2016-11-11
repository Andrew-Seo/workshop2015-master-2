package Level_3;

import java.util.Arrays;

public class Bubble_Sort
{
	public static void main(String[] args)
	{
		String[] words = { "guacamole", "oranges", "papayas", "banana", "apple" };
		String[] sortedWords = sort(words);
		for (int i = 0; i < sortedWords.length; i++)
		{
			System.out.println(sortedWords[i]);
		}
	}

	// STANDARD
	// private static String[] sort(String[] words)
	// {
	// // procedure bubbleSort( A : list of sortable items )
	// // n = length(A)
	// // repeat
	// // swapped = false
	// // for i = 1 to n-1 inclusive do
	// // /* if this pair is out of order */
	// // if A[i-1] > A[i] then
	// // /* swap them and remember something changed */
	// // swap( A[i-1], A[i] )
	// // swapped = true
	// // end if
	// // end for
	// // until not swapped
	// // end procedure
	// int n = words.length;
	// boolean swapped;
	// String[] sortedWords = Arrays.copyOf(words, n);
	// do
	// {
	// swapped = false;
	// for (int i = 1; i <= (n - 1); i++)
	// {
	// if (sortedWords[i - 1].compareTo(sortedWords[i]) > 0)
	// {
	// System.out.format("swapping %s and %s \n", sortedWords[i - 1],
	// sortedWords[i]);
	// String w = sortedWords[i - 1];
	//
	// sortedWords[i - 1] = sortedWords[i];
	// sortedWords[i] = w;
	// swapped = true;
	// }
	// }
	// } while (swapped);
	// return sortedWords;
	// }

	// OPTIMIZED
	private static String[] sort(String[] words)
	{
		// procedure bubbleSort( A : list of sortable items )
		// n = length(A)
		// repeat
		// newn = 0
		// for i = 1 to n-1 inclusive do
		// if A[i-1] > A[i] then
		// swap(A[i-1], A[i])
		// newn = i
		// end if
		// end for
		// n = newn
		// until n = 0
		// end procedure
		int n = words.length;
		String[] sortedWords = Arrays.copyOf(words, n);
		do
		{
			int newn = 0;
			for (int i = 1; i <= (n - 1); i++)
			{
				if (sortedWords[i - 1].compareTo(sortedWords[i]) > 0)
				{
					String wor = sortedWords[i - 1];
					sortedWords[i - 1] = sortedWords[i];
					sortedWords[i] = wor;
					newn = i;
				}
			}
			n = newn;
		} while (n != 0);
		return sortedWords;
	}
}
