package Managing_Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.navigate().to("https://paytm.com/");
	driver.findElement(By.xpath("//*[@id='user-detail']/div/div[3]/div[3]/div/span/a[1]")).click();
	List<WebElement> frames=driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());//o/p=3
	
	/*for(int i=0;i<frames.size();i++)this is to fid out on which frame we r working with 
		
	{
		driver.switchTo().frame(i);
	int s=	driver.findElements(By.name("username")).size();
	System.out.println(s);
		
		driver.switchTo().defaultContent();//001
o/p
3
0
0
1
	}*/
	
	driver.switchTo().frame(2);
	driver.findElement(By.name("username")).sendKeys("7799136813");
	
	}

}
