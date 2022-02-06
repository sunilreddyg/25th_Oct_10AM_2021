package framework.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Excel {

	public static void main(String[] args) throws IOException
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Exising workbook 
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book reference
		XSSFSheet sht=book.getSheet("Tc001");
		
		//Target row using index number
		XSSFRow row=sht.getRow(1);

		//Using row target cell
		XSSFCell cell=row.getCell(0);
		
		//Get String charcters from cell
		String browsername=cell.getStringCellValue();
		System.out.println(browsername);
		
		//using Row reference read cell data
		String URL=row.getCell(1).getStringCellValue();
		System.out.println(URL);
		
		//Get Username
		String UID=row.getCell(2).getStringCellValue();
		System.out.println(UID);
	}

}
