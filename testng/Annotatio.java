package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotatio {
  @Test()
  public void f() {
	  System.out.println("print first");
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  System.out.println("print before method");
  }

  @AfterMethod()
  public void afterMethod() {
	  System.out.println("print after method");
	  
  }

  @BeforeClass(enabled=false)
  public void beforeClass() {
	  System.out.println("print before class");
  }

  @AfterClass(groups="Af",enabled=false)
  public void afterClass() {
	  System.out.println("print aftre class");
  }

  @BeforeTest(dependsOnGroups="Af" )
  public void beforeTest() {
	  System.out.println("print before test");
  }
 @ Test(invocationCount=3,threadPoolSize=2)
 public void lead() {
	System.out.println("lead is open");

}

  @AfterTest(description="this is after test method")
  public void afterTest() {
	  System.out.println("print aftertest");
  }

  @BeforeSuite(timeOut=2)
  public void beforeSuite() {
	  System.out.println("print before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("print after suite");
  }

}
