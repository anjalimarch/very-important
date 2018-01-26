package testng_listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest {
@Test(priority=1)
public void xyzdata()
{
System.out.println("loginfail");	
try{
Assert.assertEquals("anjali", "rudra");
}
catch(Throwable t){
	System.out.println("ERROr");
	ErrorUtil.addVerificationFailure(t);
}
System.out.println("'put to an end");
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
