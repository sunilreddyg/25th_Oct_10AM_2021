package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ReadInput_Value_From_Editbox 
{

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\MINDQ\\\\Desktop\\\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Typing text into editbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Arjun@gmail.com");
		
		
		//Get Textbox input value
		String input=Email.getAttribute("value");
		System.out.println(input);
		
		

	}

}
