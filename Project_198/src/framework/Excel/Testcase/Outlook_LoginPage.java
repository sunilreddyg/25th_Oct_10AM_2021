package framework.Excel.Testcase;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Outlook_LoginPage
{
	
	public Outlook_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//inputData
	String url="https://outlook.live.com/owa/";
	String title="Sign in to your Microsoft account";


	@FindBy(xpath = "(//a[contains(.,'Sign in')])[1]")
	public WebElement  signIn;
	
	@FindBy(xpath = "//input[@id='i0116']")
	public WebElement  Email;
	
	@FindBy(xpath = "//input[@value='Next']")
	public WebElement  NextButton;
	
	@FindBy(xpath = "//div[@id='usernameError']")
	public WebElement  UID_error_location;
	
	@FindBy(xpath = "//input[@id='i0118']")
	public WebElement  password;
	
	@FindBy(xpath = "//div[@role='heading']")
	public WebElement  Password_Header;

}