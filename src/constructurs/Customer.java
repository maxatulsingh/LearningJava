package constructurs;

public class Customer 
{
	int custId,phone;
	String name, address;
	
	public int getCustId()
	{
		return custId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	public int getPhone()
	{
		return phone;
	}
	
	public void setPhone(int phone)
	{
		this.phone=phone;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	Customer(int custId, String name)
	{
		this.custId=custId;
		this.name=name;
	}
	
	Customer(int custId,int phone, String name,String address)
	{
		this.custId=custId;
		this.phone=phone;
		this.name=name;
		this.address=address;
	}
	
	
}
