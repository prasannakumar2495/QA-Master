package com.maven.test.com.maven.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenClass {
	
	@Test(groups= {"pk"})
	private void run0() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test
	private void nut() {
		System.out.println("kumar prasanna");
	}
	@Test(groups= {"pk","kp"})
	private void run1() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(groups= {"pk","pkp"})
	private void run2() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(invocationCount= 10)
	private void run3() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	@Test(invocationCount= 10)
	private void run4() {
		System.out.println("prasanna kumar");
		Reporter.log("methods has been executed succesfully");
	}
	

}
