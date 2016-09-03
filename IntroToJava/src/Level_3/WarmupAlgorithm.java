package Level_3;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WarmupAlgorithm
{
	@Test
	public void testStringManipulator(){
		StringManipulator sm = new StringManipulator();
		assertEquals("sdrowkcab", sm.reverseWord("backwords"));
		assertEquals("CAPITAL", sm.capitalizeWord("capital"));
		assertEquals("lowercase", sm.uncapitalizeWord("LOWERCASE"));
	}
	@Test
	public void testShapeCalculator() {
		ShapeCalculator sc = new ShapeCalculator();
		assertEquals(16,sc.calculateSquarePerimeter(4));
		assertEquals(12,sc.calculateRectanglePerimeter(2,4));
		assertEquals(Math.PI,sc.calculateCircleArea(1), 0.001);
		assertEquals(2*Math.PI,sc.calculateCirclePerimeter(1), 0.001);
	}
}

