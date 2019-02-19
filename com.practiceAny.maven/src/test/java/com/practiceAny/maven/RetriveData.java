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
	Object[] sallreqdata;

	// collections list to save all the data of the row numbers that have to be
	// fetched.
	List<Integer> allreqrow = new ArrayList<Integer>();

	// collection of all the data from the required rows.
	LinkedList<XSSFCell> allreqdata = new LinkedList<XSSFCell>();

	// add the xml code for testNG
	@Test(priority = 0)
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
							System.out.print(" ");
							allreqdata.add(r);
						}
						System.out.println();
					}
				} catch (Exception e) {
					// e.printStackTrace();
					// System.out.println("done with retriving");
				}
			}
			System.out.println();
			System.out.println(
					"last column:" + (lstclmn - 1) + ";" + "last row: " + (lstrow) + ";" + "first row: " + frtrow);

		}
		sampleFile.close();
		for (int i1 = 0; i1 < allreqdata.size(); i1++) {
			if (allreqdata.get(i1) != null) {
				System.out.println(allreqdata.get(i1));
				System.out.println(allreqdata.get(i1).getClass().getSimpleName());
				
			} else {
				System.out.println("N/A" + ",");
			}
		}
	}

	@Test(priority = 1, invocationCount = 1)
	public void write() throws IOException {
		XSSFWorkbook wwb = new XSSFWorkbook();
		XSSFSheet opsheet = wwb.createSheet("New Filtered Data");
		for (int i = 0; i < allreqdata.size(); i++) {
			XSSFRow oprow = opsheet.createRow(i);
			
			
			 for(Object obj : allreqdata)
		        {
				 System.out.println(obj);
					Cell cell = oprow.createCell(i);
					//cell.setCellValue((String) obj);
		            if(obj.getClass().getSimpleName() != null)
		            {
		                cell.setCellValue((String) obj);
		            }
		            else if(obj.getClass().getSimpleName()=="Boolean")
		            {
		                cell.setCellValue((Boolean) obj);
		            }
		            else if(obj.getClass().getSimpleName()=="String")
		            {
		                cell.setCellValue((String) obj);
		            }
		            else if(obj.getClass().getSimpleName()=="Double")
		            {
		                 cell.setCellValue((Double) obj);
		            }
		        
				 /*
		            if(obj instanceof Date)
		            {
		                cell.setCellValue((Date) obj);
		            }
		            else if(obj instanceof Boolean)
		            {
		                cell.setCellValue((Boolean) obj);
		            }
		            else if(obj instanceof String)
		            {
		                cell.setCellValue((String) obj);
		            }
		            else if(obj instanceof Double)
		            {
		                 cell.setCellValue((Double) obj);
		            }
		        */}

			/*for (Object x : allreqdata) {

				
				  //cell.setValue(x); 
				if(((Cell) x).getCellType()==x.CELL_TYPE_STRING) {
				  cell.setCellValue(x.toString()); 
				  } 
				else if(x.getCellType()==x.CELL_TYPE_NUMERIC) { 
					cell.setCellNum((int)x); 
					}
				  
				 }*/

		}
		
		  FileOutputStream fos = new FileOutputStream( new
		  File("D:\\GIT\\QA-Master\\com.practiceAny.maven\\EmployeeMaster (op).xls"));
		  wwb.write(fos); fos.flush(); fos.close();
		  System.out.println("createworkbook.xlsx written successfully");
		 
	}

	/*
	 * public static void main(String[] args) throws IOException { RetriveData ret =
	 * new RetriveData(); ret.retrivedata(); }
	 */
}
