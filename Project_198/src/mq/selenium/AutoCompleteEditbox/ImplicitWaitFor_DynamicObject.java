package mq.selenium.AutoCompleteEditbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitFor_DynamicObject 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		WebElement OriginTextbox=driver.findElement(By.id("fsc-origin-search"));
		OriginTextbox.click();
		OriginTextbox.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		OriginTextbox.sendKeys("DEL");
		driver.findElement(By.xpath("(//strong[contains(.,'Del')])[1]")).click();
		
		
		WebElement Destination_Textbox=driver.findElement(By.xpath("//input[@id='fsc-destination-search']"));
		Destination_Textbox.sendKeys("HYD");
		driver.findElement(By.xpath("(//span[contains(.,'erabad (')])[2]")).click();
		
		/*
		 *  =>Implicitwait enable backup time when object not found at htmlsource
		 *  =>Implicitwait manage time gap until dynamic object load to htmlsoure
		 */
	}

}
