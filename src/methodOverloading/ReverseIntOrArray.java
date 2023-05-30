package methodOverloading;

public class ReverseIntOrArray {
	
	public static int reverse(int number)
	{
		int reverse=0;
		while(number>0)
		{
			reverse = reverse*10+number%10;
			number=number/10;
		}
		return reverse;
	}
	
	public static int[] reverse(int[] number)
	{
		int B[]=new int[number.length];
		int n=number.length -1;
		for(int i=0;i<number.length;i++)
		{
			B[i]=number[n];
			n--;
		}
		
		return B;
		
	}

	public static void main(String[] args) {
		int number=123456789;
		int reverseOfNumber=reverse(number);
		System.out.println(reverseOfNumber);
		
		int A[]= {1,2,3,4,5,6,7,7,8,9,9,111,123};
		int B[]=reverse(A);
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(B[i]+" ");
		}
		
		
	}

}
