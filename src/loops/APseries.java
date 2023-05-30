package loops;

import java.util.Scanner;

public class APseries {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter starting number= ");
		int startingNumber=s.nextInt();
		
		System.out.println("Enter difference= ");
		int difference=s.nextInt();
		
		System.out.println("Enter total numbers you need in the series= ");
		int totalNumbersInTheSeries=s.nextInt();
		
		int series=0;
		System.out.print(startingNumber+", ");
		for(int i=1;i<=totalNumbersInTheSeries;i++)
		{
			
			series=(startingNumber+difference);
			System.out.print(series +", ");
			startingNumber=series;
		}

	}

}
