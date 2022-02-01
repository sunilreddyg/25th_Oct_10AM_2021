package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyPage_Title {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		String Exp_title="Outlook – free personal email and calendar from Microsoft";
		
		//Get Current Window Title
		String Act_title=driver.getTitle();
		
		if (Act_title.equals(Exp_title)) 
		{
			System.out.println("Title verified for outlook page");
			
			WebElement SigninButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			SigninButton.click();
			
			if(driver.getTitle().contains("Sign in"))
			{
				System.out.println("Sign in page verified");
			}
			else
			{
				System.out.println("Sign in page not displayed");
			}
			
			
		} else 
		{
			System.out.println("Title mismatch for outlook page");
		}
		
	}

}
