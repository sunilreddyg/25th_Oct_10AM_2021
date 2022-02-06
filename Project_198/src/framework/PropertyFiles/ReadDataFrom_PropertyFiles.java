package framework.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFrom_PropertyFiles
{

	public static void main(String[] args) throws IOException
	{
		
		//Target File location
		String path="src\\framework\\PropertyFiles\\input.properties";
		FileInputStream fi=new FileInputStream(path);
		
		//Create object for properties
		Properties repository=new Properties();
		repository.load(fi);
		
		//Read property value using property name
		String UID=repository.getProperty("username.valid");
		String PWD=repository.getProperty("password.valid");
		
		System.out.println(UID+"    "+PWD);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
