package downloadingFileprof;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bsh.ParseException;

public class downloadingfilethruchrome {

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub
//this code is for ie not for chrome
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://qtpselenium.com/test/testdownload.php");

		  driver.findElement(By.xpath("html/body/a[1]")).click();

Robot rb =new Robot();
rb.keyPress(KeyEvent.VK_LEFT);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
rb.keyPress(KeyEvent.VK_ENTER);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
rb.keyPress(KeyEvent.VK_ENTER);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}
