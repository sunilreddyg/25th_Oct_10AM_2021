package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class While_loop_Example {

	public static void main(String[] args) throws Exception {
		
		
		//Print numbers from 1 to 10 using while loop
		int i=0;
		while (i < 10) 
		{
			i=i+1;
			System.out.println(i);
			
		}

		
		//While loop with false Condition
		int j=100;
		while(j < 0)
		{
			System.out.println("False Condition");
		}
		
		
		
		//How to manage explicit wait using while loop
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//It is a Hidden Element
		WebElement Retype_Passwrod=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("info@gmail.com");

		int count=0;
		while(!Retype_Passwrod.isDisplayed()) 
		{
			System.out.println("Checking password ");
			Thread.sleep(1000);
			count=count+1;
			
			if(count==20)
			{
				break;
			}
		}
		
			


		
	}

}
