package constructorInheritance;

class Rectangle
{
	public int length, breadth;
	public Rectangle()
	{
		length=breadth=1;
	}
	
	public Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}
	
	public int area()
	{	
		return length*breadth;
	}
}

class Cuboid extends Rectangle
{
	public int height;
	
	public Cuboid()
	{
		height=1;
	}
	
	public Cuboid(int h)
	{
		height=h;
	}
	
	public Cuboid(int l,int b, int h)
	{
		super.length=l;super.breadth=h;
		height =h;
		
	}
	
	public int volume()
	{
		return area()*height;
	}
}



public class ParameterisedConstructur {
	
	public static void main(String[] args) {
		
		Cuboid c=new Cuboid(5);
		System.out.println(c.volume());

	}

}
