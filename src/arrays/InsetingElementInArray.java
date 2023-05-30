package arrays;

import java.util.Scanner;

public class InsetingElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a[]= new int[10];
		a[0]=5;
		a[1]=9;
		a[2]=6;
		a[3]=10;
		a[4]=12;
		a[5]=7; 
		int n=6;
		
		System.out.println("Enter the element you want to insert=");
		int element=s.nextInt();
		
		System.out.println("Enter the Index you want the number to be inserted=");
		int index=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=n-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		
		System.out.println();
		
		a[index]=element;
	
		for(int i=0;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
