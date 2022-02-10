package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser 
{

	public static void main(String[] args)
	{
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		options.setHeadless(true);
	
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    System.out.println("Browser is up and ready to use");
	    
	    
	    
	    

	}

}
