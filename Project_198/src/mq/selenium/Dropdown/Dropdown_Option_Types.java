package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Option_Types {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		Thread.sleep(2000);
		
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("customLocality"))
		.sendKeys("Dilsukhnagar");
		Thread.sleep(2000);
		
		
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(2);
		
		
		

	}

}
