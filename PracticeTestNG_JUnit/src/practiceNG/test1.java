package practiceNG;

import org.testng.annotations.*;


public class test1 {
	@BeforeSuite
	private void suite() {
		// TODO Auto-generated method stub
		System.out.println(1 +" the before suite");
		//String a = "dhanush";
		int b =20;
		System.out.println("dhanuish"+b);
	}

	@BeforeTest
	private void test() {
		// TODO Auto-generated method stub
		System.out.println(2+ " the before test");
	}

	@BeforeClass
	private void bclass() {
		// TODO Auto-generated method stub
		System.out.println(3+" the before class");
	}

	@BeforeMethod
	private void method() {
		// TODO Auto-generated method stub
		System.err.println(4+" this is the before method");
	}

	@BeforeGroups
	private void groups() {
		// TODO Auto-generated method stub
		System.out.println(5+" this is the before groups");
	}

	@Test
	public void f() {
		System.out.println(6+" this the first print");
	}

	@AfterGroups
	private void groups1() {
		// TODO Auto-generated method stub
		System.out.println(7+" the after group");
	}

	@AfterMethod
	private void method1() {
		// TODO Auto-generated method stub
		System.out.println(8+" the after method");
	}

	@AfterClass
	private void bclass1() {
		// TODO Auto-generated method stub
		System.out.println(9+" the after class");
	}

	@AfterTest
	private void atest1() {
		// TODO Auto-generated method stub
		System.err.println(10+" this is the after test");
	}

	@AfterSuite
	private void suite1() {
		// TODO Auto-generated method stub
		System.out.println(11+" this is the after suite");
	}

}
