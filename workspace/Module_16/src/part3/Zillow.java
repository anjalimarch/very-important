package part3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listener_selenium.MyListener;

public class Zillow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxProfile prof= new FirefoxProfile(); //using profiling because some times mouse movements not work without it 
		prof.setEnableNativeEvents(true);
		WebDriver web_driver = new FirefoxDriver(prof);
				
				web_driver.manage().window().maximize();
				web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
				MyListener myListener = new MyListener();
				driver.register(myListener);
				
				//driver.get("http://www.makemytrip.com/promotion/includes/Explore15_Intflights_31122015.php?intid=HPLP_hero_IF_Live_SKYHIGH_01012016");
				driver.get("http://www.zillow.com/");
				web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				List<WebElement> frames=driver.findElements(By.tagName("iframe"));
				System.out.println(frames.size());//o/p=3
				
				for(int i=0;i<frames.size();i++)
                {
                try
                {
                System.out.println("Entered Try");
                driver.switchTo().frame(i);
                System.out.println("Switched to frame");
                Thread.sleep(3000);
                driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcde");
              driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcde");
          //   int x= driver.findElements(By.xpath("//input[@id='email']")).size();
            // System.out.println(x);
            // int y=  driver.findElements(By.xpath("//input[@id='password']")).size();
            // System.out.println(y);// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abcde");
                }
                catch(Exception e)
                {
                System.out.println("Not in this frame:"+ i);
                driver.switchTo().defaultContent();
                }
                System.out.println("Out of catch");
                }
				//driver.switchTo().frame(2);
				//driver.findElement(By.name("username")).sendKeys("7799136813");
				
				}

	
	
	
	
	
	
	

}
