package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelConfig {
	HSSFWorkbook wb;
	HSSFSheet sheet1;

	public ExcelConfig(String excelpath)
	{
		
		try {
			File excel= new File(excelpath);
			FileInputStream fis = new FileInputStream(excel);
			wb = new HSSFWorkbook(fis);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test
	public String f(int sheetNumber,int row,int column) 
	{
		 sheet1 =wb.getSheetAt(sheetNumber);
		 String data =sheet1.getRow(row).getCell(column).getStringCellValue();
		 return data;

		
	}
}
