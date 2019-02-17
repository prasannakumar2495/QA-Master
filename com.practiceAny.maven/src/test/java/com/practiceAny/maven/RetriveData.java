package com.practiceAny.maven;

//import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.record.AutoFilterInfoRecord;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.AutoFilter;
import org.apache.poi.ss.usermodel.Cell;
//import org.testng.annotations.Test;

public class RetriveData {
	public static int count = 0;
	String data;
	int reqrow;
	Object r;

	// add the xml code for aspose-cell and testNG
	// @Test(invocationCount = 1)
	public void retrivedata() throws IOException {
		FileInputStream sampleFile = new FileInputStream(
				"/Users/prasannakumaranisetti/Movies/GIT/QA-Master/com.practiceAny.maven/SampleXLSFile_212kb.xls");
		HSSFWorkbook wb = new HSSFWorkbook(sampleFile);

		for (int i = 0; i < 1; i++) {
			HSSFSheet sheet = wb.getSheetAt(i);
			HSSFRow row = null;
			HSSFCell cell;
			// Making the object of excel row
			row = sheet.getRow(0);
			// from the above row the user can fetch the last cell count in the next line
			int lstclmn = row.getLastCellNum();
			int lstrow = sheet.getLastRowNum();
			int frtrow = sheet.getFirstRowNum();

			for (int j = 0; j <= lstrow; j++) {
				data = wb.getSheetAt(i).getRow(j).getCell(1).getStringCellValue();
				HSSFCell c = (HSSFCell) wb.getSheetAt(i).getRow(j).getCell(7);
				if (data.equalsIgnoreCase("Cardinal Slant-D® Ring Binder, Heavy Gauge Vinyl")) {
					reqrow = wb.getSheetAt(i).getRow(j).getRowNum();
					System.out.println("this is the row: " + (reqrow + 1));
					for (int k = 1; k <= lstclmn-1; k++) {
						// System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex(k)));
						r = wb.getSheetAt(i).getRow(reqrow).getCell(k);
						System.out.print(r);
						System.out.print(" ");
					}
					System.out.println();
				}
			}
			System.out.println();
			 System.out.println("last column:"+lstclmn + ";" +"last row: "+ (lstrow + 1)+";"+"first row: "+frtrow);

		}
		// count = count++;
		// System.out.println((count++) + 1);
		sampleFile.close();
	}

	public static void main(String[] args) throws IOException {
		RetriveData ret = new RetriveData();
		ret.retrivedata();
	}
}
