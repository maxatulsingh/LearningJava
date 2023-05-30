package variableArgs;

public class CalculateDiscountUsingVarArgs {
	
	public static double discount(double...price)
	{
		double sum=0;
		
		for(double x:price)
		{
			sum+=x;
		}
		
		if(sum<500)
		{
			return (sum*10/100);
		}
		else if (sum>=500 && sum<1000)
		{
			return (sum*15/100);
		}		
		else if(sum>1000)
		{
			return (sum*20/100);
		}
		else return(0);
	}

	
	public static void main(String[] args) {
		
		double n;
		n=discount(400+101);
		System.out.println(n);
		
		n=discount(500+400+101);
		System.out.println(n);
		
		n=discount(1000+400+101);
		System.out.println(n);
		
	}

}
