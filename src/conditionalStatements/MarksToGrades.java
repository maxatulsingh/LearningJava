package conditionalStatements;

import java.util.Scanner;

public class MarksToGrades {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter marks received in Maths=");
		int Maths=s.nextInt();
		
		System.out.println("Enter marks received in Science=");
		int Science=s.nextInt();
		
		System.out.println("Enter marks received in SST=");
		int SST=s.nextInt();		
		
		float average=(Maths+Science+SST)/3;
		
		if(average>=40 && average<50)
		{
			System.out.println("You got D grade");
		}
		else if(average>=50 && average<60)
		{
			System.out.println("You got C grade");
		}
		else if(average>=60 && average<70)
		{
			System.out.println("You got B grade");
		}
		else if(average>=70)
		{
			System.out.println("You got A grade");
		}
		else
		{
			System.out.println("You got E grade");
		}
		
	}

}
