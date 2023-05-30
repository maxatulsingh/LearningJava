package loops;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int number=s.nextInt(), remainder;

		int count=0;
		
		while(number>0)
		{
			remainder=number%10;
			number=number/10;
			count++;
			
		}
		System.out.println(count);
	}

}
