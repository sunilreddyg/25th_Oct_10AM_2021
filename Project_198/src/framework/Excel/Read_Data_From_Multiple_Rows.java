package framework.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows 
{

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
			 XSSFSheet sht=book.getSheet("Sheet3");
			 
			 //Getting first and lastrow numbe where data exist
			 //int Frnum=sht.getFirstRowNum();
			 int Lrnum=sht.getLastRowNum();
			 
			 for (int i = 4; i <= Lrnum; i++) 
			 {
				  String UID=sht.getRow(i).getCell(0).getStringCellValue();
				  String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				  
				  System.out.println(UID+"    "+PWD);
			 }
			 
			 
		}

	}

}
