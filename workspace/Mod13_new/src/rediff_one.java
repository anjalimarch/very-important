import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_one {
public  static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
	WebElement box=d.findElement(By.cssSelector("#popular_cat"));
	
	List<WebElement> all=box.findElements(By.tagName("a"));
	for(int i=0;i<all.size();i++)
	{
		
		
		
		System.out.println("*************************");
		System.out.println("all elements which are links" +all.get(i).getText());
		all.get(i).click();
		System.out.println("this is the title"+d.getTitle());	
		//org.openqa.selenium.StaleElementReferenceException:
		//becaz the cache memory has the objects have been has been lost
		d.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		//it will go to the main page but it ll give stale execeptiion becaz 
		//in loop again wont be able to find the objects created 
		
		 box=d.findElement(By.cssSelector("#popular_cat"));
		
		 all=box.findElements(By.tagName("a"));
	
	//we can declare again the objects 
	
	
	
	}
	
	
	
	
	
	
	
	
}
}
