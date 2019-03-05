package Testselenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataRetrive {
	@Test(dataProvider="facebook")
	public void auto(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
		
	}
	@DataProvider(name="facebook")
	public Object[][] data()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="321654";
		data[0][1]="pwd";
		data[1][0]="123";
		data[1][1]="pwd1";
		data[2][0]="456123";
		data[2][1]="pwd2";
		return data;
		
	}

}
