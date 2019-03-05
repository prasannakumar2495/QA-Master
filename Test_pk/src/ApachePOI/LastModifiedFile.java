package ApachePOI;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.comparator.LastModifiedFileComparator;

public class LastModifiedFile 
{
  public static void main(String[] args)
  {
	  File file1=getLatestFilefromDir("D:\\RenewalsMain\\IBR\\unknown used");
	  System.out.println(file1.getName());

      Date d = new Date(file1.lastModified());
	 // System.out.println(d);

  }
 private static File getLatestFilefromDir(String dirPath){
	    File dir = new File(dirPath);
	    File[] files = dir.listFiles();
	    if (files == null || files.length == 0) 
	    {
	        return null;
	    }

	    File lastModifiedFile = files[0];
	    for (int i = 1; i < files.length; i++) 
	    {
	       if (lastModifiedFile.lastModified() < files[i].lastModified()) 
	       {
	           lastModifiedFile = files[i];
	       }
	    }
	    return lastModifiedFile;
	}
}

