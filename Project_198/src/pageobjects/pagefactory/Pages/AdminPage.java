package pageobjects.pagefactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage
{
	public AdminPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@id,'userName')]")
	public WebElement  username;
	
	@FindBy(xpath = "//select[contains(@id,'userType')]")
	public WebElement  userrole;
	
	@FindBy(xpath = "//input[contains(@id,'searchSystemUser_employeeName_empName')]")
	public WebElement  employeename;
	
	@FindBy(xpath = "//select[contains(@id,'status')]")
	public WebElement  status;
	
	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement  search;
	
	@FindBy(xpath = "//input[@id='resetBtn']")
	public WebElement  reset;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement  add;
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	public WebElement  delete;



}