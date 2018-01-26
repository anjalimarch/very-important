package managing_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/droppable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	driver.switchTo().frame(0);
	
	System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
	WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
	
	WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest).build().perform();
    System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
	
	driver.switchTo().defaultContent();
	
	
	
	
	
	
	
	
	}

}
