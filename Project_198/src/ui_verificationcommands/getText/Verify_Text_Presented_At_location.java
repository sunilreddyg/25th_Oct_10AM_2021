package ui_verificationcommands.getText;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Presented_At_location {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		//Target Text Area location and read text at Location
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String runtimeText=Error_location.getText();
		
		
		String ExpText="Enter a valid email address, phone number, or Skype name.";
		
		
	     //Verify Text Presented at location
		if(!runtimeText.isEmpty())
		{
					//Verify Expected text presented at location
					if(ExpText.equals(runtimeText))
						System.out.println("Testpass, Expected text visble at webpage");
					else
						System.out.println("Testfail, Expected text not visible at webpage");
		}
		else
		{
			System.out.println("No text presented at element");
		}

		Thread.sleep(4000);
		driver.close();
		
		

	}

}
