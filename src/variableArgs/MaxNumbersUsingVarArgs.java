package variableArgs;

public class MaxNumbersUsingVarArgs {
	
	public static void max(int...A)
	{
		int max=A[0];
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>max)
			{
				max=A[i];
			}
		}
		System.out.println("Max Number is="+max);
	}
	
	public static void max1(int...A)
	{
		if (A.length==0) {System.out.println(Integer.MIN_VALUE); System.exit(0);;} 
		int max=A[0];
		for(int x:A)
		{
			if(x>max)
			{
				max=x;
			}
		}
		System.out.println("Max1 Number is="+max);
	}

	public static void main(String[] args) {
		
		max1(1,2,3,4,5,6,7,8,9);
		System.out.println();
		max1(123,321,555,999);
		System.out.println();
		max1(999,321,555,123);
		System.out.println();
		max1();
	}

}
