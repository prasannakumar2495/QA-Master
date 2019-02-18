package com.practiceAny.maven;

import java.io.File;

//import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class RetriveData {
	public static int count = 0;
	String data;
	int reqrow;
	XSSFCell r;
	int lstclmn;
	long lstrow;
	int frtrow;
	XSSFSheet ipsheet;
	XSSFRow row;
	XSSFCell cell;

	//collections list to save all the data of the row numbers that have to be fetched.
	List<Integer> allreqrow = new ArrayList<Integer>();
	
	//collection of all the data from the required rows.
	LinkedList<XSSFCell>  allreqdata = new LinkedList<XSSFCell>();
	// add the xml code for testNG
	@Test
	public void retrivedata() throws IOException {
		FileInputStream sampleFile = new FileInputStream(
				"D:\\GIT\\QA-Master\\com.practiceAny.maven\\EmployeeMaster (ip).xls");
		XSSFWorkbook wb = new XSSFWorkbook(sampleFile);

		for (int i = 0; i < 1; i++) {
			ipsheet = wb.getSheetAt(i);
			row = null;
			// Making the object of excel row
			row = ipsheet.getRow(0);
			// from the above row the user can fetch the last cell count in the next line
			lstclmn = row.getLastCellNum();
			lstrow = ipsheet.getLastRowNum();
			frtrow = ipsheet.getFirstRowNum();
			for (int j = 0; j <= lstrow; j++) {
				try {
					data = wb.getSheetAt(i).getRow(j).getCell(1).getStringCellValue();
					if (data.equalsIgnoreCase("Abdulla Khaliq Shaikh")) {
						reqrow = wb.getSheetAt(i).getRow(j).getRowNum();
						System.out.println("this is the row: " + (reqrow + 1));
						allreqrow.add((reqrow + 1));
						for (int k = 1; k <= (lstclmn - 1); k++) {
							// System.out.println(wb.getSheetAt(i).getRow(j).getCell(CellReference.convertColStringToIndex(k)));
							r = wb.getSheetAt(i).getRow(reqrow).getCell(k);
							if(r!= null)
							{
								System.out.print(r);
							}
							else
							{
								System.out.println("this is an empty cell");
							}
							
							System.out.print(" ");
							allreqdata.add(r);
						}
						System.out.println();
					}
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println("done with retriving");
				}
			}
			System.out.println();
			System.out.println("last column:" + (lstclmn-1) + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);

		}
		sampleFile.close();
		for (int i1 = 0; i1 < allreqdata.size(); i1++) {
			System.out.println(allreqdata.get(i1));
		}
	}

	@Test(invocationCount = 0)
	public void write() throws IOException {
		XSSFWorkbook wwb = new XSSFWorkbook();
		XSSFSheet opsheet = wwb.createSheet("New Filtered Data");
		for (int i = 0; i <= allreqrow.size(); i++) {
			XSSFRow oprow = opsheet.createRow(i);
			for (int j = 0; j <= lstclmn; j++) {
				Cell cell = oprow.createCell(j);
				
				//cell.setCellValue(r);
			}
		}
		FileOutputStream fos = new FileOutputStream(
				new File("D:\\GIT\\QA-Master\\com.practiceAny.maven\\EmployeeMaster (op).xls"));
		wwb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("createworkbook.xlsx written successfully");
	}

	/*
	 * public static void main(String[] args) throws IOException { RetriveData ret =
	 * new RetriveData(); ret.retrivedata(); }
	 */
}
