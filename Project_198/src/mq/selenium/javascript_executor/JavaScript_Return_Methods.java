package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Return_Methods 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		
		//enable  javascript executor on automatio browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Return Current Window title
		String wintitle=js.executeScript("return document.title").toString();
		System.out.println(wintitle);
		
		//Return Current window Url
		String url=js.executeScript("return location.href").toString();
		System.out.println(url);
		
		//Return current window protocal
		String protocal=js.executeScript("return location.protocol").toString();
		System.out.println(protocal);
		
		//Return Cookies enabled
		String st=js.executeScript("return navigator.cookieEnabled").toString();
		System.out.println(st);
				
		//Return Current Platfrom
		String st1=js.executeScript("return navigator.platform").toString();
		System.out.println(st1);
		
		//Return Alert Window
		js.executeScript("return alert('Hi Iam Alert')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	

	}

}
