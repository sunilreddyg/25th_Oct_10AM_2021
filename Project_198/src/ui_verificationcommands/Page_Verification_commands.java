package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String PageTitle=driver.getTitle();
		System.out.println("Current Window Title is --> "+PageTitle);
		
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current Window Url is --> "+Pageurl);
		
		String WindowId=driver.getWindowHandle();
		System.out.println("Current Window Dynamic ID -->"+WindowId);
		
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);

	}

}
