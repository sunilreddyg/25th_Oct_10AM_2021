package mq.java.methods.ReturnParameters;

public class MethodTypes 
{
	
	//Void method doesn't return any value
	public void method1()
	{
		String name="MQ";
	}
	
	
	/*
	 * => Other void all method types return value
	 * => We should write return keyword at end of the method
	 * => Return value should match with method type
	 * => finally return value to method name
	 */

	
	public int method2()
	{
		return 10;
	}
	
	public boolean method3()
	{
		return false;
	}

	public static void main(String[] args) {
		
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		int val=obj.method2();
		System.out.println(val);
		
		boolean flag=obj.method3();
		System.out.println(flag);
	}

}
