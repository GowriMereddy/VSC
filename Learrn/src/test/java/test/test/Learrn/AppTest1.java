package test.test.Learrn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;


import java.awt.print.Printable;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

import org.testng.asserts.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;



/**
 * Unit test for simple App.
 */
public class AppTest1 
    
{  
	@DataProvider (name = "Param_values")
	
   public Object[][] Data_param_values () {
		Object a[][]= {{"CDCD",true},
						{"CC",true}};
	    return a ;
	  
}
				
	@BeforeClass
    public void beforeClass() {
	  System.out.println("before class");
	  
  }
@BeforeMethod	
 public void beforeMethod() {
	 System.out.println("before Method");
 }
 
@AfterMethod
public void afterMethod() {
	System.out.println("After Method");
}
  @Test (groups = {"Sanity","BVT"}, priority = 0)
  
  public void first1() throws NullPointerException{
	  boolean b = false;
	  try {
	  StringHelper st= new StringHelper ();
	  b = st.areFirstAndLastTwoCharactersTheSame(null);
	  }catch(Exception  e) {
		  System.out.println(e.toString());
		  assertFalse(b);
		  Reporter.log("first Test passed", 1);;
	  }
		  //e.printStackTrace();	  }
  }
  
  @Test (groups = {"Sanity"} , priority = 1 , dataProvider = "Param_values" )
  public void second2(String Value,boolean Expected ) throws NullPointerException{
	  try {
	  StringHelper st= new StringHelper ();
	   boolean b = st.areFirstAndLastTwoCharactersTheSame(Value);
	   System.out.println(b);
	   assertEquals(Expected,b);
	   Reporter.log("Second Test passed", 1);;
	  }catch(Exception  e) {
		  System.out.println(e.toString());
			  e.printStackTrace();	
		  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("after test" );
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

   
}
