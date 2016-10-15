package WarmUps;

import static org.junit.Assert.*;

import org.junit.Test;

public class Number_2
{
    @Test
    public void testMaxFill() {
    	Number_2_addon s = new Number_2_addon();
        int[] expected1 = {1,2,3};
        int[] actual1 = {3,3,3};
        int[] expected2 = {11,5,9};
        int[] actual2 = {11,11,11};
        int[] expected3 = {2,11,3};
        int[] actual3 = {11,11,11};
        assertArrayEquals(s.maxFill(expected1), actual1);
        assertArrayEquals(s.maxFill(expected2), actual2);
        assertArrayEquals(s.maxFill(expected3), actual3);
    }
 
    @Test
    public void testMixString() {
    	Number_2_addon s = new Number_2_addon();
        assertEquals(s.mixString("abc", "xyz"), "axbycz");
        assertEquals(s.mixString("Hi", "There"), "HTihere");
        assertEquals(s.mixString("xxxx", "There"), "xTxhxexre");
    }
}
