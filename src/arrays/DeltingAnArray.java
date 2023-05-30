package arrays;

import java.util.Scanner;

public class DeltingAnArray 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int a[]= new int[10];
		a[0]=5;
		a[1]=9;
		a[2]=6;
		a[3]=10;
		a[4]=12;
		a[5]=7; 
		
		int n=6;
		
		System.out.println("Enter the Index you want to delete=");
		int index=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=index;i<n;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println();
		
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}	

}
