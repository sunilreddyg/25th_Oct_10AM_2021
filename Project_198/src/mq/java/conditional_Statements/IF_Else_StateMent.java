package mq.java.conditional_Statements;

public class IF_Else_StateMent {

	public static void main(String[] args)
	{
		
		/*
		 * IF-Else:--> 
		 * 		=> Any two decisions to execute
		 * 		=> If condition execute only where value return true
		 * 		=> else condition execute where value return false.
		 */
		
		
		int Age=17;
		if (Age > 18)    //Here greaterthan symbol return boolean value true/false
		{
			System.out.println("Age is greater than 18");
		} else 
		{
			System.out.println("Age is not greater than 18");
		}
		
		
		
		//If-else with single statements
		if(Age >= 18)
			System.out.println("TrueCondition");
		else
			System.out.println("False Condition");
		
		
		

	}

}
