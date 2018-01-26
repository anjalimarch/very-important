package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;

public class LoginTest {
  @Test(dataProvider= "registerdata")
  public void parameterization(String login,String credential) {
	  System.out.println(login +"......"+ credential);
  }
 /* @Test(dataProvider = register data )
  public void l() {
	  
	  System.out.println(" Band");
  }*/
  @DataProvider
  public Object[][] registerdata()
  {
	  Object [][]data=new Object[3][2];
	  
	  //for(int i=0 ;i<3 ;i++)
	 // {
		 // for(int j=0 ;j<3 ;j++)
    data[0][0]="email";
	data[0][1]="password1";
	data[1][0]="email2";
     data[1][1]="password2";
		return data;						}
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Amita");
	try{ 
		Assert.assertEquals("good", "goodm");
		System.out.println("hanuuman");
	
	}catch(Throwable t)
	{
		System.out.println("pochupersonal");
	}
	
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("vineeta");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("anjali");
	  //throw new  SkipException("because of this")
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this ia all abbout thae code ");
  }

}
