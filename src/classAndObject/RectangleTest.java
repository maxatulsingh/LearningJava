package classAndObject;

public class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		r.length=10.5;
		r.width=10.5;
		
		double area=r.area();
		System.out.println(area);
		
		double perimeter=r.perimeter();
		System.out.println(perimeter);
		
		boolean isSquare=r.isSquare();
		System.out.println("Is it a square="+isSquare);
	}
}