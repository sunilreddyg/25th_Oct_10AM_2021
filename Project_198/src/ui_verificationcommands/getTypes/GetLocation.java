package ui_verificationcommands.getTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	
		//Get Object x and y coordinates
		int Objx=Email.getLocation().getX();
		int Objy=Email.getLocation().getY();
		
		System.out.println("Object x value is --> "+Objx);
		System.out.println("Object y value is --> "+Objy);
		
		
		//Verify Object Margin in greater than  100
		if(Objx >= 200   &&  Objx <= 600)
			System.out.println("Object available between margings");
		else
			System.out.println("Object is overlaped");
		
		
		//Verify Object visibility using coordinates
		if(Objx >0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is Not visible at webpage");
		
		
		
		

	}

}
