package Level_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PracticeTest1A
{
	@Test
	public void testRepeatWithString(){
		PracticeTest1B a = new PracticeTest1B();
		String s1 = "AxAxA";
		String s2 = "BB!!!BB!!!BB!!!BB";
		String s3 = "word";
		assertEquals(s1, a.repeatWithString("A", "x", 3));
		assertEquals(s2, a.repeatWithString("BB", "!!!", 4));
		assertEquals(s3, a.repeatWithString("word", "5", 1));
	}
	@Test
	public void testRepeatingChar(){
		PracticeTest1B a = new PracticeTest1B();
		String s1 = "turtle";
		String s2 = "name";
		String s3 = "ladder";
		String s4 = "computer";
		assertTrue(a.hasRepeatingChar(s1));
		assertFalse(a.hasRepeatingChar(s2));
		assertTrue(a.hasRepeatingChar(s3));
		assertFalse(a.hasRepeatingChar(s4));
	}
}
