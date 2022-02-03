package ui_verificationcommands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Runtime_Attribute {

	public static void main(String[] args) throws Exception {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\MINDQ\\\\Desktop\\\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		//Close advertise window
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		Thread.sleep(2000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		new Actions(driver).click().perform();
		Thread.sleep(1000);
		Roundtrip.click();
		
		//Verifying object disable state using runtime property
		WebElement DoubleSeats=driver.findElement(By.xpath("//p[contains(.,'Double Seat ')][contains(.,'Fares')]"));
		String Status=DoubleSeats.getAttribute("class");
		if(Status.equals("disabled"))
			System.out.println("Object is Disabled");
		else
			System.out.println("Testfail, Object is not disabled");
		
		
		
		

	}

}
