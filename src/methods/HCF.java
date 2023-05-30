package methods;

import java.util.Scanner;

public class HCF {
	
	public static int findHCF(int x,int y)
	{
		int HCF=1;
		
		for(int i=2; i<x;i++)
		{
			if(x%i==0)
			{
				if(y%i==0)
				{
					HCF=i;
				}
			}
		}

		return HCF;
	}
	
	public static int findHCF2(int x,int y)
	{
		int HCF=1;
		while(x!=y)
		{
			if(x>y)
			{
				x=x-y;
			}
			else
			{
				y=y-x;
			}
			if(x==y)
			{HCF=x;}
		}
		return HCF;
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number=");
		int number1=s.nextInt();
		System.out.println("Enter second number=");
		int number2=s.nextInt();
		
		int HCF;
		
		HCF= findHCF(number1, number2);
		System.out.println(HCF);
		System.out.println();
		HCF=1;
		HCF= findHCF2(number1, number2);
		System.out.println(HCF);

	}

}
