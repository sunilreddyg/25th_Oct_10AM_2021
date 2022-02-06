package framework.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_boolean_And_Date_cell_Values {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Exising workbook 
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book reference
		XSSFSheet sht=book.getSheet("Sheet2");
		
		
		//Read boolean cell value
		boolean status=sht.getRow(1).getCell(3).getBooleanCellValue();
		System.out.println(status);
		
		//Read date cell value
		Date date=sht.getRow(1).getCell(4).getDateCellValue();
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(sdf.format(date));
		
		
		
		
		
		
		

	}

}
