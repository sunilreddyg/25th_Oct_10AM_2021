package mq.java.conditional_Statements;

public class Switch_Condition {

	public static void main(String[] args) 
	{
		
		/*
		 * => switch is a multiple decision statement it work
		 * 		similar as else if condition. but only difference
		 * 		switch executed only required case insted of checking
		 * 		each statement..
		 */
		
		int month=2;
		
		switch (month) {
		case 1:
			System.out.println("jan 10% offer applied");
			break;
			
		case 2:
			System.out.println("feb 20% offer applied");
			break;
			
		case 3:
			System.out.println("march 30% offer applied");
			break;
			
		default: System.out.println("month mismatch");
			break;
		}

	}

}
