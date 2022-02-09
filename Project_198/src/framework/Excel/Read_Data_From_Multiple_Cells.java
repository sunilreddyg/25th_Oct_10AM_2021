package framework.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Cells {

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream fi = null;
		try {
			//Target File location
			fi=new FileInputStream("TestData\\InputData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		
		if(fi!=null)
		{
			//Get Workbook
			 XSSFWorkbook book=new XSSFWorkbook(fi);
			 //Get Sheet using above workbook
			 XSSFSheet sht=book.getSheet("Sheet4");
			 
			 //Getting first and last cell number where data exist
			 int Fcnum=sht.getRow(1).getFirstCellNum();
			 int Lcnum=sht.getRow(1).getLastCellNum();
			 
			 //using forloop read all cell data from first  row
			 for (int i = 1; i < Lcnum; i++) 
			 {
				  String Students= sht.getRow(1).getCell(i).getStringCellValue();
				  System.out.println(Students);
			 }
			 
			 
		}

	}

}
