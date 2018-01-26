import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.Assert;

public class Junttest {

	//@SuppressWarnings("deprecation")
	
	/*@BeforeClass
	public static void beforeClassTest()
	{
		System.out.println("executed before class method");
		
	}*/
	
	
	/*@Before
	public void beforeTest()
	{
		System.out.println("running before test");
	}*/
	
	
	
	@Test
	public void JunitTest()
	{
	System.out.println("running JunitTest");
	//Assert.assertEquals(1, 1);
	
	}
    @Test
     public void secondJunitTest()
     {
	
     System.out.println("running second junit");
	
	
    }
 /* @After
  public void afterTest()
  {
	  System.out.println("Running after method");
  }
*/
@AfterClass
public static void afterClassTest()
{
	System.out.println("this one is fabulous ");
}

}