package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hovering {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		WebElement MenuSignin=driver.findElement(By.xpath("//span[contains(.,'Hello, Sign in')]"));
		new Actions(driver).moveToElement(MenuSignin).perform();
		Thread.sleep(2000);
		
		WebElement CreateLink=driver.findElement(By.xpath("//span[contains(.,'Create a List')]"));
		new Actions(driver).click(CreateLink).perform();
		
		
	}

}
