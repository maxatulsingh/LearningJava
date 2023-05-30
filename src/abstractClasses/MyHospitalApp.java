package abstractClasses;

abstract class Hospital
{
	abstract void appointment();
	abstract void emergency();
	
}

class MyHospital extends Hospital
{
	public void appointment()
	{
		System.out.println("My Hospital Appointment inmplementation");
	}
	
	public void emergency()
	{
		System.out.println("My hospital emergency implementation");
	}
	
	public void ENT()
	{
		System.out.println("My Hospital ENT implementation");
	}
}

public class MyHospitalApp {

	public static void main(String[] args) {
		MyHospital h=new MyHospital();
		h.ENT();
		h.appointment();
		h.emergency();

	}

}
