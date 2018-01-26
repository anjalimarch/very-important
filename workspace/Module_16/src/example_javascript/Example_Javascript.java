package example_javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("http://www.espncricinfo.com/");
		//driver.navigate().to("http://www.ebay.com/");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*driver.navigate().to("http://www.espncricinfo.com/");
WebElement series=driver.findElement(By.xpath("//a[text()='Series']"));
		
		
	System.out.println(driver.findElement(By.xpath("//a[text()='Series']")).isDisplayed());	
		
	Actions act=new Actions(driver)	;
		act.moveToElement(series).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Ranji Trophy']")).click();	
		*/
	//we java script executer to move mouse on the web menu bacause if there are no li tag no ul tag or a tag actions class wont work
	
		//WebElement series=driver.findElement(By.xpath("//a[text()='Home & Garden']"));
		//Actions act=new Actions(driver)	;
		//act.moveToElement(series).build().perform();
		((JavascriptExecutor)driver).executeScript("alert('hello')");
	//if java script executer dsnt work then we can use EventFiringMouse or we can move mouse manualy 
	((JavascriptExecutor)driver).executeScript("mopen('m3')");
	//its not working becaz espn has change the code
	//look for mouseover in javascript
	
	}

}
