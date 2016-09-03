package Level_3;

public class ShapeCalculator
{

	public Object calculateSquarePerimeter(int i)
	{
		int x = i;
		return x*4;
	}

	public Object calculateRectanglePerimeter(int i, int j)
	{
		int x = i;
		int y = j;
		int z = (2*x)+(2*y);
		return z;
	}

	public double calculateCircleArea(int i)
	{
		double x = i;
		x = x*x*Math.PI;
		return x;
	}

	public double calculateCirclePerimeter(int i)
	{
		double x = i;
		x = (2*x)*Math.PI;
		return x;
	}

}
