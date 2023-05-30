package nestedLoops;
//
//01 02 03 04 05 
//06 07 08 09 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 


public class Star8 {

	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1+i;j<=5+i;j++)
			{
				System.out.printf("%02d ",count);
				count++;
			}
			System.out.println();
		}

	}

}
