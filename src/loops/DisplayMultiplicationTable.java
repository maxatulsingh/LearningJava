package loops;

import java.util.Scanner;

public class DisplayMultiplicationTable {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		int number=s.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(number+" X "+i+ "=" +(number*i));
			
		}
	}

}
