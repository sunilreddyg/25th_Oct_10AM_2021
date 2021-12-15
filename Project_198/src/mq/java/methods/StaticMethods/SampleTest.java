package mq.java.methods.StaticMethods;

public class SampleTest 
{
	//static method
	public static void method1()
	{
		
	}

	//static method
	public static void method2()
	{
		new SampleTest().method3();
		//Instant methods only allowed in static  methods
		//through object creation only.
	}
	
	//Instant method
	public void method3()
	{
		method1(); 
		//static methods can call in instant methods
		//without object creation
	}
	
	//Instant method
	public void method4()
	{
		
	}

	public static void main(String[] args) {
	

	}

}
