package keyword_driven_Framework;

import org.openqa.selenium.By;

public class Driver 
{
  
	public static void main(String args[]) throws InterruptedException
	{
		
		//Create Object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.set_timeout(30);
		
		
		//Connect to excel
		Excel.excel_connection("KWD.xlsx", "Sheet2");
		
		
		
		//Apply for loop to iterate number of rows
		for (int i = 1; i <= Excel.getrowcount(); i++) 
		{
			
			String Locator_name=Excel.getcellData(i, 1);
			String Locator_value=Excel.getcellData(i, 2);
			String Keyword=Excel.getcellData(i, 3);
			String InputData=Excel.getcellData(i, 4);
			
			//Locator Converted
			By Default_locator=Locator.convert_locator(Locator_name, Locator_value);
			
			
			switch (Keyword) 
			{
			case "open_application":
				obj.load_webpage(InputData);
				break;
				
			case "enter_text":
				obj.Enter_text(Default_locator, InputData);
				break;
				
			case "select_dropdown":
				obj.Select_dropdown(Default_locator, InputData);
				break;
			
			case "click_element":
				obj.Click_element(Default_locator);
				break;
				
			case "switchto_window":
				obj.switchto_window(InputData);
				break;
				
			case "mouse_hover":
				obj.MouseHover(Default_locator);
				break;
				
			case "Verify_title":
				obj.is_title_presented(InputData);
				break;
				
			case "wait":
				long time=Integer.parseInt(InputData);
				obj.wait(time);
				break;
				
			case "capturescreen":
				obj.Capturescreen(InputData);
				break;
				
			case "closebrowser":
				obj.Close_browser();
				break;
				
			case "closealert":
				obj.CloseAlert();
				break;
				
				
				
			default:System.out.println("keyword mismatch");
				break;
			}
			
		}
		
		
		
		
	}
	
	
	
 }


