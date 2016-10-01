package Level_3;

public class PracticeTest1B
{
	public String repeatWithString(String string, String string2, int i)
	{
		String A = "";
		for (int j = 0; j < i - 1; j++)
		{
			A = A + string;
			A = A + string2;
		}
		A = A + string;
		return A;
	}
	public boolean hasRepeatingChar(String s3)
	{
		char [] letters = s3.toCharArray();
		for (int i = 0; i < letters.length; i++)
		{
			char s = letters[i];
			for (int j = i + 1; j < letters.length; j++)
			{
				char d = letters[j];
				if (d == s)
				{
					return true;
				}
			}
		}
		return false;
	}
}
