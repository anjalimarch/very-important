package Elementfield;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Lightboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("http://us.makemytrip.com/");
	driver.findElement(By.xpath("//*[@id='home_popup']/p[3]/a")).click();
	//driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']/span/i"));
	//driver.findElement(By.xpath("html/body/div[2]"));
	//driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-container']"));
	//driver.findElement(By.xpath("a[@href=//www.makemytrip.com/international-flights]")).getText();
	
	
	
	}

}
