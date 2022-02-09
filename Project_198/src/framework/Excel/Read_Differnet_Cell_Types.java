package framework.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Differnet_Cell_Types {

	public static void main(String[] args) throws IOException {
		

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
			 XSSFSheet sht=book.getSheet("Sheet6");
			 
			 //Getting last cell number where data exist
			 int Lrnum=sht.getLastRowNum();
			 
			 //using forloop read all cell data from first  row
			 for (int i = 1; i < Lrnum; i++) 
			 {
				 XSSFCell EachRowCell=sht.getRow(i).getCell(0);
				 
				 String UID = null;
				 if(EachRowCell.getCellType()==CellType.STRING)
				 {
					 UID=EachRowCell.getStringCellValue();
				 }
				 else if(EachRowCell.getCellType()==CellType.NUMERIC)
				 {
					 double dble=EachRowCell.getNumericCellValue();
					 UID=NumberToTextConverter.toText(dble);
				 }
				 
				 System.out.println(UID);
				  
			 }
			 
			 
		}
		
		
		
	
	}

}
