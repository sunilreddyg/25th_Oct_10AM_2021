package mq.java.methods.ReturnParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RunTest {

	public static void main(String[] args) 
	{
		
		TrackUsers obj=new TrackUsers();
		
		String useremail=obj.Getuser().email;
		System.out.println(useremail);
		
		String Username=obj.Getuser().name;
		System.out.println(Username);
		
		
		String Start=obj.Getuser().joingDetails().startDate();
		String End=obj.Getuser().joingDetails().EndDate();
		System.out.println(Start+"     "+End);
		
		
	}

}
