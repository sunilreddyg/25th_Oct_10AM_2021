package mq.java.variables;

public class Global_Variables 
{
	//Instant variable
	int a=100;
	String name="Mindq";
	
	//static variable
	static int b=200;
	static String location="hyd";
	

	public static void main(String[] args) 
	{
		
		int x=new Global_Variables().a;
		System.out.println(x);
		
		String InstName=new Global_Variables().name;
		System.out.println(InstName);
		
		int y=Global_Variables.b;
		System.out.println(y);
		
		String City=Global_Variables.location;
		System.out.println(City);

	}

}
