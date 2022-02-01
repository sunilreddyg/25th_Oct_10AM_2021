package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Element_At_PageSource 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	
		String PageSource=driver.getPageSource();
		
		//Condition to verify Required elemnet is presented at source
		if(PageSource.contains("email"))
		{
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("Darshan@gmail.com");
		}
		else
		{
			System.out.println("Element is not presented at source");
		}
		
		
		//To Handle action at dynamic source elements we can follow try-catch block
		try {
			driver.findElement(By.id("pass")).sendKeys("hello");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		
		
		

	}

}
