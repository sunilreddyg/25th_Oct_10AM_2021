package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScript_TypeText 
{

	public static void main(String[] args) 
	{
		
	
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	    
	    
	    //Enable javascript executor on automatio browser
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    
	    //Type text into editbox using javascript
	    js.executeScript("document.getElementById('email').value='Darshan'");
	    
	    //Type text into editbox using javascript
	    js.executeScript("document.getElementById('pass').value='Hello123'");
	    
	    //Identify Object Using Xpath with help of javascript
	    WebElement LoginButton=driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	    js.executeScript("arguments[0].click()", LoginButton);

	}

}
