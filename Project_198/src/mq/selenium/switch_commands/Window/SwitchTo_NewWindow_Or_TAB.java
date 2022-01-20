package switch_commands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_NewWindow_Or_TAB 
{

	public static void main(String[] args)
	{
		
		//Only Selenium 4 had feature to open a page in new window or tab
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.cleartrip.com/trains");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle());
	    
	    //Creating new Tab using Selenium 4
	   WebDriver newtab=driver.switchTo().newWindow(WindowType.TAB);
	   newtab.get("https://www.cleartrip.com/trains/pnr");
	   
	   //enter PNR Number
	   newtab.findElement(By.xpath("//input[contains(@id,'pnr')]"))
	   .sendKeys("1200122");
	   newtab.close();   //It Close FoCused window
	   
	   
	   //Create New Window using selenium 4
	   WebDriver newwindow=driver.switchTo().newWindow(WindowType.WINDOW);
	   newwindow.get("https://www.cleartrip.com/faq/account/tour/trains_cancellation.shtml#cancel");
	   System.out.println(driver.getTitle());
	   
	}

}
