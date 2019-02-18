package com.practiceAny.maven;

import java.io.File;

//import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class RetriveData {
	public static int count = 0;
	String data;
	int reqrow;
	String r;

	// add the xml code for testNG
	@Test(invocationCount = 0)
	public void retrivedata() throws IOException {/*
		FileInputStream sampleFile = new FileInputStream(
				"D:\\GIT\\QA-Master\\com.practiceAny.maven\\EmployeeMaster (39).xls");
		XSSFWorkbook wb = new XSSFWorkbook(sampleFile);

		for (int i = 0; i < 1; i++) {
			XSSFSheet sheet = wb.getSheetAt(i);
			XSSFRow row = null;
			XSSFCell cell;
			// Making the object of excel row
			row = sheet.getRow(0);
			// from the above row the user can fetch the last cell count in the next line
			int lstclmn = row.getLastCellNum();
			long lstrow = sheet.getLastRowNum();
			int frtrow = sheet.getFirstRowNum();
			for (int j = 0; j <= lstrow; j++) {
				try {
					data = wb.getSheetAt(i).getRow(j).getCell(1).getStringCellValue();
					if (data.equalsIgnoreCase("Abdulla Farhan Bevinje Mohammed")) {
						reqrow = wb.getSheetAt(i).getRow(j).getRowNum();
						System.out.println("this is the row: " + (reqrow + 1));
						for (int k = 1; k <= lstclmn - 1; k++) {
							// System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex(k)));
							r = wb.getSheetAt(i).getRow(reqrow).getCell(k).toString();
							System.out.print(r);
							System.out.print(" ");
						}
						System.out.println();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("done with retriving");
				}
			}
			System.out.println();
			System.out.println("last column:" + lstclmn + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);

		}
		// count = count++;
		// System.out.println((count++) + 1);
		sampleFile.close();
	
	*/}
	
	@Test
	public void write() throws IOException {
		XSSFWorkbook wwb = new XSSFWorkbook();
		FileOutputStream fos = new FileOutputStream(new File("D:\\GIT\\QA-Master\\com.practiceAny.maven\\EmployeeMaster (39).xls"));
		wwb.write(fos);
	      fos.close();
	      System.out.println("createworkbook.xlsx written successfully");
	}

	/*
	 * public static void main(String[] args) throws IOException { RetriveData ret =
	 * new RetriveData(); ret.retrivedata(); }
	 */
}
