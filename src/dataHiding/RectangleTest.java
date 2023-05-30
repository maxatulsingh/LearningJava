package dataHiding;

public class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.setLength(7);
		r.setWidth(10.5);
		
		double length=r.getLength();
		double width=r.getWidth();
		System.out.println(length +" "+width);
		
		double area=r.area();
		System.out.println(area);
		
		double perimeter=r.perimeter();
		System.out.println(perimeter);
		
		boolean isSquare=r.isSquare();
		System.out.println("Is it a square="+isSquare);
	}
}