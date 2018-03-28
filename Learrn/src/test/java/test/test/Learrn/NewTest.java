package test.test.Learrn;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.awt.print.Printable;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Reporter;

public class NewTest {
 
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
  @Test (groups = {"Sanity"} , priority = 2 )
  public void first() throws NullPointerException{
	  try {
	  StringHelper st= new StringHelper ();
	  st.areFirstAndLastTwoCharactersTheSame(null);	 
	  }catch(Exception  e) {
		  System.out.println(e.toString());
		  Reporter.log("first Test passed", 1);;
	  }
		  //e.printStackTrace();	  }
  }
  
  @Test (groups = {"Sanity"} , priority = 0 , enabled = false)
  public void second() throws NullPointerException{
	  try {
	  StringHelper st= new StringHelper ();
	   boolean b = st.areFirstAndLastTwoCharactersTheSame("CDAC");
	   System.out.println(b);
		  Reporter.log("Second Test passed", 1);;
	  }catch(Exception  e) {
		  System.out.println(e.toString());
	  }
		  //e.printStackTrace();	  }
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
