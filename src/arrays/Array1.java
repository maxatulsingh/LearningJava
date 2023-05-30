package arrays;
//Find sum of all elements in an array
public class Array1 {

	public static void main(String[] args) 
	{
		int array[]= {1,2,3,4,5,10};
		int sum=0;
		
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		
		System.out.println("Sum of the above array is ="+ sum);
		

	}

}
