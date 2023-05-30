package loops;

import java.util.Scanner;

public class DisplayDigitsOfANumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number= ");
		int number=s.nextInt();
		int remainder;
		
		
		
		while(number>0)
		{
			remainder=number%10;
			System.out.print(remainder);
			
			number=number/10;
			
		}

	}

}
