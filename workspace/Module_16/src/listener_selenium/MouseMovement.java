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


public class MouseMovement {

	
	public static void main(String[] args) {

		
		WebDriver web_driver = new FirefoxDriver();
		
		web_driver.manage().window().maximize();
		web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
		MyListener myListener = new MyListener();
		driver.register(myListener);
		
		driver.get("http://www.seleniumeasy.com/");
		EventFiringMouse mouse = new EventFiringMouse(driver , myListener);
		// move mouse
		// not possible thru actions because we have to scroll down the window for web element
	//WebElement	element=	driver.findElement(By.xpath("//*[@id='times-news---radiowidget']/ul[1]/li[1]/h3/a"));
		Locatable hoverItem = (Locatable) driver.findElement(By.xpath("//*[@id='block-block-41']/div/p/a"));
		Coordinates c= hoverItem.getCoordinates();
		try{
			mouse.mouseMove(c);
		}catch(Exception e1){
			
			
		}
		
		//Actions action = new Actions(driver).contextClick(element);
		//action.build().perform();
		
		
		// right click
		driver.findElement(By.xpath("//*[@id='block-block-41']/div/p/a")).sendKeys(Keys.chord(Keys.SHIFT,Keys.F10));
		// coordinates
		Point p=driver.findElement(By.xpath("//*[@id='block-block-41']/div/p/a")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		
		
		
	}

}


