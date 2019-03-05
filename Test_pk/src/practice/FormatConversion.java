package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

public class FormatConversion
{
	@Test
	public void conversion() throws Exception
	{
		String filename = "D:\\tickets\\9-10\\SHSUH-51491\\51491.docx";
		String[] filename_new = filename.split("\\\\");
		System.out.println(filename_new[0]+filename_new[1]+filename_new[2]+filename_new[3]);
	/*File f = new File(filename);
	FileInputStream f1 = new FileInputStream(f);
	FileOutputStream f2 = new FileOutputStream(file)*/
	}
}
