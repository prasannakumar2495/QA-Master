package junit;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

public class TestJunit extends TestFrst
{
	@Test
	public void testz()
	{
		int i= w(1,2);
		int j= f(2,1);
		if(i==j)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}


}
