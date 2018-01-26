package Data;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Final {
@Test(priority=1)
public void xyzdata()
{
System.out.println("loginfail");	

Assert.assertEquals("anjali", "rudra");
}
	
@Test(priority=2,dependsOnMethods={"xyzdata"})
public void xyzdataparttial()
{
	System.out.println("navigate to home page");
}



@Test(priority=3)
public void xyzdatawhole()
{
   System.out.println("logout");	
}
}
