package ExcelFilter;

import org.testng.annotations.Test;

public class Compare2Files {
	
	
	@Test
	private void comparename() throws Exception {
		FileInput1 f1 = new FileInput1();
		f1.fileInput();
		f1.retrivedata();
		FileInput2 f2 = new FileInput2();
		f2.fileInput();
		f2.retrivedata();
		/*System.out.println(f1.allreqdata1);
		System.out.println(f2.allreqdata2);*/
		for(String data1:f1.allreqdata1)
		{
			//System.out.println(data1);
			for(String data2:f2.allreqdata2)
			{
				//System.out.println(data2);
				if(data1.equalsIgnoreCase(data2))
				{
					System.out.println(data1+" equal to: "+data2);
				}
				else
				{
					System.out.println(data1+" not equal to: "+ data2);
				}
				break;
			}
		}
		
	}

}
