package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
 
	public WebDriver driver =new FirefoxDriver();
	String url="https://accounts.google.com";
	@Test
  public void GmailLogin()
  {
	driver.get("https://accounts.google.com");
	driver.manage().window().maximize();
	String expectedTitle="Sign in - Google Accounts";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	WebElement username=driver.findElement(By.id("Email"));
	username.clear();
	username.sendKeys("anjalimarch24");
	WebElement next=driver.findElement(By.id("next"));
	next.click();
	WebElement password=driver.findElement(By.xpath("//input[@id=passwd]"));
	password.sendKeys("rudrashashi2");
	WebElement signin=driver.findElement(By.id("signIn"));
	signin.click();
	driver.close();
	
		
  }
}
