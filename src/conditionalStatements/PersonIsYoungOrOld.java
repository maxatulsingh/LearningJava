package conditionalStatements;

import java.util.Scanner;

public class PersonIsYoungOrOld {

	public static void main(String[] args) {
		System.out.println("Enter your age=");
		
		Scanner s= new Scanner(System.in);
		int age=s.nextInt();
		
		if(age>=14 && age<=55)
		{
			System.out.println("You are young");
		}
		else
		{
			System.out.println("You are not young");
		}

	}

}
