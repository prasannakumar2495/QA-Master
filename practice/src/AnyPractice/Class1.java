package AnyPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class1 {
	/*Test NG Advantages:
	 * Test NG Annotations are used to Create the Test cases
	 * Test case are Grouped and Prioirities 
	 * Supports Parameterized 
	 * supports Data Driver Testing using the "Data Providers"
	 * execute multiple programs / /classes using XML
	 * Generates HTML Reports 
	 * parallel execution is possible
	 * support Integration tools like (Eclise IDE,Ant,Maven)
	 * 
	 * http://beust/eclipse/
	 * 
	 */
  @Test
  public void f() {
	  Assert.assertEquals("Sravan","Sravan");
	  System.out.println("sravan");
	  Assert.fail();
  }
}
