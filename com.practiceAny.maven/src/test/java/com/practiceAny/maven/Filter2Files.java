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
	Cell newscndcell;
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

	// collections list to save all the data of the row numbers that have to be
	// fetched.
	List<Integer> allreqrow = new ArrayList<Integer>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdata = new LinkedList<String>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdatafile1 = new LinkedList<String>();

	// collection of all the data from the required rows while reading the files.
	LinkedList<String> allreqdatafile2 = new LinkedList<String>();

	@Test(priority = 0)
	public void eachFile() throws Exception {
		// adding the path of the properties files
		fis = new FileInputStream("/Users/prasannakumaranisetti/Movies/GIT/QA-Master/com.practiceAny.maven/Properties/property2.properties");
		prop.load(fis);

		// number of files to be run.
		NumberFile = Integer.parseInt(prop.getProperty("No.OfFiles"));

		for (g = 1; g <= NumberFile; g++) {
			if (g == 1) {
				System.out.println("entered into the loop equal to 1");
				// loading the excel files.
				sampleFile = new FileInputStream(prop.getProperty("inputfile1"));
				readFile();
				allreqdatafile1.addAll(allreqdata);
				allreqdata.clear();
			} else if (g == 2) {
				System.out.println("entered into the loop equal to 2");
				// loading the excel files.
				sampleFile = new FileInputStream(prop.getProperty("inputfile2"));
				readFile();
				allreqdatafile2.addAll(allreqdata);
				allreqdata.clear();
			}
		}
		compareColumns();
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
			try {
				for (int j = 0; j <= lstrow; j++) {
					data = wb.getSheetAt(i).getRow(j).getCell(0).getStringCellValue();
					allreqdata.add(data);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		System.out
				.println("last column:" + (lstclmn - 1) + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);
		sampleFile.close();

	}

	@Test(invocationCount = 0)
	public void compareColumns() throws IOException {
		try {
			for (int i = 0; i < allreqdatafile1.size(); i++) {
				if (allreqdatafile2.contains(allreqdatafile1.get(i))) {
					// System.out.println(allreqdatafile1.get(i)+"---> this value is present in both
					// the files");
				} else {
					System.out.println();
					System.out.println(allreqdatafile1.get(i) + "---> this value is not present in the second file");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
}