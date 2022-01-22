package pageobjects.pagefactory.Runpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pagefactory.Pages.HRM_LoginPage;

public class Run_LoginPage {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//To Identify @findby elements we must take help of PageFactory class
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		
		//Login Password Invalid
		login.username.sendKeys("Admin");
		login.password.sendKeys("admin");
		login.LoginButton.click();
		Thread.sleep(2000);
		
		//Login Email Invalid
		login.enterusername("XYZ");
		login.enterpassword("admin123");
		login.clickloginbutton();
		Thread.sleep(2000);
		
		//Login valid username and valid password
		login.userlogin("Admin", "admin123");

	}

}
