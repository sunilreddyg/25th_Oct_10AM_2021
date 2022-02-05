package commonlibrary.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FB_Home
{
	
		public  FB_Home(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}


		@FindBy(xpath = "//input[@id='email']")
		public WebElement  username;
		
		@FindBy(xpath = "//input[@id='pass']")
		public WebElement  password;
		
		@FindBy(xpath = "//button[@name='login']")
		public WebElement  logIn;
		
		@FindBy(xpath = "//a[contains(.,'Forgotten password?')]")
		public WebElement  forgottenPassword;
		
		@FindBy(xpath = "//a[contains(.,'Create a Page')]")
		public WebElement  createAPage;
		
		@FindBy(xpath = "//a[@href='/reg/']")
		public WebElement  signUp;
		
		@FindBy(xpath = "//a[contains(.,'Messenger')]")
		public WebElement  messenger;
		
		@FindBy(xpath = "//a[contains(.,'Instagram')]")
		public WebElement  instagram;



}