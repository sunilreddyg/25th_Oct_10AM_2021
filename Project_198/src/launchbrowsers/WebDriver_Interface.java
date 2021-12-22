package launchbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Interface {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();  //Optional
		/*
		 * Exceptions:-->
		 * 
		 * 		IllegalStateException:-->
		 * 			=> This exception we receive when don't define
		 * 				environment path for browser drivers
		 * 							[OR]
		 * 		=> When we define wrong path  or Spell Mistakes
		 * 
		 * 		SessionNotCreateException:-->
		 * 			=> When your browser driver and browser version
		 * 				is mismatched
		 * 			
		 * 		
		 * 		InvalidArgumentException:-->
		 * 				=> When url format is mismatched
		 * 				=> Url should start with http://  or https://
		 */
		
	}

}
