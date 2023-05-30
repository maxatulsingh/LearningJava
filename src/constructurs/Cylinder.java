package constructurs;

public class Cylinder {
	
	private double radius,height;
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setRadius(double radius)
	{
		if(radius>=0)
		this.radius=radius;
	}
	
	public void setHeight(double height)
	{
		if(height>=0)
		this.height=height;
	}
	
	Cylinder(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	Cylinder()
	{
		this.radius=0;
		this.height=0;
	}
	
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
