package mq.java.methods.Parameters;

public class Products 
{
	//Parameter example using callByvalue
	//How to Multiple parameters in single method
	public void SetProductName(String productname)
	{
		System.out.println(productname);
	}
	
	//Use cama separator to define multiple parameters
	public void SetNameAndPrice(String productname,double price)
	{
		System.out.println(productname);
		System.out.println(price);
	}
	
	public void setAllDetails(String name, String specs,double price)
	{
		System.out.println(name+"\t"+specs+"\t"+price);
	}
	

	public static void main(String[] args) 
	{
		
		Products obj=new Products();
		obj.SetProductName("Iphone");
		obj.SetNameAndPrice("Iphone", 250000.00);
		obj.setAllDetails("Samsung", "128 GB", 35000.00);
	}

}
