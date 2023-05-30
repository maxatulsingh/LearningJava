package constructurs;

public class Rectangle 
{
	private double length,width;
	
	public double getLength()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	
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
	
	public Rectangle()
	{
		length=1;
		width=1;
	}
	
	public Rectangle(double l,double w)
	{
		length=l;
		width=w;
	}
	
}




