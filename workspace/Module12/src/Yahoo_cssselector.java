import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_cssselector {
	public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://in.yahoo.com/");
	String Text=driver.findElement(By.cssSelector("a[href='https://in.yahoo.com']")).getText();
	
	System.out.println(Text);
	
	driver.findElement(By.cssSelector("#UHSearchBox")).sendKeys("games");
	
	driver.findElement(By.xpath("//div/ul[starts-with(@id,'yui_3_12_0_1_14536')]/li/a[@class='Fz(18px) Fw(b) D(b) Mx(8px) C(#000.8)! Td(n) Td(n)!:h']")).click();;	
	
		
	
	

	
	
	}
	
	
	
	
		
		
	}
	
	

}
