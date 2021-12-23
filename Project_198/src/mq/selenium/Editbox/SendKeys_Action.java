package mq.selenium.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Action {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		//Clicking on signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
	
		//Type Username and press Enter
		driver.findElement(By.name("loginfmt"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		//Type password and Press Enter
		driver.findElement(By.xpath("//input[@name='passwd']"))
		.sendKeys("hello123"+Keys.ENTER);
		
		
	}

}
