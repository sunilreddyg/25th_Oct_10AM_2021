package commonlibrary;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCases1 
{
	WebDriver driver;
	
	@Test
	public void SetUpBrowser()
	{
			CommonReusableActions obj=new CommonReusableActions();
			obj.LaunchBrowser("chrome");
			driver=obj.getdriver();
			driver.get("http://facebook.com");
	}

}
