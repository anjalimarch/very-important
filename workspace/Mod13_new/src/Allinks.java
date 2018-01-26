

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.bbc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	List<WebElement>all= driver.findElements(By.xpath("//a"));
	System.out.println(all.size()+"size of all links");
	WebElement fifthone = all.get(4);
	System.out.println("text ofthe link"+fifthone.getText());
	int x=fifthone.getLocation().x;
	int y=fifthone.getLocation().y;
	//fifthone.click();
	for(int i=0;i<all.size();i++)
	{
	
	        System.out.println(all.get(i).getText()+"****"+all.get(i).isDisplayed()); 
	        
		
	}	
		
		
	}

}
