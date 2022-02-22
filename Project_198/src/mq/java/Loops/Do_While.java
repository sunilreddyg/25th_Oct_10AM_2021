package mq.java.Loops;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Do with true condition
		int i=0;
		do {
			i=i+1;
			System.out.println(i);
		} while (i < 10);
		
		
		System.out.println("\n");
		
		//Do loop with flase condition
		int j=10;
		do {
			System.out.println(j);
		} while (j < 0);
		
		
		
		//Reload webpage Until Expected title presented
		
		//How to manage explicit wait using while loop
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag=false;
		int count=0;
		do {
			driver.get("http://facebook.com");
			
			try {
				flag=new WebDriverWait(driver, Duration.ofSeconds(10))
						.until(ExpectedConditions.titleContains("Instagram"));
						
			} catch (Exception e) {
				
			}
			
			count=count+1;
			if(count==20)
			{
				break;
			}
			
			
		} while (flag==false);
		
		System.out.println("Application Is up and ready to use");
	

	}

}
