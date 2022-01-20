package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_To_Required_Window_with_PageTitle 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
	
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
	    
	   //Get All Window ID's
	    Set<String> AllWindowIDS=driver.getWindowHandles();
	    System.out.println(AllWindowIDS.size());
	    
	    //Iterate for all windows
	   for (String EachWindow : AllWindowIDS) 
	   {   
		   	//Switching to each window and Reading Runtime Title of Each Window
		   	String Runtime_Title=driver.switchTo().window(EachWindow).getTitle();
		   	
		   	//Decision accept only when expected title is match.
		   	if(Runtime_Title.contains("Cancel Train Bookings"))
		   	{
		   		break;  //When Expected title matching breaking iteration
		   				//Here is the assumption where it break iteration,
		   				//  window foucus will be available at same window
		   	}
	   }
	    
	    
	    System.out.println("Current Focusexd window title is--> "+driver.getTitle());
	    
	    
	 
	    
	    

	}

}
