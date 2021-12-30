package interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ElementTo_Target {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");    
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		WebElement TrashBin=driver.findElement(By.xpath("//div[@class='trash']"));
	
		//Create Object for Actions class
		Actions action=new Actions(driver);
		
		//Drage Object to Target Using Direct Method
		action.dragAndDrop(Doc1, TrashBin).perform();
		action.dragAndDrop(Doc2, TrashBin).perform();
		
		//Drag and Drop using mouse actions
		action.clickAndHold(Doc3).moveToElement(TrashBin).release().perform();
		action.clickAndHold(Doc4).moveToElement(TrashBin).release().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
