package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooLogin {
  @Test
  public void Login() 
  {
	  System.out.println("Login to yahoo");
    }

@Test
public void loginCarefully()
{
	System.out.println("login carefully");
	}

@BeforeTest
public void Beforefirst(){
	System.out.println("Run before all test ");
	
}
@AfterTest
public void AfterLast()
{
	System.out.println("Run after all test");
	}




}
