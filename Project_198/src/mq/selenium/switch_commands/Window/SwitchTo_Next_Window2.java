package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window2 {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	    
	   
	    //Get Main Window ID
	    String MainWindowID=driver.getWindowHandle();
	    System.out.println(MainWindowID);
	    
	    //Click On Hyperlink to pen Page at New window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(5000);
	    
	    
	    //Get All WIndow Hanles
	    Set<String> AllWindowIds=driver.getWindowHandles();
	    for (String EachWindowID : AllWindowIds) 
	    {
			driver.switchTo().window(EachWindowID);
		}
	    
	    //Note:--> Here is the assumption after loop completed by default
	    // It will be switched to SeCond window
	    
	    System.out.println("Current Window Title is ---> "+driver.getTitle());
	    
	    
	    /*
	     * Note:--> Only use above syntax when only two windows are open.
	     * 			Becuase when more than two windows open Set Interface 
	     			Class Release Window ID's undorder..
	     */
	  
	}

}
