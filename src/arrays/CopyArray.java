package arrays;

public class CopyArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int b[]= new int[a.length];
		
		System.out.println("Array A[]=");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("Array B[]=");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}

	}

}
