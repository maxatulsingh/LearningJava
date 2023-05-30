package abstractClasses;

abstract class KFC
{
	public KFC()
	{
		System.out.println("KFC constructor");
	}
	
	abstract public void billing();
	abstract public void offers();
}

class MyKFC extends KFC
{

	@Override
	public void billing() {
		System.out.println("My KFC billing partner");
		
	}

	@Override
	public void offers() {
		System.out.println("My KFC offers");
	}
	
	public void myStaff()
	{
		System.out.println("My KFC staff");
	}
	
}

public class KFCBranchApp {

	public static void main(String[] args) {
		KFC k=new MyKFC();
		k.billing();
		k.offers();
		
	}

}
