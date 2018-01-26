package Facebook;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Loading_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
driver.findElement(By.xpath("//*[@id='email']")).sendKeys("samaira2ambitious@gmail.com");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("rudrashashi2");	
		
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);	
driver.findElement(By.xpath("//div[@id='userNav']/ul/li/a")).click();

WebElement profilepic=driver.findElement(By.xpath("//img[@class='profilePic img']"));
	Actions act=new Actions(driver);
	act.moveToElement(profilepic).build().perform();
	driver.findElement(By.xpath("//div[text()='Update Profile Picture']")).click();	
	driver.findElement(By.xpath("//span[text()='Upload Photo']")).click();
	try {
		Process process= new ProcessBuilder(System.getProperty("user.dir")+"\\src\\fileupload\\filleuploadingnew.exe","C:\\Users\\welcome\\Desktop\\Lighthouse.jpg","open").start();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//span[text()='Crop and Save']")).click();	
	
	
	}

}
