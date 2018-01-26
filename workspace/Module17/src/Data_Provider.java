//package Data;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider {
	

	@DataProvider(name="LoginData")
	public static Object[][] loginGmail(String Browser)
	{
		Object creden[][] =null;
		if(m.getName().equals("login"))
		{
		creden=new Object[2][3];
		creden[0][0]="Anjali";
		creden[0][1]="rudrashashi3";
		creden[0][2]="anjali.mishra02";
		System.out.println("login into the application");
		}else if(m.getName().equals("loginFAil"))
		    {
		
			creden=new Object[2][2];
			creden[0][0]="Anj";
			creden[0][1]="rudras";
			System.out.println("login into the application");
		
			}
	return creden ;
	}

	//private static void elseif(boolean equals) {
		// TODO Auto-generated method stub
		
	//}
	/*@DataProvider(name="sampledata")
	public static Object[][] signout()
	{
		Object[][] creden =new  Object[2][3];
		creden[0][0]="Vineeta";
		creden[0][1]="rudrashashi2";
		creden[0][2]="Vineetamis";
		System.out.println("login into the application");
	return creden ;
	}*/







}
