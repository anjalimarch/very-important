import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class Gmail_Login_Test_XSlX
{
	
 //WebDriver driver; 
@SuppressWarnings("deprecation")
//@BeforeTest
/*public void   openbrowser(String Browser)
{
	
	
	FirefoxProfile pro= new FirefoxProfile();
	 driver =new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");

}*/
@Test(dataProvider="getdata")
public void Login(String browserName,String Username,String Password,String Expected)
{
	String CaseAerr="Please enter your email."; 
	String	CaseBerr="The email and password you entered don't match.";
	String	CaseCerr="Please enter your password.";
	
	
	
WebDriver driver=null;
	
	if(browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}

	else if(browserName.equals("Mozila"))
	{
		
		driver=new FirefoxDriver();
		
	}
	
	else if(browserName.equals("InternetExplorer"))
	{
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://accounts.google.com");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Username);
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//input[@id='next']")).click();
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='signIn']")).sendKeys(Keys.ENTER);
	//validations
	


	
	            
 String  errMsg = driver.findElement(By.xpath("//span[@class='error-msg']")).getText();
	System.out.println(errMsg);
	// validations
			if(Expected.equals("CaseA"))
				Assert.assertEquals(errMsg, CaseAerr);
			else if(Expected.equals("CaseB"))
				Assert.assertEquals(errMsg, CaseBerr);
			else if(Expected.equals("CaseC"))
				Assert.assertEquals(errMsg, CaseCerr);
			
			driver.quit();
	
	
	


}


@DataProvider
public Object [][]   getdata(){
	Xls_Reader read= new Xls_Reader("D:\\Xlfiles\\readlogindats.xlsx"); 
	int rNum=read.getRowCount("login");
	int cNum=read.getColumnCount("login");
	System.out.println(read.getRowCount("login"));
	System.out.println(read.getColumnCount("login"));
	Object [][] data=new Object [ rNum-1][ cNum] ;
	for(int i=2;i<=rNum;i++)
	{
		for(int j=0;j<cNum;j++)
		{
			data[i-2][j]=read.getCellData("login", j, i);
		System.out.println(read.getCellData("login", j, i));
		}
	}
	
	
	
	
	/*data[0][0]="Mozila";
	data[0][1]=  "";
	data[0][2]="rudrashashi2";
	data[1][0]="Mozila";
	data[1][1]="anjalimarch24";
	data[1][2]="    ";

	data[2][0]="Mozila";

	data[2][1]=" anjali.mishra02 ";
	data[2][2]="rudrashash";
	*/
	return data;

}






















}
