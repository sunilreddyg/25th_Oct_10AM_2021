package mq.java.constructor;

public class RobotB 
{
	
	//Assume that there is always one hidden constructor
	//available at public class
	
	public void walk()
	{
		System.out.println("Walk Method is executed");
	}
	
	public static void main(String args[])
	{
		  new RobotB().walk();  //Calling walk method using class constructor
		  new RobotC().Run();   //Calling other class method using it's constructor
	}

}
