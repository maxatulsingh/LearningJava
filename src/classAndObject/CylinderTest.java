package classAndObject;


public class CylinderTest {

	public static void main(String[] args) {

		Cylinder c=new Cylinder();
		c.radius=7;
		c.height=10;
		
		double lidArea=c.lidArea();
		System.out.println("Lid Area is="+lidArea);
		System.out.printf("Lid Area is= %.2f\n",lidArea);
		
		
		double totalSurfaceArea=c.totalSurfaceArea();
		System.out.println("Total Surface Area is"+totalSurfaceArea);
		System.out.printf("Total Surface Area is= %.2f\n",totalSurfaceArea);
		
		double volume=c.volume();
		System.out.println("Volume is="+volume);
		System.out.printf("Total Surface Area is = %.2f\n",volume);

	}

}
