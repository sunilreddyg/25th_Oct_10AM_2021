package mq.java.methods.Parameters;

public class TestRobot1 
{
	//Method without parameters
	public void staticspeed()
	{
		System.out.println(10);
	}

	
	//Method with parameters
	public void dynamicspeed(int km)
	{
		System.out.println(km);
	}
	
	
	public static void main(String[] args) 
	{
		TestRobot1 obj=new TestRobot1();
		obj.staticspeed();
		obj.dynamicspeed(20);
		obj.dynamicspeed(21);

	}

}
