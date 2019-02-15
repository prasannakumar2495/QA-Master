package com.practiceAny.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.testng.annotations.Test;

public class RetriveData {
	public static int count = 0;

	@Test(invocationCount = 1)
	private void retrivedata() throws IOException {
		FileInputStream sampleFile = new FileInputStream(
				"D:\\GIT\\QA-Master\\com.practiceAny.maven\\SampleXLSFile_212kb.xls");
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
			for (int j = 0; j <= lstrow; j++) {
				HSSFCell c = (HSSFCell) wb.getSheetAt(i).getRow(j).getCell(7);
				// System.out.println(c);
				for (int k = 0; k <= lstclmn; k++) {

					// System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex(k)));
					HSSFCell r = wb.getSheetAt(i).getRow(j).getCell(k);

					System.out.println(r + " contains " + c);
				}

			}
			System.out.println(lstclmn + " " + (lstrow+1));
		}
		// count = count++;
		System.out.println((count++) + 1);

	}
}
