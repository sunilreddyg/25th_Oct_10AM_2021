package commonlibrary.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FB_Signup_Form
{


	public  FB_Signup_Form(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@aria-label='First name']")
	public WebElement  Firstname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement  Lastname;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement  Email;
	
	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement  password;
	
	@FindBy(xpath = "//select[contains(@title,'Day')]")
	public WebElement  DOB_day;
	
	@FindBy(xpath = "//select[@title='Month']")
	public WebElement  DOB_month;
	
	@FindBy(xpath = "//select[contains(@title,'Year')]")
	public WebElement  DOB_year;
	
	@FindBy(xpath = "//input[@value='1']")
	public WebElement  Gender_Female;
	
	@FindBy(xpath = "//input[@value='2']")
	public WebElement  Gender_Male;
	
	@FindBy(xpath = "//input[@value='-1']")
	public WebElement  Gender_Custom;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	public WebElement  signUp;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement  Retype_Email;

}