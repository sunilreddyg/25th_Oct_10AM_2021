package mq.selenium.listitems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_List_items 
{

	public static void main(String[] args) throws Exception {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/selectmenu/default.html");
	driver.manage().window().maximize();
	
	
	/*
	 * Note:--> To Select List of items We Follow Below method
	 * 			=> Use Click method to open list of items
	 * 			=> Use click method to selected one of item from list
	 */
	
	WebElement SpeedMenuButton=driver.findElement(By.xpath("//span[@class='ui-selectmenu-text'][contains(.,'Medium')]"));
	SpeedMenuButton.click();
	Thread.sleep(3000);
	
	
	WebElement ItemFaster=driver.findElement(By.xpath("//div[@id='ui-id-5']"));
	ItemFaster.click();
	

	}

}
