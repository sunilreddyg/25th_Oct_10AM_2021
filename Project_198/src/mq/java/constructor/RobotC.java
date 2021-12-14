package mq.java.constructor;

public class RobotC 
{

	public RobotC() 
	{
			System.out.println("Initilized");
	}
	
	public void Run()
	{
		System.out.println("Run is executed");
	}
	
	public static void main(String args[])
	{
		new RobotC();  //Calling Public class Constructor
		new RobotC().Run();   //Calling method using constructor
	}

}
