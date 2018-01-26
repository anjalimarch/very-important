package managing_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver =new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.name("proceed")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.alertIsPresent());
	
	//driver.switchTo().activeElement();
	//line dsnt bother the execution in firefox and chrome not needed but necessary for ie 
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	
	driver.switchTo().defaultContent();
	
	
	}

}
