package Level_3;

import java.util.HashMap;

public class Hashmap_charCount
{
	public static void main(String[] args)
	{

	}

	public int charcount(String input, char check)
	{
		HashMap hm = new HashMap();
		if (hm.containsKey(check))
		{
			int curcount = (Integer) hm.get(check);
			hm.put(check, curcount + 1);
			return curcount;

		} else
			hm.put(check, 1);
		return (0);
	}

}
