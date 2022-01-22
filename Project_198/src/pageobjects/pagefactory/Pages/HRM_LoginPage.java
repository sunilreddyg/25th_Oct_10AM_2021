package pageobjects.pagefactory.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HRM_LoginPage 
{
	    //@FindBy annotation look for object at webpage
		@FindBy(id="txtUsername") 
		public WebElement username;	
		
		@FindBy(xpath="//input[@id='txtPassword']") 
		public WebElement password;
		
		@FindBy(css="input[value='LOGIN']") 
		public WebElement LoginButton;
		
		@FindBy(xpath = "//div[@id='forgotPasswordLink']")
		public WebElement ForgotpasswordLink;
		
		@FindBy(xpath = "//span[@id='spanMessage']")
		public WebElement LoginErrorMessage;
		
		public void enterusername(String UID)
		{
			username.clear();
			username.sendKeys(UID);
		}
		
		public void enterpassword(String PWD)
		{
			password.clear();
			password.sendKeys(PWD);
		}
		
		public void clickloginbutton()
		{
			LoginButton.click();
		}
		
		public void userlogin(String UID, String PWD)
		{
			enterusername(UID);
			enterpassword(PWD);
			clickloginbutton();
		}

}
