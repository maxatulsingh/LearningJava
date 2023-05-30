package conditionalStatements;

import java.util.Scanner;

public class TypeOfWebsiteAndProtocol {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the URL of a website=");
		String URL=s.nextLine();
		
		if(URL.startsWith("http:") || URL.startsWith("HTTP:"))
		{
			System.out.println("Not Secured Protocol");
		}
		else if(URL.startsWith("https:")|| URL.startsWith("HTTPS:"))
		{
			System.out.println("Secured Protocal");
		}
		else
		{
			System.out.println("Protocal Invalid");
		}
		
		if(URL.endsWith(".com"))
		{
			System.out.println("Commercial Website");
		}
		else if(URL.endsWith(".gov"))
		{
			System.out.println("Government Webite");
		}
		else if(URL.endsWith(".org"))
		{
			System.out.println("Organization");
		}
		else if(URL.endsWith(".net"))
		{
			System.out.println("Network");
		}
		else if(URL.endsWith(".biz"))
		{
			System.out.println("Business");
		}

	}

}
