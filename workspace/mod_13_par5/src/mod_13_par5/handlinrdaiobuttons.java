package mod_13_par5;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinrdaiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Always find radi buttons with common name
//checkboxes are same as radio buttons	
		//here we are writing code for taking screen shots
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.navigate().to("https://www.utexas.edu/learn/forms/radio.html");
		
	File screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(screenshot, new File("d:\\pic\\report.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		List<WebElement>radbuttons=driver.findElements(By.name("title"));
		System.out.println("No. of radio buttons"+radbuttons.size());
		for(int i=0;i<radbuttons.size();i++)
		{
			
			
			
			radbuttons.get(i).click();
			System.out.println(radbuttons.get(i).getAttribute("checked"));
		}
		
	
		System.out.println(radbuttons.get(0).getAttribute("checked"));
	
	
	}

}
