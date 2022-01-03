package robot_window_interface_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Perform_Mouse_Interactions {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		WebElement Download_Button=driver.findElement(By.xpath("(//a[contains(.,'4.1.0')])[1]"));
		Download_Button.click();
		
		//Create object to Get Mouse and Keyboard interaction
		Robot robot=new Robot();
		
		//Moving cursor to Required Location using X and Y Coordinates
		robot.mouseMove(470, 340);
		
		//To Perform left click [InputEvent.BUTTON1_MASK1]
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		robot.mouseMove(474, 396);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		
		
		
		
		
		
		

	}

}
