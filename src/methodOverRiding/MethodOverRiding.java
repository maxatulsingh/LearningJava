package methodOverRiding;

class Super
{
	public void display()
	{
		System.out.println("Super Class Display method");
	}
}

class Sub extends Super
{
	public void display1()
	{
		System.out.println("Subclass Display method");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) 
	{
		Super s=new Super();
		s.display();
		
		Sub s1=new Sub();
		s1.display();
		
		//Below is called Dynamic Method Dispatch
		//Reference of Super class is given and Object of sub class is created.
		//This will execute the over rided method in sub class and will print Subclass Display method
		Super s3=new Sub();
		s3.display();
		
	}

}
