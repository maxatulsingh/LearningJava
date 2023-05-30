package conditionalStatements;

import java.util.Scanner;

public class FindRadixOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number(hexal/octal/binary/decimal)=");
		String num=s.nextLine();
		
		if(num.matches("[01]+"))
		{
			System.out.println("You entered a Binary number");
		}
		else if (num.matches("[0-9]+"))
		{
			System.out.println("You entered a Decimal number");
		}
		else if (num.matches("[0-7]+"))
		{
			System.out.println("You entered a Octal number");
		}
		else if (num.matches("[0-9A-F]+"))
		{
			System.out.println("You entered a Hexa number");
		}
		else
		{
			System.out.println("Invalid Number");
		}

	}

}
