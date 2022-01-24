package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_HighlightObject
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		WebElement Element=driver.findElement(By.xpath("//h2[contains(@class,'8eso')]"));
		
		//Highlighting object using javascript...
		js.executeScript("arguments[0].style.background='yellow'", Element);
		js.executeScript("arguments[0].style.outline ='red solid 2px'", Element);
		
		
		
	}

}
