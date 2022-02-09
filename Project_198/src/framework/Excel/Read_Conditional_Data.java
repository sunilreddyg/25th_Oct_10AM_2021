package framework.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Conditional_Data {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fi = null;
		try {
			//Target File location
			fi=new FileInputStream("TestData\\InputData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		 XSSFWorkbook book=new XSSFWorkbook(fi);
		 XSSFSheet sht=book.getSheet("Sheet5");
		 int Lrnum=sht.getLastRowNum();
		 
		 for (int i = 1; i <= Lrnum; i++) 
		 {
			 String Exe_type=sht.getRow(i).getCell(2).getStringCellValue();
			 if(Exe_type.equalsIgnoreCase("y"))
			 {
				 String UID=sht.getRow(i).getCell(0).getStringCellValue();
				 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
				 
				 System.out.println(UID+"   "+PWD);
			 }
		 }

	}

}
