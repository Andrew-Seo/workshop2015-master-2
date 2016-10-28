package WarmUps;

import static org.junit.Assert.*;

import org.junit.Test;

public class Number_3
{
	public static void main(String[] args)
	{
		
	}
	@Test
	public void testGetGirstThreeChars(){
		Number_3_addon m = new Number_3_addon();
		assertEquals("can", m.getFirstThreeChars("canalope"));
		assertEquals("app", m.getFirstThreeChars("application"));
		assertEquals("Sev", m.getFirstThreeChars("Seven"));
	}
	@Test
	public void testAddUnlessSame(){
		Number_3_addon m = new Number_3_addon();
		assertEquals(7, m.addUnlessSame(3,4));
		assertEquals(0, m.addUnlessSame(10,10));
		assertEquals(25, m.addUnlessSame(5,20));
		assertEquals(0, m.addUnlessSame(1,1));
	}
	@Test
	public void testReduceArrayByHalf(){
		Number_3_addon m = new Number_3_addon();
		int [] a1 = {10, 6, 24};
		int [] a2 = {5, 3, 12};
		assertArrayEquals(a2, m.reduceArrayByHalf(a1));
	}
}
