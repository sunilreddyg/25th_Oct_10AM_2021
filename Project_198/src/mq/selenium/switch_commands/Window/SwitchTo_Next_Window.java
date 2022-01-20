package switch_commands.Window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception
	{
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     
		driver.get("https://www.instagram.com/");
	    driver.manage().window().maximize();
	  
	    
	    //Click On Hyperlink to open Page at New window
	    WebElement Blog=driver.findElement(By.linkText("Blog"));
	    Blog.click();
	    Thread.sleep(5000);
	    System.out.println("Current page title -->"+driver.getTitle());
	    
	    
	    //Get All Window handles
	    Set<String> allwindowIds=driver.getWindowHandles();
	    
	    //Convert Set of Strings into Interators[Converting group of strings into indepdant tokens]
	    Iterator<String> itr=allwindowIds.iterator();
	    
	    //Next Method read first value at iteration
	    String  Window1=itr.next();
	    String  Window2=itr.next();
	    
	    driver.switchTo().window(Window2);
	    System.out.println("Current Page title is --> "+driver.getTitle());
	    
	    
	    
	    //Switch back to Main window
	    driver.switchTo().window(Window1);
	    System.out.println("Main Window title is ---> "+driver.getTitle());
	    
	}

}
