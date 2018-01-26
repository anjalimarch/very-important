package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LogoutTest {
  @Test
  public void foooool() {System.out.println("hello shashi");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("*******");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(">>>>>>>...");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("hi");
	  throw new SkipException("because of this ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Bye");
  }

  @BeforeSuite
  public void beforeSuite() {System.out.println("hi all how r u");
  }

  @AfterSuite
  public void afterSuite() {System.out.println("bye bye all of you");
  }

}
