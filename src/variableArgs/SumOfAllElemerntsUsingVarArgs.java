package variableArgs;

public class SumOfAllElemerntsUsingVarArgs {
	
	public static int sum(int...A)
	{
		int sum=0;
		
		for(int x:A)
		{
			sum+=x;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int n;
		n=sum();
		System.out.println(n);
		
		n=sum(10,20);
		System.out.println(n);
		
		n=sum(10,20,30);
		System.out.println(n);
		
		n=sum(10,20,30,40);
		System.out.println(n);

	}

}
