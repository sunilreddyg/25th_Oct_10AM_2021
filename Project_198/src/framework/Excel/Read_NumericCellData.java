package framework.Excel;

import java.io.FileInputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_NumericCellData {

	public static void main(String[] args) throws Exception {
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Exising workbook 
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book reference
		XSSFSheet sht=book.getSheet("Sheet2");
		
		
		double value_in_dble_frmt=sht.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value_in_dble_frmt);
		
		//Autoboxing [Data wrapping]
		Double dble=new Double(value_in_dble_frmt);
		System.out.println(dble.intValue());
		
		
		//Get product price
		double price_in_dble=sht.getRow(1).getCell(2).getNumericCellValue();
		System.out.println(price_in_dble);
		
		//Get Mobile number
		double mobile_in_dble_frmt=sht.getRow(1).getCell(5).getNumericCellValue();
		System.out.println(mobile_in_dble_frmt);
		
		//Converting numeric value to stirng
		String Mobilenumber=NumberToTextConverter.toText(mobile_in_dble_frmt);
		System.out.println(Mobilenumber);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
