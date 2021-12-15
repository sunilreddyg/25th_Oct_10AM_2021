package mq.java.methods.instantmethod;

public class ChromeBrowser 
{
	//Instant Methods [Because Method not declare with static specifier]
	public void OpenChrome()
	{
		System.out.println("Chrome is opened");
	}
	
	//Instant Methods 
	public void loadpage()
	{
		System.out.println("Page is displayed");
	}
	
	//Instant Methods 
	public void login()
	{
		OpenChrome();
		loadpage();
		System.out.println("login Details entered");
	}
	
	
    //Static Specifier doesn't allow to call instant method directly
	public static void main(String[] args)
	{
		ChromeBrowser chrome=new ChromeBrowser();
		chrome.login();
		

	}

}
