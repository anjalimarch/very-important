package Data;

import org.testng.annotations.Test;

public class Login {
	@Test(dataProviderClass=Data_Provider.class,dataProvider="LoginData")
	public void login(String log,String p,String e)
	{
		System.out.println(log+p+e);
		

	}

@Test(dataProviderClass=Data_Provider.class,dataProvider="LoginData")
public void loginFAil(String lok,String l)
{
	System.out.println(lok+l);
	

}

@Test() 
public void loginPasword()
{
	System.out.println("???????");
	

}

@Test() 
public void loginSuccess()
{
	System.out.println("login Succcess");
	

}

}
