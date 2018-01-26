package webdriver_example_integrated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exampleone {
@BeforeTest
public void printtheresult()
{
	System.out.println("launchbrowser");
}


@Test
public void Launchbrowser(){
	System.out.println("*********");
	
/*System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");*/
		
		
/*System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
InternetExplorerDriver ie = new InternetExplorerDriver();
ie.get("http://gmail.com");*/

WebDriver driver=new FirefoxDriver();
driver.get("http://gmail.com");



}
}
