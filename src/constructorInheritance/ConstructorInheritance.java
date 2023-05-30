package constructorInheritance;


class Parent
{
	public Parent()
	{
		System.out.println("Parent Class");
	}
	
	public void test()
	{
		System.out.println("Parent Test");
	}
}

class Child extends Parent
{
	public Child()
	{
		System.out.println("Child Class");
	}
	
	public void test1()
	{
		System.out.println("Child Test");
	}
}

class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("Grand Child Class");
	}
	
	public void test()
	{
		System.out.println("Grandchild Test");
	}
}

public class ConstructorInheritance {

	public static void main(String[] args) {
		Child c =new Child();
		c.test1();
	}

}
