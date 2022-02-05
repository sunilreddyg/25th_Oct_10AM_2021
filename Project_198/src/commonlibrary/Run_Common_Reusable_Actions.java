package commonlibrary;

import org.testng.annotations.Test;
import commonlibrary.pages.FB_Home;
import commonlibrary.pages.FB_Signup_Form;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;


public class Run_Common_Reusable_Actions extends CommonReusableActions
{
  String fb_login_url="http://facebook.com";
	
  @Test(enabled=false)
  public void Login_Test1() 
  {
	   FB_Home home=new FB_Home(driver);
	   Type_text(home.username, "Darshan");
	   Type_text(home.password, "Hello123");
	   click_element(home.logIn);
  }
  
  
  @Test(enabled=false)
  public void Reg_Test1() 
  {
	   FB_Home home=new FB_Home(driver);
	   click_element(home.signUp);
	   
	   FB_Signup_Form signup=new FB_Signup_Form(driver);
	   Type_text(signup.Firstname, "Ananth");
	   Type_text(signup.Lastname, "Kumar");
	   select_dropdown(signup.DOB_day, "text", "10");
	   select_dropdown(signup.DOB_month, "value", "7");
	   select_dropdown(signup.DOB_year, "index", "10");
	 
	   click_element(signup.Gender_Male);
	   wait(5000);
	   Send_keyboard_keys(Keys.ARROW_LEFT);
  }
  
  @Test(enabled=false)
  public void verify_alert_presented()
  {
	  Assert.assertTrue(isAlertPresented());
	  Reporter.log("Alert is presented ",true);
  }
  
  @Test(enabled=false)
  public void FbTo_Instagram()
  {
	 FB_Home home=new FB_Home(driver);
	 click_element(home.instagram);
	 wait(4000);
	 switchto_next_window();
	 Assert.assertTrue(verify_titlePresented("Instagram"));
	 Reporter.log("Title is presented",true);
	 wait(4000);
	 switchto_mainwindow();
  }
  
  
  
  @BeforeClass
  public void beforeClass()
  {
	  LaunchBrowser("chrome");
	  load_webpage(fb_login_url);
	  set_implicitwait(30);
	  set_explicitwait_time(30);
  }

  
}
