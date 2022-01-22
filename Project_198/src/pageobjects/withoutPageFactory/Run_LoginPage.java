package pageobjects.withoutPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(HRM_LoginPage.username).sendKeys("Admin");
		driver.findElement(HRM_LoginPage.password).sendKeys("admin123");
		driver.findElement(HRM_LoginPage.Login).click();
		
	}

}
