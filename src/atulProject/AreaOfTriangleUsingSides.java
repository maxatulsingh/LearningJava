package atulProject;

import java.util.Scanner;

public class AreaOfTriangleUsingSides {

	public static void main(String[] args) {
		float a,b,c,area, side;
		Scanner s=new Scanner(System.in);
		a=s.nextFloat();
		b=s.nextFloat();
		c=s.nextFloat();
		
		side=(float) 0.5 * (a+b+c);
		
		area=(float) Math.pow(side *(side-a)*(side-b)*(side-c),0.5);
		System.out.println("Area is "+area);
		
		area=(float) Math.sqrt(side *(side-a)*(side-b)*(side-c));
		System.out.println("Area is "+area);
	}

}
