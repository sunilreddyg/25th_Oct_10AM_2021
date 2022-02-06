package framework.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_into_Excel 
{
	
	public static void main(String args[]) throws Exception
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook Access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("Workbook is accessed");
		
		//Read Sheet Using above workbook
		XSSFSheet sht=book.getSheetAt(0);
		

		//Update Existing Cell Data
		sht.getRow(1).getCell(0).setCellValue("Chrome");
		
		//Create New Cell in Existing row and Set Cell data
		sht.getRow(1).createCell(4).setCellValue(new Date().toString());
		
		//Create New Row and New Cell then set cell data
		sht.createRow(2).createCell(0).setCellValue("sunilredy@mindqsystems.com");
		
		
		//Cretate New Workbook
		FileOutputStream fo=new FileOutputStream("TestData\\OP.xlsx");
		book.write(fo);   //Write all Data to new file
		book.close();     //Save and Close File
		
		
		
	}

}
