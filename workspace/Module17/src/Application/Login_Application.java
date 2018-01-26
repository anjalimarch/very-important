package Application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_Application {

	String CaseAerr="Notification Center";
	String CaseBerr="This field is required.";
	String CaseCerr="This field is required.";
	String CaseDerr="That is not a valid login name/password.";

@Test(dataProvider="getdata")
	public void Login(String browserName,String Username,String Password,String Expected) throws InterruptedException
	{
		//String CaseAerr="Please enter your email."; 
		//String	CaseBerr="The email and password you entered don't match.";
		//String	CaseCerr="Please enter your password.";
		
		
		
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
		driver.get("https://sat.crossfire.realpage.com/welcomehome?siteId=7000169#url=%23login");
	driver.findElement(By.xpath("//*[@id='loginuser']")).sendKeys(Username);
	driver.findElement(By.xpath("//*[@id='loginuser']")).sendKeys(Keys.ENTER);
	//driver.findElement(By.xpath("//input[@id='next']")).click();
		driver.findElement(By.xpath("//*[@id='loginpass']")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id='loginpass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='btnSubmitLogon']")).click();
		Thread.sleep(3000);
		
		//validations
		Xls_Reader write= new Xls_Reader("D:\\Xlfiles\\Application_login.xlsx");
          int col =	write.getColumnCount("app");
            int row=write.getRowCount("app");
            //  for(int i=2;i<=row;i++)
      		//{
      			//for(int j=2;j<col;j++)
      			//{String [][] updated ;
      				//updated[i-2][j]=write.setCellData("app", colName, i, "pass");
      			
      			  
		if(Expected.equals("CaseA"))
		{
			String errMsga =driver.findElement(By.cssSelector(".row-fluid div h1")).getText();
			Assert.assertEquals(errMsga , CaseAerr);
		
			System.out.println("Login Successfull");
		}
		
		else if(Expected.equals("CaseB"))
		{
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='loginpass']"))).build().perform();
		WebElement msgbox=driver.findElement(By.cssSelector(".ui-tooltip-content"));	
		String errMsg= msgbox.getText();
				System.out.println(errMsg);
		Assert.assertEquals(errMsg, CaseBerr);
		
		}
		else if(Expected.equals("CaseC"))
		{
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id='loginuser']"))).build().perform();
			WebElement msgboxtwo=driver.findElement(By.cssSelector(".ui-tooltip-content"));	
			String errMsgtwo= msgboxtwo.getText();
					System.out.println(errMsgtwo);
			Assert.assertEquals(errMsgtwo, CaseCerr);
			
		}
		else if(Expected.equals("CaseD"))
		{  String  errMsgone = driver.findElement(By.cssSelector("div.alert.alert-error #login-message p")).getText();
	           System.out.println(errMsgone);
	            Assert.assertEquals(errMsgone, CaseDerr);
		
		
		}
		
	          
	 
		
		
		// validations
				//if(Expected.equals("CaseA"))
				//	Assert.assertEquals(errMsg, CaseAerr);
				//else if(Expected.equals("CaseB"))
					//Assert.assertEquals(errMsg, CaseBerr);
				//else if(Expected.equals("CaseC"))
				//	Assert.assertEquals(errMsg, CaseCerr);
				
				driver.quit();
		
		
		


	}


	@DataProvider
	public Object [][]   getdata(){
		Xls_Reader read= new Xls_Reader("D:\\Xlfiles\\Application_login.xlsx"); 
		int rNum=read.getRowCount("app");
		int cNum=read.getColumnCount("app");
		System.out.println(read.getRowCount("app"));
		System.out.println(read.getColumnCount("app"));
		Object [][] data=new Object [ rNum-1][ cNum] ;
		for(int i=2;i<=rNum;i++)
		{
			for(int j=0;j<cNum;j++)
			{
				data[i-2][j]=read.getCellData("app", j, i);
			System.out.println(read.getCellData("app", j, i));
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
