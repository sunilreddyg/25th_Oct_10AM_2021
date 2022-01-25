package mq.java.variables.initiation;

public class Instatiation_Example 
{
	
	public static void main(String args[])
	{
		
		   int a=100;
		   a=200;    //Only once we can instatiate varaible with in method 
		   System.out.println("a new value is ---> "+a);
		   
		   int x,y,z;
		   x=100;y=200;z=300;
		  System.out.println(x+y+z);
		  
		  
		 String name;    //Instatiating variable before condition.
		 if(true)
		 {
			  name="Arjun";   //Assigning value inside condition
		 }
		 System.out.println(name);
		 
		 
		 
		 
		  
	}

}
