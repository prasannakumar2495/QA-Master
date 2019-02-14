package com.practiceAny.maven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.testng.annotations.Test;

public class RetriveData {

	@Test
	private void retrivedata() throws IOException {
		FileInputStream sampleFile = new FileInputStream(
				"D:\\GIT\\QA-Master\\com.practiceAny.maven\\SampleXLSFile_212kb.xls");
		HSSFWorkbook wb = new HSSFWorkbook(sampleFile);
		// HSSFWorkbook test = new HSSFWorkbook();
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow row = null;
		HSSFCell cell;
		// Making the object of excel row
		row = sheet.getRow(0);
		int lstclmn = row.getLastCellNum();
		int lstrow = sheet.getLastRowNum();

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
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j <= lstrow; j++) {
				System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex("B")));
			}
		}
	}
}
