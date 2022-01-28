package mq.java.conditional_Statements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ElseIf_StateMent 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Usefull for multiple decision to validate..
		 */
		
		String browser="ie";
		
		if (browser.equals("chrome")) 
		{
			System.out.println("Chrome browser is executed");
		}
		else if (browser.equals("firefox")) 
		{
			System.out.println("Firefox browser is executed");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("ie browser is launched");
		}
		else if(browser.equals("edge"))
		{
			System.out.println("edge browser is launched");
		}
		else
		{
			System.out.println("browser  name is mimatched");
		}
		
		
		
		
		WebDriver driver = null;
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		
		
		driver.get("http://facebook.com");

	}

}
