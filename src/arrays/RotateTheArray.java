package arrays;
//left rotate
public class RotateTheArray {

	public static void main(String[] args) {
		
		int array[]= {1,12,3,4,5,10,123};
		int temp=array[0];

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		for(int i=1;i<array.length;i++)
		{
			array[i-1]=array[i];			
		}
		array[array.length-1]=temp;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
