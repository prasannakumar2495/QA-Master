package com.practiceAny.maven;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class Filter2Files {
	int count = 0;
	int countopdata = 0;
	Cell newcell;
	int NumberFile;
	int sizeOfFilter;
	XSSFSheet ipsheet;
	XSSFWorkbook wb;
	XSSFRow row;
	int lstclmn;
	long lstrow;
	int frtrow;
	String data;
	int reqrow;
	XSSFCell r;
	XSSFRow oprow;
	int g;
	FileInputStream sampleFile;

	FileInputStream fis;
	Properties prop = new Properties();

	FileOutputStream fos;

	DataFormatter dataFormatter = new DataFormatter();
	String cellValue;

	// collections list to save all the data of the row numbers that have to be
	// fetched.
	List<Integer> allreqrow = new ArrayList<Integer>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdata = new LinkedList<String>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdatafile1 = new LinkedList<String>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdatafile2 = new LinkedList<String>();

	// compare sheet
	XSSFRow cmprow;
	int cmplstclmn;
	int cmplstrow;
	int cmpfrstrow;

	@Test(priority = 0)
	public void eachFile() throws Exception {
		// adding the path of the properties files
		fis = new FileInputStream("D:\\GIT\\QA-Master\\com.practiceAny.maven\\Properties\\property2.properties");
		prop.load(fis);

		// number of the filters to be applied for
		sizeOfFilter = Integer.parseInt(prop.getProperty("size"));

		// number of files to be run.
		NumberFile = Integer.parseInt(prop.getProperty("No.OfFiles"));

		for (g = 0; g <= NumberFile; g++) {
			if (g == 1) {
				System.out.println("entered into the loop equal to 1");
				// loading the excel files.
				sampleFile = new FileInputStream(prop.getProperty("inputfile1"));
				readFile();
				allreqdatafile1.addAll(allreqdata);
				System.out.println("the data in the file: " + " is " + allreqdatafile1);
				allreqdata.clear();
			} else if (g == 2) {
				System.out.println("entered into the loop equal to 2");
				// loading the excel files.
				sampleFile = new FileInputStream(prop.getProperty("inputfile2"));
				readFile();
				allreqdatafile2.addAll(allreqdata);
				System.out.println("the data in the file: " + " is " + allreqdatafile2);
				System.out.println("the size of the data from the file number 2 is: "+allreqdatafile2.size());
				System.out.println("the data in the cell is: "+ allreqdatafile2.get(1));
				writeFile();
				System.out.println("the data is being written into the sheet 2");
				allreqdata.clear();
			}
		}
	}

	@Test(invocationCount = 0)
	public void readFile() throws Exception {
		wb = new XSSFWorkbook(sampleFile);

		// loop for the sheets
		for (int i = 0; i < 1; i++) {
			ipsheet = wb.getSheetAt(i);
			row = null;
			// Making the object of excel row
			row = ipsheet.getRow(0);
			// from the above row the user can fetch the last cell count in the next line
			lstclmn = row.getLastCellNum();
			lstrow = ipsheet.getLastRowNum();
			frtrow = ipsheet.getFirstRowNum();

			// loop for the rows
			for (int j = 0; j <= lstrow; j++) {
				data = wb.getSheetAt(i).getRow(j).getCell(1).getStringCellValue();

				// loop for the number of the data to be identified in the excel sheet, so
				// converting them into the string format in the next line
				for (int p = 0; p <= sizeOfFilter; p++) {
					String q = Integer.toString(p);

					// condition to validate the data
					if (data.equalsIgnoreCase(prop.getProperty(q))) {
						reqrow = wb.getSheetAt(i).getRow(j).getRowNum();
						System.out.println("this is the row: " + (reqrow + 1));
						allreqrow.add((reqrow + 1));
						allreqdata.add(data);
					}
				}
			}
			System.out.println();
		}
		System.out
				.println("last column:" + (lstclmn - 1) + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);
		sampleFile.close();

	}

	@Test(invocationCount = 0)
	public void writeFile() throws Exception {
		XSSFWorkbook opwb = new XSSFWorkbook();
		XSSFSheet opsheet = opwb.createSheet("Data to be compared");
		for (int w = 0; w <= sizeOfFilter; w++) {
			int numrow = 0;
			for (String value1 : allreqdatafile1) {
				numrow++;
				oprow = opsheet.createRow(numrow);
				newcell = oprow.createCell(0);
				newcell.setCellValue(value1);
			}
			for (int i = 1; i <= sizeOfFilter + 1; i++) {
				newcell = opsheet.getRow(i).createCell(1);
				newcell.setCellValue(allreqdatafile2.get(i-1));
			}
		}
		fos = new FileOutputStream(prop.getProperty("comparedFile"));
		opwb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("createworkbook.xlsx written successfully");

	}

	@Test(priority = 1, invocationCount = 0)
	public void compareColumns() throws IOException {
		FileInputStream fiscmp = new FileInputStream(prop.getProperty("comparedFile"));
		XSSFWorkbook cmpwb = new XSSFWorkbook(fiscmp);
		XSSFSheet cmpsheet = cmpwb.getSheet("Data to be compared");
		cmprow = null;
		cmprow = cmpsheet.getRow(1);
		cmplstclmn = cmprow.getLastCellNum();
		System.out.println("the last column is: " + cmplstclmn);
		cmplstrow = cmpsheet.getLastRowNum();
		System.out.println("the last row is: " + cmplstrow);
		cmpfrstrow = cmpsheet.getFirstRowNum();
		for (int i = 0; i <= cmplstrow; i++) {
			String cmpfrstcellvalue = cmpsheet.getRow(i).getCell(0).getStringCellValue();
			String cmpscndcellvalue = cmpsheet.getRow(i).getCell(1).getStringCellValue();
			if (cmpfrstcellvalue.equalsIgnoreCase(cmpscndcellvalue)) {
				System.out.println(cmpfrstcellvalue + " is equal to: " + cmpscndcellvalue);
			}
		}
		fiscmp.close();
	}
}