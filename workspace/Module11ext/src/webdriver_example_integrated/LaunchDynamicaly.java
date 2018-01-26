package webdriver_example_integrated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LaunchDynamicaly {
	
	@Test(dataProvider="getData")
	public void browser(String browserName,String Username,String Password)
	{
		WebDriver driver=null;
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://gmail.com");
		}
	
		else if(browserName.equals("Mozila"))
		{
			
			driver=new FirefoxDriver();
			driver.get("http://gmail.com");
		}
		
		else if(browserName.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			InternetExplorerDriver ie = new InternetExplorerDriver();
			ie.get("http://gmail.com");
		}
	
	driver.manage().window().maximize();
	
	
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="Mozila";
		data[0][1]="anjali.mishra02";
		data[0][2]="rudrashashi2";
		
		data[1][0]="Chrome";
		data[1][1]="anjali.mishra02";
		data[1][2]="rudrashashi2";
		
		
		data[2][0]="InternetExplorer";
		data[2][1]="anjali.mishra02";
		data[2][2]="rudrashashi2";
		
	return data;	
	}
	
	
	
	
	}


