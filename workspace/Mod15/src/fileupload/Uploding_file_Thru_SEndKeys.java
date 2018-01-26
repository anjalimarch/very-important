package fileupload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploding_file_Thru_SEndKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("http://postimage.org/");
		driver.findElement(By.xpath("//*[@id='uploadifive-file_upload']/input[2]")).click();
		
		
		driver.findElement(By.xpath("//*[@id='uploadifive-file_upload']/input[2]")).sendKeys("src\fileupload\uploadingfile.exe");
		//this is the xpath to browse button
		
		//u can write code for click button 
	}

}
