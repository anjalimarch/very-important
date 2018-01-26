package Elementfield;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		//for required page is loading scenario 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
		
		
		
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		
		
		
		driver.findElement(By.xpath("//*[@id='topcart']/a[1]/span")).click();
	
	//its taking time to load the desired page so we r 
		//including an explicit wait condition to that waiit til desied page 
		//element xpath has been find
		////*[@id='banner']/div/div/h4
		WebDriverWait wait =new WebDriverWait(driver,0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='banner']/div/div/h4")));
	
	}

}
