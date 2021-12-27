package mq.selenium.Dropdown.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Actions 
{

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Checkbox:-->
		 * 		<input type="checbox"  id="Rtype" ></input>
		 */
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement ATM_Chekcbox=driver.findElement(By.id("amenity_category_order_types50"));
		if(!ATM_Chekcbox.isSelected())    // !  NOT Equals   [This condition accept when chekcbox is not selected]
		{
			ATM_Chekcbox.click();   //This Acction make Check box selection
		}
		
		
		WebElement Branch_Checkbox=driver.findElement(By.xpath("amenity_category_order_types49"));
		Branch_Checkbox.click();
		
		if(Branch_Checkbox.isSelected())  //this condition accept if checkbox is already selected
		{
			Branch_Checkbox.click();   //This Action UnCheck Checkbox
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
