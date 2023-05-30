package arrays;
//right rotate
public class RotateTheArrayRight {

	public static void main(String[] args) {
		
		int array[]= {1,12,3,4,5,10,123};
		int temp=array[array.length-1];

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for(int i=array.length-2;i>=0;i--)
		{
			array[i+1]=array[i];			
		}
		array[0]=temp;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
