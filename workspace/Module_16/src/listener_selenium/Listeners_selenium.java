package listener_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Listeners_selenium {

	
		// TODO Auto-generated method stub

		

	

			/**
			 * @param args
			 * @throws InterruptedException 
			 */
			public static void main(String[] args) throws InterruptedException {
				WebDriver web_driver = new FirefoxDriver();
				EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
				MyListener myListener = new MyListener();
			driver.register(myListener);
				
				driver.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
				driver.findElement(By.xpath("//*[@id='link-signup']/a")).click();
				Thread.sleep(5000L);
				// back button
				System.out.println("Going to click back button");
				driver.navigate().back();
				System.out.println("Clicking back button");
				Thread.sleep(5000L);
				driver.navigate().forward();
				Thread.sleep(5000L);

				driver.quit();
			}

		}

	
	
	
	
	
	
	
	
	


