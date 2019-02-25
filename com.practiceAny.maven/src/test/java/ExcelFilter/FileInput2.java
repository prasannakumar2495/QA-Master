package ExcelFilter;

import java.io.*;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class FileInput2{
	int rownum = 0;
	int count = 0;
	int countopdata = 0;
	String data;
	int reqrow;
	XSSFCell r;
	int lstclmn;
	long lstrow;
	int frtrow;
	XSSFSheet ipsheet;
	XSSFRow row;
	FileInputStream sampleFile;
	FileOutputStream fos;
	DataFormatter dataFormatter = new DataFormatter();
	String cellValue;
	Cell newcell;
	XSSFRow oprow;
	XSSFWorkbook wb;

	// for the properties files
	FileInputStream fis;
	Properties prop = new Properties();
	int sizeOfFilter;

	// collections list to save all the data of the row numbers that have to be
	// fetched.
	List<Integer> allreqrow = new ArrayList<Integer>();

	// collection of all the data from the required rows.
	LinkedList<String> allreqdata2 = new LinkedList<String>();
	@Test(priority = 0)
	public void fileInput() throws Exception {
		FileInputStream fis = new FileInputStream("D:\\GIT\\QA-Master\\com.practiceAny.maven\\property2.properties");
		
		prop.load(fis);
		sampleFile = new FileInputStream(prop.getProperty("inputfile1Path"));
		wb = new XSSFWorkbook(sampleFile);
	}

	@Test(invocationCount = 1,priority = 1)
	public void retrivedata() throws IOException {
		sizeOfFilter = Integer.parseInt(prop.getProperty("size"));
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
					for (int p = 0; p <= sizeOfFilter; p++) {
						String q = Integer.toString(p);
						if (data.equalsIgnoreCase(prop.getProperty(q))) {
							reqrow = wb.getSheetAt(i).getRow(j).getRowNum();
							System.out.println("this is the row: " + (reqrow + 1));
							allreqrow.add((reqrow + 1));
							for (int k = 1; k <= (lstclmn - 1); k++) {
								r = wb.getSheetAt(i).getRow(reqrow).getCell(k);
								cellValue = dataFormatter.formatCellValue(r);
								System.out.print(" ");
								allreqdata2.add(cellValue);
							}
							System.out.println();
						}
					}
				} catch (Exception e) {
					// e.printStackTrace();
					System.out.println("data retriving is done");
				}
			}
			System.out.println();
			System.out.println(
					"last column:" + (lstclmn - 1) + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);
		}
		sampleFile.close();
	}
	@Test(priority = 2, invocationCount = 0)
	public void write() throws IOException {
		XSSFWorkbook opwb = new XSSFWorkbook();
		XSSFSheet opsheet = opwb.createSheet("New Filtered Data");
		for (int i = 0; i < sizeOfFilter; i++) {
			for (int a = 0; a <= lstclmn; a++) {
				oprow = opsheet.createRow(i);
				for (String opdata : allreqdata2) {
					count++;
					System.out.println(count);
					System.out.println(count / (lstclmn));
					System.out.println();
					if (count / (lstclmn) == 1) {
						int strtcell = 1;
						countopdata++;
						oprow = opsheet.createRow(countopdata);
						newcell = oprow.createCell(0);
						newcell.setCellValue(countopdata + 1);
						newcell = oprow.createCell(strtcell);
						System.out.println(" the values entered into the cell: " + strtcell + " is: " + opdata);
						newcell.setCellValue(opdata);
						count = 1;
					} else {
						if (countopdata == 0) {
							newcell = oprow.createCell(0);
							newcell.setCellValue(1);
						}
						newcell = oprow.createCell(count);
						System.out.println("the values entered into the cell: " + count + " is: " + opdata);
						newcell.setCellValue(opdata);
					}
				}
				break;
			}
			break;
		}
		fos = new FileOutputStream(new File(prop.getProperty("outputfile")));
		opwb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("createworkbook.xlsx written successfully");
	}
}
