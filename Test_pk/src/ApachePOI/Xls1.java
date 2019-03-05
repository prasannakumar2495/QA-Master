package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Xls1 
{
	String caseID;
	String caseID0;
	String caseID1;
	String casename;

	String renewalperiod;
	String value;
	String field;
	@Test
	public void f() throws Exception {

		File f1 = new File("D:\\RenewalsMain\\20180820000003_sam_daily_cancelled_renewals.csv");
		FileInputStream fis= new FileInputStream(f1);
		//for .xlsx files only
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet RenewalsIBRLog=wb.getSheetAt(0);
		int lastRow=RenewalsIBRLog.getLastRowNum();

		for(int i=0;i<=2;i++)
		{
			field=RenewalsIBRLog.getRow(0).getCell(0).getStringCellValue();
			value=RenewalsIBRLog.getRow(i).getCell(1).getStringCellValue();
			System.out.println(field+" is "+value);

		}
		HashSet set=new HashSet();

		for(int i=5;i<=lastRow;i++)
		{
			caseID=RenewalsIBRLog.getRow(i).getCell(4).getStringCellValue();


			set.add(caseID);


		}
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}


		HashSet<String> set1=new HashSet<>();
		for(int i=5;i<=lastRow;i++)
		{

			casename=RenewalsIBRLog.getRow(i).getCell(1).getStringCellValue();


			set1.add(casename);

		}
		//Identifying the duplicate
		Iterator itr1 = set1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			itr1.remove();

		}

		wb.close();
		System.out.println("done");

	}
}


