package methods;

public class MaxElementInArray {
	
	public static int maxMethod(int A[])
	{
		int max=A[0];
		for(int x:A)
		{
			if(x>max)
			{
				max=x;
			}
		}
		return max;
	}


	public static void main(String[] args) {

		int A[]= {86,2,3,4,5,6,7,85};
		
		int maxElement=maxMethod(A);
		System.out.println("Max element is = "+maxElement);

	}

}
