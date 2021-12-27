package mq.selenium.Dropdown.multipleselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_SelectionType {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();

		
		//Click on Select Link
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("Dropdown multiple selecton status is --> "+flag);
		
		
		
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
		
		if (flag1)   //only accept boolean type values
		{
			System.out.println("Dropdown is a multple Selection type");
		} else 
		{
			System.out.println("Dropdown is a single selection type");
		}
		
		
		/*
		 * If is a decision statement accept only boolean value
		 * 		=> On true condition if block will be executed
		 * 		=> On false condition else block will be executed
		 */

	}

}
