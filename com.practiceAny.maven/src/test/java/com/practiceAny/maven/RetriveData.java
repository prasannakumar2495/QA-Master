package com.practiceAny.maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.*;
import org.testng.annotations.Test;

public class RetriveData {
	
	@Test
	private void retrivedata() throws IOException {
		FileInputStream sampleFile = new FileInputStream("D:\\GIT\\QA-Master\\com.practiceAny.maven\\SampleXLSFile_212kb.xls");
		HSSFWorkbook  wb = new HSSFWorkbook(sampleFile);
        HSSFWorkbook test = new HSSFWorkbook(); 
        HSSFSheet sheet = wb.getSheet("PK");
        HSSFRow row; 
        HSSFCell cell;
        Iterator rows = sheet.rowIterator();
       /* while (rows.hasNext())
        {
            row=(HSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext())
            {
                cell=(HSSFCell) cells.next();   
                if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING)
                {
                    System.out.print(cell.getStringCellValue()+" ");
                }
                else if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC)
                {
                    System.out.print(cell.getNumericCellValue()+" ");
                }
                else
                {
                }
            }
            System.out.println();
        }*/
    }   
}
	