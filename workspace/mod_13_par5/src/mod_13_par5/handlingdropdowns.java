package mod_13_par5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.navigate().to("http://qtpselenium.com/home/contact_trainer");
		WebElement dropdownbox=driver.findElement(By.name("country_id"));
		
		dropdownbox.sendKeys("Algeria");
		List<WebElement> dropdown = dropdownbox.findElements(By.tagName("option"));
		
		System.out.println(dropdown.size()+"-->Total number of options ");
		
		for(int i=0;i<dropdown.size();i++)
		{
		System.out.println(dropdown.get(i).getText()+"*******"+dropdown.get(i).getAttribute("selected"));
		
		}
		
		
	}

}
