package methods;

import java.util.Scanner;

public class CheckIfNumberIsPrimeOrNot {
	
	public static void checkPrime(int x)
	{
		int count=0;
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				count++;
				System.exit(0);
			}
		}
		if(count>0)
		{
			System.out.println("Number is Not Prime");
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check prime=");
		int number=s.nextInt();
		
		checkPrime(number);
		
		}

}
