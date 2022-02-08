package capture_Screenshot;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CatureScreen_with_Time_Stamp 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		//Create object for date
		Date d=new Date();
		System.out.println(d.toString());
		//Simple Date formatter
		DateFormat df=new SimpleDateFormat("yyyy-MMM-dd hh-mm-ss");
		//Convert date using date formatter
		String time=df.format(d);
		
		
		//This feature available in selenium 4 only
		WebElement Login_Form=driver.findElement(By.xpath("//div[@class='gr27e  ']"));
		File src=Login_Form.getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File("screens\\image"+time+".png"));

	}

}
