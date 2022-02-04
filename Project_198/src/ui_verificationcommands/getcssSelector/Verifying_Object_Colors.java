package ui_verificationcommands.getcssSelector;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Verifying_Object_Colors
{

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		
		WebElement FreeTrail=driver.findElement(By.xpath("//a[@href='/orangehrm-30-day-trial/'][contains(.,'FREE TRIAL')]"));
		
		//GetCss value return color in RBGA format 
		String BG_Color=FreeTrail.getCssValue("background-color");
		System.out.println("Object BackGround color displayed is  "+BG_Color);
		
		String Exp_Color_inHex="#17a954";
		
		
		Color ObjColor=Color.fromString(BG_Color);
		System.out.println("Object Color in Hex format "+ObjColor.asHex());
		
		if(Exp_Color_inHex.equals(ObjColor.asHex()))
			System.out.println("Color Matched");
		else
			System.out.println("Color is Mismatched");
		
		
		System.out.println("Object color in RGB format --> "+ObjColor.asRgb());
		
		
		
		/*
		 * Refer this site:-->
		 * 		https://www.selenium.dev/documentation/webdriver/additional_features/colors/
		 */
		

	}

}
