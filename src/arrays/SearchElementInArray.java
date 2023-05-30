package arrays;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
	
		int array[]= {1,2,3,4,5,10};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to search in array 1,2,3,4,5,10 =");
		int element=s.nextInt();
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				System.out.println(element +" is present in index number "+i);
				System.exit(0);
			}
			
		}
		System.out.println("Element not found");
	
	}

}
