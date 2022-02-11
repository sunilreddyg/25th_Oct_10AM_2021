package mq.java.Loops;

public class For_loop_Example {

	public static void main(String[] args) 
	{
	
		//Print numbers 1 to 10
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//print numbers 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		
		//Read Array values
		String browsers[]= {"chrome","firefox","safari","opera"};
		
		for (int i = 0; i < browsers.length; i++)
		{
			String eachbrowser = browsers[i];
			System.out.println(eachbrowser);
			
		}
		
		
		
		//Condcut sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is -->"+sum);
		
		

	}

}
