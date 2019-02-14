package com.practiceAny.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.testng.annotations.Test;

public class RetriveData {
	public static int count = 0;
	@Test(invocationCount = 10)
	private void retrivedata() throws IOException {
		//int count = 0;
		FileInputStream sampleFile = new FileInputStream(
				"D:\\GIT\\QA-Master\\com.practiceAny.maven\\SampleXLSFile_212kb.xls");
		HSSFWorkbook wb = new HSSFWorkbook(sampleFile);
		// HSSFWorkbook test = new HSSFWorkbook();
		

		// Iterator rows = sheet.rowIterator();
		/*
		 * while (rows.hasNext()) { row=(HSSFRow) rows.next(); Iterator cells =
		 * row.cellIterator(); while (cells.hasNext()) { cell=(HSSFCell) cells.next();
		 * if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
		 * System.out.println(cell.getStringCellValue()+" "); } else
		 * if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
		 * System.out.println(cell.getNumericCellValue()+" "); } else { }
		 * 
		 * cell=(HSSFCell) cells.next(); try {
		 * System.out.print(cell.getStringCellValue()+" "); } catch (Exception e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); System.out.println(e); }
		 * } System.out.println(); }
		 */
		// LinkedList<Integer> i = new LinkedList();
		for (int i = 0; i <= 1; i++) {
			HSSFSheet sheet = wb.getSheetAt(i);
			HSSFRow row = null;
			HSSFCell cell;
			// Making the object of excel row
			row = sheet.getRow(0);
			int lstclmn = row.getLastCellNum();
			int lstrow = sheet.getLastRowNum();
			for (int j = 0; j <= lstrow; j++) {
				
				System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex("B")));
				
			}System.out.println(lstclmn+" "+lstrow);
		}
	//count = count++;
		System.out.println((count++) + 1);
		//System.out.println(lstclmn+" "+lstrow);
		/*row.createCell(1).setCellValue("pksdgsg");
		sampleFile.close();
		FileOutputStream outFile =new FileOutputStream(new File("D:\\GIT\\QA-Master\\com.practiceAny.maven\\SampleXLSFile_212kb.xls"));
		wb.write(outFile);
        outFile.close();*/
		
	}
	/*@Test
	public void fcount()
	{
		System.out.println(count);
	}
*/
}
