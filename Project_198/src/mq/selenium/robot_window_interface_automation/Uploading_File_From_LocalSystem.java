package robot_window_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploading_File_From_LocalSystem {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement UplaodButton=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		UplaodButton.click();
		Thread.sleep(2000);
		
		String path="D:\\Sample_Resume\\3year_EXP\\MyResume.docx";
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);   //Set Content to clipbaord
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(200);
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Control Down key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}

}
