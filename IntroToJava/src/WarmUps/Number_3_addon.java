package WarmUps;

public class Number_3_addon
{

	public String getFirstThreeChars(String string)
	{
		String x = "";
		x = string.substring(0, 3);
		return x;
	}

	public Object addUnlessSame(int i, int j)
	{
		int x = 0;
		if (i == j){
			x = 0;
			return x;}
			else {
				x = i + j;
				return x;
			}
	}

	public int [] reduceArrayByHalf(int[] a1)
	{
		int [] m = new int [a1.length];
		for (int i = 0; i < a1.length; i++)
		{
			m [i] = a1 [i]/2;
		}
		return m;
	}

}
