package launchbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ChromeBrowser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download chromedriver.exe file
		 * 
		 * 		=> https://www.selenium.dev/downloads/
		 * 		=> Scroll down page until find Browsers
		 * 		=> Click Browsers Tab to see list of browser drivers
		 * 		=> Under chrome click on documentation link
		 * 		=> Find chrome browser version and download chromeDriver
		 * 				w.r.t chrome browser version
		 * 				Chrome Browser =>  96.0
		 * 				Chrome Driver  =>  96.0
		 * 		=> Click on ChromeDriver version [It navigate to Index page]
		 * 		=> Downlaod Zip format file w.r.t Operating Systems
		 * 		=> Unzip file to back folder 
		 * 		=> with this action [You receive chromedriver.exe file]
		 * 		=> either set up environment variabe for chromedriver.exe
		 * 			file at system variables or set up runtime environment
		 * 			variable..
		 */
		
		
		//Setting Runtime environment variable for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\new_drivers\\chromedriver.exe");
		
		//Launching automation Chromebrowser and storing into reference class
		ChromeDriver chrome=new ChromeDriver();  
		
		//using class reference loading page
		chrome.get("http://facebook.com");
		
		//Printing Current Active browser title and url
		System.out.println(chrome.getTitle());
		System.out.println(chrome.getCurrentUrl());
		
		//closing browser automated browser window
		chrome.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
