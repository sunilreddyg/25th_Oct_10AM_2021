package framework.Excel.Testcase;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriven 
{
	static WebDriver driver;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static String filepath="TestData\\InputData.xlsx";
	static String driver_path="C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe";
	static String sheetname="Testcase1";
	static Outlook_LoginPage login;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		book=new XSSFWorkbook(fi);
		System.out.println("Workbook is access");
		
		sht=book.getSheet(sheetname);
		
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		login=new Outlook_LoginPage(driver);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
		
		FileOutputStream fo=new FileOutputStream("TestData\\output1.xlsx");
		book.write(fo);
		book.close();
	}

	@Test
	public void Email_validation() throws Exception 
	{
			System.out.println(sht.getLastRowNum());
		for (int i = 6; i < sht.getLastRowNum()+1; i++) 
		{
			String Tcname=sht.getRow(i).getCell(0).getStringCellValue();
			String InputEmail=sht.getRow(i).getCell(1).getStringCellValue();
			String Exp_result=sht.getRow(i).getCell(2).getStringCellValue();
			String Exe_status=sht.getRow(i).getCell(3).getStringCellValue();
			String Stype=sht.getRow(i).getCell(4).getStringCellValue();
			
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				driver.get(login.url);
				Thread.sleep(2000);
				login.signIn.click();
				Thread.sleep(2000);
				login.Email.sendKeys(InputEmail);
				Thread.sleep(2000);
				login.NextButton.click();
				Thread.sleep(5000);
				
				if(Stype.equals("text"))
				{
					String VisibleText=driver.findElement(By.tagName("body")).getText();
					if(VisibleText.contains(Exp_result))
					{
						System.out.println(Tcname+" ------>  Testpass");
					}
					else
					{
						System.out.println(Tcname+" ------>  Testpass");
					}
				}
				else if(Stype.equalsIgnoreCase("object"))
				{
					
					  boolean flag=login.password.isDisplayed();
					  if(flag==true)
					  {
							System.out.println(Tcname+" ------>  Testpass");
					  }
					  else
					  {
							System.out.println(Tcname+" ------>  Testpass");
					  }
				}
			
				
			}
			
		}
		
		
	}

}
