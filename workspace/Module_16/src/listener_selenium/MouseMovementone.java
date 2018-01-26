package listener_selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class MouseMovementone {

	
		// TODO Auto-generated method stub

		


		

			
			public static void main(String[] args) {

				
				WebDriver web_driver = new FirefoxDriver();
				
				web_driver.manage().window().maximize();
				web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
				MyListener myListener = new MyListener();
				driver.register(myListener);
				
				driver.get("http://onlineseleniumtraining.com/");
				//EventFiringMouse mouse = new EventFiringMouse(driver , myListener);
				// move mouse
				
				WebElement element=driver.findElement(By.xpath("//*[@id='menu-item-266']/a"));
				//Locatable hoverItem = (Locatable) driver.findElement(By.xpath("//*[@id='menu-item-266']/a"));
				//Coordinates c= hoverItem.getCoordinates();
				//try{
					//mouse.mouseMove(c);
				//}catch(Exception e1){
					
					
				//}
				
				Actions action = new Actions(driver);
				action.contextClick(element);
				action.build().perform();
				
				
				// right click
				driver.findElement(By.xpath("//*[@id='menu-item-266']/a")).sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
				// coordinates
				Point p=driver.findElement(By.xpath("//*[@id='menu-item-266']/a")).getLocation();
				System.out.println(p.x);
				System.out.println(p.y);
				
				
				
				
			}

		

	
	
	
	
	
	
	
	
	
	
	
	
	}


