package atulProject;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		float base, height;
		
		Scanner s=new Scanner(System.in);
		base=s.nextFloat();
		height=s.nextFloat();
		float area= 1/2f*(base*height);
		
		System.out.println("Area of the triangle is ="+area);

	}

}
