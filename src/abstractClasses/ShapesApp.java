package abstractClasses;

abstract class Shape
{
	
	public Shape()
	{
		//System.out.println("Shape constructor");
	}
	abstract void perimeter();
	abstract void area();
}

class Rectangle extends Shape
{
	int l,b;
	
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void perimeter()
	{
		System.out.println("Perimeter of rectangle is =" + (2*(l+b)));
	}
	
	public void area()
	{
		System.out.println("Area of rectangle is =" + (l*b));
	}

}

class Circle extends Shape
{
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	
	public void perimeter()
	{
		double p= (2*Math.PI*r);
		System.out.println("Circle Perimeter= "+p);
	}
	
	public void area()
	{
		double a=Math.PI*r*r;
		System.out.println("Circle Area= "+a);
	}

}

public class ShapesApp {

	public static void main(String[] args) {
		Shape r=new Rectangle(10,5);
		r.area();
		r.perimeter();
		
		Shape c=new Circle(5);
		c.area();
		c.perimeter();

	}

}
