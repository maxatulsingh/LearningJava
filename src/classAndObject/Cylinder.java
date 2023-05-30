package classAndObject;

public class Cylinder {
	
	public double radius,height;
	
	public double lidArea()
	{
		return 2*Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea()
	{
		return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
	}
	
	public double volume()
	{
		return 2*Math.PI*radius*height;
	}

}
