package part3;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MakeMyTrippoupclose 
 {

	 public static void main(String[] args) throws InterruptedException {
		      WebDriver webdriver = new FirefoxDriver();
		      webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      webdriver.get("http://makemytrip.com");
		      Thread.sleep(5000);
		      webdriver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");//id and name of frame
		      
		      webdriver.findElement( By.cssSelector(".wewidgeticon.we_close.icon-large")).click();//class name
		      // webdriver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']/span/i"));

		      /*
		       * System.out.println("WINDOW"+webdriver.getWindowHandle()); Set<String>
		       * set = webdriver.getWindowHandles(); System.out.println("Count:"+
		       * set.size());
		       */
		   }
		}


