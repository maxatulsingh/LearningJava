package loops;
//If the cubes of all the digits in a number are added, and the sum is equal to the original number, it is an armstrong number
//example 0, 1, 153, 370, 371 and 407 are an Armstrong number list or all examples of Armstrong numbers.

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int number=s.nextInt(),remainder;
		int m=number;
		int armstronNumber=0;
		
		while(number>0)
		{
			
			remainder=number%10;
			int digitCube=(remainder*remainder*remainder);
			armstronNumber=armstronNumber+digitCube;
			
			number=number/10;
		}
		
		if(m==armstronNumber)
		System.out.println("armstronNumber");
		else
		System.out.println("Not an armstronNumber");


	}

}
