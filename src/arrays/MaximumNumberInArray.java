package arrays;

public class MaximumNumberInArray {

	public static void main(String[] args) {

		int array[]= {1,12,3,4,5,10,123};
		int max=array[0];

		for(int i=0; i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println("Maximum element in the array is=" +max);
		
	}

}
