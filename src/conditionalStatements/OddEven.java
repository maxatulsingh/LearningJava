package conditionalStatements;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a number ");
		Scanner s=new Scanner(System.in);
		
		int num1=s.nextInt();
	
		
		if(num1%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}

	}

}
