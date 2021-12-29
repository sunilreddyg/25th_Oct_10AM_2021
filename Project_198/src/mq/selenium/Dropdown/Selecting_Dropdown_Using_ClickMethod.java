package mq.selenium.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Dropdown_Using_ClickMethod {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement JammuOption=driver.findElement(By.xpath("//option[@value='jammu-and-kashmir'][contains(.,'Jammu & Kashmir')]"));
		JammuOption.click();
		Thread.sleep(4000);
		
		
		WebElement CityDropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		CityDropdown.sendKeys("p");
		CityDropdown.sendKeys(Keys.ARROW_DOWN);
		//It Doesn't throw exception on invalid option

	}

}
