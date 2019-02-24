package testNGPraciticeVijeth;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class AVStestNG {
	FileInputStream fis;
	Properties prop;
	@Test(dependsOnGroups= {"a"})
	private void man0() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("group A");
		fis = new FileInputStream("/Users/prasannakumaranisetti/Movies/GIT/QA-Master/testNGPraciticeVijeth/avs.properties");
		prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
	}
	
	@Test(groups= {"a"},dependsOnGroups= {"b"})
	private void man() {
		// TODO Auto-generated method stub
		System.out.println("a1");
	}
	@Test(groups= {"a"},dependsOnGroups= {"b"})
	private void man1() {
		// TODO Auto-generated method stub
		System.out.println("a2");
	}
	@Test(groups= {"b"})
	private void man2() {
		// TODO Auto-generated method stub
		System.out.println("b1");
	}
	@Test(groups= {"a"},dependsOnGroups= {"b"})
	private void man3() {
		// TODO Auto-generated method stub
		System.out.println("a3");
	}
	@Test(groups= {"b"})
	private void man4() {
		// TODO Auto-generated method stub
		System.out.println("b2");
	}
	@Test()
	private void done() {

	}
}
