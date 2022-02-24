package findElemnts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_All_DropdownOptions 
{

	public static void main(String[] args) 
	{
		
		//How to manage explicit wait using while loop
		String chrome_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
								
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		List<WebElement> AllOptions=new Select(Month_Dropdown).getOptions();
		
		//Iterate for each object
		for (WebElement EachOption : AllOptions) 
		{
			String OptionName=EachOption.getText();
			System.out.println(OptionName);
			
			EachOption.click();
		}

	}

}
