package conditionalStatements;

import java.util.Scanner;

public class DisplayNameOfDay {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number between 1-7=");
		int weekDayNumber=s.nextInt();
		
		if(weekDayNumber==1)
		{
			System.out.println("Monday");
		}
		else if(weekDayNumber==2)
		{
			System.out.println("Tuesday");
		}
		else if(weekDayNumber==3)
		{
			System.out.println("Wed");
		}
		
		else if(weekDayNumber==4)
		{
			System.out.println("Thrusday");
		}
		else if(weekDayNumber==5)
		{
			System.out.println("Friday");
		}
		else if(weekDayNumber==6)
		{
			System.out.println("Sat");
		}
		else if(weekDayNumber==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Number should be between 1-7 only");
		}
	}

}