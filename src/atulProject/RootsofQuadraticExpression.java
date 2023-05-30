package atulProject;

import java.util.Scanner;

public class RootsofQuadraticExpression {

	public static void main(String[] args) {
		double r1,r2;
		int a,b,c;
		
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		r1=(-b+Math.sqrt((b*b)-4*a*c))/2/a;
		r2=(-b-Math.sqrt((b*b)-4*a*c))/2/a;
		
		System.out.println("roots are "+r1 +" And " +r2);
		
	}

}
