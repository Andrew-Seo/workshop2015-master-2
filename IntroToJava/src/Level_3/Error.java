package Level_3;

public class Error
{
	public static void main(String[] args)
	{
		int x = 2;
		try
		{
			int y = x / 0;
		} catch (ArithmeticException e)
		{
			System.out.println("Crash Avoided");
			e.printStackTrace();
			throw new IllegalArgumentException();
		}
	}
}
