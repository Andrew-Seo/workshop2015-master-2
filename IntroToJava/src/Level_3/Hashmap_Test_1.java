package Level_3;

import java.util.HashMap;

public class Hashmap_Test_1
{
	public static void main(String[] args)
	{
		HashMap map = new HashMap();		
		map.put("Eli", "pasta");
		map.put("Andrew", "quesadilla");
		map.put("Olivia", "pizza");
		map.put("Andrew2", "masala");
		
		getFavoriteFood("Olivia", map);
		replaceFavoriteFood("Eli", "soup", map);
		if (!doesAnyoneLike("pasta", map)){
			print"no one likes pasta"
		}
	}

	public static String getFavoriteFood(String name, HashMap map)
	{
		map.get("Eli");
		map.get("Olivia");
		map.get("Andrew2");
		map.get("Andrew");
		return name;
	}

	public static void replaceFavoriteFood(String name, String newfood, HashMap map)
	{
		map.put(name, newfood);
	}

	public static boolean doesAnyoneLike(String food, HashMap map)
	{
		return true;
	}
}
