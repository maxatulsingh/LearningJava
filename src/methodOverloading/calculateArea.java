package methodOverloading;

public class calculateArea {
	
	public static  void area(int length, int width)
	{
		System.out.println("Area ="+(length*width)); 
	}
	
	public static  void area(float length, float width)
	{
		float area=(length*width);
		System.out.println("Area ="+area); 
	}
	
	public static  float area(float radius)
	{
		return (float) (Math.PI*radius*radius);
	}
	
	public static  int area(int radius)
	{
		return  (int) (Math.PI*radius*radius);
	}

}
