package mq.java.conditional_Statements;

public class IfCondition 
{

	public static void main(String[] args) 
	{
		

		/*
		 * if:-->
		 * 		=> If only accept boolean statement.
		 * 		=> If usefull to execute any block of statement.
		 * 			on perticular condition
		 */
		
		
		int Age=18;
		if (Age==18)     //Here Double Equalsto return boolean value
		{
			System.out.println("Statement1");
			System.out.println("Statement2");
			
		}
		
		//if condition without block [usefull for single statemeent execute under condition]
		if(Age> 18)
			System.out.println("Age is greater than 18");
		
		
		
		
	}

}
