package abstractClasses;


abstract class Super
{
	public Super()
	{
		System.out.println("Constructor of Super");
	}
	
	abstract void meth1();

}

class Sub extends Super
{
	public Sub()
	{
		System.out.println("Constructor of Sub");
	}

	@Override
	public void meth1() 
	{
		System.out.println("Sub meth1");
	}
	public void meth2()
	{
		System.out.println("Sub meth2");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		Sub s1=new Sub();
		s1.meth2();

	}

}
