package pageobjects.pagefactory.Runpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pagefactory.Pages.AdminPage;
import pageobjects.pagefactory.Pages.HRM_LoginPage;
import pageobjects.pagefactory.Pages.HRM_MenuTabs;

public class Run_AdminPage {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//To Identify @findby elements we must take help of PageFactory class
		HRM_LoginPage login=PageFactory.initElements(driver, HRM_LoginPage.class);
		login.userlogin("Admin", "admin123");
		Thread.sleep(2000);
		/*
		HRM_MenuTabs menu=new HRM_MenuTabs(driver);
		menu.admin.click();
		Thread.sleep(2000);
		
		AdminPage admin=new AdminPage(driver);
		admin.username.sendKeys("Aravind");
		admin.search.click();
		
		*/

	}

}
