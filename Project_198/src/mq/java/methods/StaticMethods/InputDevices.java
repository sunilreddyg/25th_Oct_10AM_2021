package mq.java.methods.StaticMethods;

public class InputDevices 
{
	//static specifier methods
	public static void Mouse()
	{
		System.out.println("Mouse");
	}
	
	//static specifier methods
	public static void Keyboard()
	{
		System.out.println("Keyboard");
	}
	
	//static specifier methods
	public static void Touch()
	{
		System.out.println("Touch");
	}
	
	public static void main(String args[])
	{
		Mouse();
		Keyboard();
		Touch();
		
		//Static Methods call without object creation
		
	}


}
