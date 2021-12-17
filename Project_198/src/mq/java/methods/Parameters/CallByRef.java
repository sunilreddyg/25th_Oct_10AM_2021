package mq.java.methods.Parameters;


public class CallByRef 
{
	
	//Method parameter with reference class
	public void MakePayement(ProductInfo obj)
	{
		System.out.println(obj.MobileName);
		obj.SetPrice(1000);
		
	}

	
	public static void main(String[] args) {
		
		
		CallByRef ref=new CallByRef();
		ref.MakePayement(new ProductInfo());
		
	}

}
