package atulProject;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		int length, breadth, height;
		
		Scanner s=new Scanner(System.in);
		length=s.nextInt();
		breadth=s.nextInt();
		height=s.nextInt();
		
		float volume=length*breadth*height;
		float totalArea=2*(length*breadth+height*breadth+length*height);
		System.out.println("Toatal Area of the cuboid is "+totalArea);
		System.out.println("Volume of the cuboid is "+volume);
		
	}

}
