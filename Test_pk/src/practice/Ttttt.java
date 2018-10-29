package practice;


import org.testng.annotations.*;


public class Ttttt
{
	@BeforeSuite
	public void m()
	{
		System.out.println("1");
	}
	@BeforeClass
	public void m1()
	{
		System.out.println("2");

	}
	@BeforeMethod
	public void m2()
	{
		System.out.println("3");
	}
	@BeforeTest
	public void m3()
	{
		System.out.println("4");

	}
	@Test(priority=0,groups={"a"})
	public void t()
	{
		System.out.println("second");
	}
	@Test(priority=1,alwaysRun=true,groups={"a"})
	public void t1()
	{
		System.out.println("first");
	}
	@AfterTest
	public void m4()
	{
		System.out.println("5");

	}
	@AfterMethod
	public void m5()
	{
		System.out.println("6");

	}
	@AfterClass
	public void m6()
	{
		System.out.println("7");

	}
	@AfterSuite
	public void m7()
	{
		System.out.println("8");

	}
	@AfterSuite
	public void m8()
	{
		System.out.println("10");

	}
	public void m9()
	{
		System.out.println("11");

	}

}
