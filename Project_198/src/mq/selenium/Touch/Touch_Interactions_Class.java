package interactions.Touch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Touch_Interactions_Class 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//Enabling mouse,keyboard,Touch interactions..
		TouchActions builder=new TouchActions(driver);
		builder.singleTap(driver.findElement(By.id("XYZ"))).perform();
		

	}

}
