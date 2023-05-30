package constructurs;

public class CylinderTest {

	public static void main(String[] args) {

		Cylinder c=new Cylinder();
		Cylinder c1=new Cylinder(5,5);
		
		c.setRadius(7.5);
		c.setHeight(10);
		
		System.out.println("Lid Area= "+c.lidArea());
		System.out.println("Total Surface Area= "+c.totalSurfaceArea());
		System.out.println("Volume= "+c.volume());
		System.out.println();
		System.out.println("Lid Area= "+c1.lidArea());
		System.out.println("Total Surface Area= "+c1.totalSurfaceArea());
		System.out.println("Volume= "+c1.volume());
		
		
	}

}
