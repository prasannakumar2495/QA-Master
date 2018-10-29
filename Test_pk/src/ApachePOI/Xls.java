package ApachePOI;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class Xls {
	@Test
	public void f() throws Exception {
	
			File f1 = new File("D:\\selenium\\self created files\\apache.xls");
			FileInputStream fis= new FileInputStream(f1);
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet1=wb.getSheetAt(0);
			String rowvalue=sheet1.getRow(0).getCell(0).getStringCellValue();
			System.out.println(rowvalue);
			

	}
}
