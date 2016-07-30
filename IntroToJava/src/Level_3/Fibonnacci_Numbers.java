package Level_3;

import java.util.ArrayList;

public class Fibonnacci_Numbers
{
	public static void main(String[] args)
	{
		int w = 1;
		int c = 1;
		int x = w + c;
		int s = x;
		for(int i = 0;i<100;i++){
		ArrayList<Integer> BonNum = new ArrayList<Integer>();
		BonNum.add(x);
		x = w + c;
		System.out.println(BonNum);
		}
	}
}
