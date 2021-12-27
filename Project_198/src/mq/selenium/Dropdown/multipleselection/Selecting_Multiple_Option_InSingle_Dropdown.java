package mq.selenium.Dropdown.multipleselection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecting_Multiple_Option_InSingle_Dropdown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();

		
		//Click on Select Link
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(2000);
	
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
		
		//Decison to accept actions when dropdown is multiple selection type
		if (flag) 
		{
			Select DropdownSelector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			DropdownSelector.deselectAll();  //This command only works on multiple selection dropdown
			DropdownSelector.selectByIndex(1);
			DropdownSelector.selectByIndex(3);
			DropdownSelector.selectByIndex(5);
			
			Thread.sleep(3000);
			
			DropdownSelector.deselectByIndex(3);
		} else 
		{
			System.out.println("it is not a multiple selection dropdown");
		}
		
		
		
		
		

	}

}
