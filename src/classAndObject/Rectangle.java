package classAndObject;

public class Rectangle 
{
	public double length,width;
	
	public double area()
	{
		return length*width;
	}
	
	public double perimeter()
	{
		return 2*(length+width);
	}
	
	public boolean isSquare()
	{
		if(length==width)
			return true;
		else 
			return false;
	}
	
}




