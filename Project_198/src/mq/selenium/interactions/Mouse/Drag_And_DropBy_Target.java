package interactions.Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_DropBy_Target 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(4000);
		
		WebElement ScrollButton1=driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
		WebElement ScrollButton2=driver.findElement(By.xpath("(//div[contains(@class,'rangeslider__handle')])[2]"));
		
		new Actions(driver).dragAndDropBy(ScrollButton1, 100, 0).perform();
		Thread.sleep(2000);
		new Actions(driver).dragAndDropBy(ScrollButton2, -50, 0).perform();
	}

}
