package constructurs;

public class Product {
	
	private String itemNo;int qty;
	private String name;
	private double price;
	
	public String getItemNo()
	{
		return itemNo;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public Product(String itemNo)
	{
		this.itemNo=itemNo;
	}
	
	public Product(int itemNo, int qty,String name,double price)
	{
		this.itemNo=itemNo;
		this.qty=qty;
		this.name=name;
		this.price=price;
	}
}
