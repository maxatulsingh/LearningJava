package variableArgs;

public class variableArgsExample {

	public static void show(int...A)
	{
		for(int x:A)
		{
			System.out.print(x);
		}
	}
	
	public static void show1(int...A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
	}
	
	public static void showList(String...S)
	{
		for(String x:S)
		{
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) {
		

		show();
		System.out.println();
		show1(10,20,30);
		System.out.println();
		show(1,2,3,4,5,6,7,8);
		System.out.println();
		show1(1,2,3,4,5,6,7,8);
		System.out.println();
		showList("Atul","Suraj","Paglon");
	}

}
