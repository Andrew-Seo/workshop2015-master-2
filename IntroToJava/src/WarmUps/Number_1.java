package WarmUps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Number_1
{

	@Test
	public void testRegularCase()
	{
		Number_1_addon n = new Number_1_addon();
		assertEquals(3, n.exlaimcount("hello!!!"));
		assertEquals(2, n.exlaimcount("Good!Bye!"));
	}

	@Test
	public void testNoExclamation()
	{
		Number_1_addon n = new Number_1_addon();
		assertEquals(0, n.exlaimcount(""));
		assertEquals(0, n.exlaimcount("hello"));
	}

	@Test
	public void testPrimeNumber()
	{
		Number_1_addon n = new Number_1_addon();
		assertTrue(n.isPrime(17));
		assertTrue(n.isPrime(193));
	}

	@Test
	public void testNotPrime()
	{
		Number_1_addon n = new Number_1_addon();
		assertFalse(n.isPrime(9));
		assertFalse(n.isPrime(100));
	}

}
