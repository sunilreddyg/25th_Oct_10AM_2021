package otherpackage;

import mq.java.methods.instantmethod.ChromeBrowser;

public class Run_Methods_And_Variables_From_DifferentPackage {

	public static void main(String[] args) 
	{
		
		
		/*
		 * To Run other package methods and variables we should
		 * follow below conditions
		 * 
		 * 		=> only public modifier methods and variables allowed
		 * 			to call outside packages
		 * 
		 * 		=> You must import package to current Class
		 */
		ChromeBrowser obj=new ChromeBrowser();
		obj.OpenChrome();
		obj.loadpage();
		

	}

}
