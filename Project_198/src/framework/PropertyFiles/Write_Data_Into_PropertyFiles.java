package framework.PropertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_Data_Into_PropertyFiles {

	public static void main(String[] args) throws IOException
	{
		
		
		//Create object for property files
		Properties obj=new Properties();
		
		//Add Data to property files
		obj.setProperty("Result1", "Testpass");
		obj.setProperty("Result2", "Testpass");
		obj.setProperty("Result3", "Testfail");
		obj.setProperty("Result4", "Testpass");
		
		
		//Create output stream file and store data to output file
		FileOutputStream fo=new FileOutputStream("src\\framework\\PropertyFiles\\output.properties");
		obj.store(fo, "login output is created");
	}

}
