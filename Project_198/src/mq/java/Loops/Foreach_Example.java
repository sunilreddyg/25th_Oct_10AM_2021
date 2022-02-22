package mq.java.Loops;

public class Foreach_Example {

	public static void main(String[] args) 
	{
		
		
		String browsers[]= {"chrome","firefox","safari","opera"};
		//Read all String data using foreach loop
		for (String EachBrowser : browsers) 
		{
			System.out.println(EachBrowser);
		}

		
		int num[]= {100,200,300,400,500};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		
		String userdata[][]=
			{
					{"Arjun","9030248855"},
					{"Siri","7845121212"},
					{"Rajesh","545454545"}
			};
		
		System.out.println(userdata[1][0]);
		//Reading data from double dimensional array
		for (String[] arr : userdata) 
		{
			System.out.println(arr[0]+"    "+arr[1]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
