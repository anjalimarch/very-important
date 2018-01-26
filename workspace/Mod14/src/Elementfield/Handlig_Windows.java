package Elementfield;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		//import org.openqa.selenium.chrome.ChromeDriver;

		public class Handlig_Windows  {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				WebDriver driver=new FirefoxDriver();
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				Set<String>windowsid=driver.getWindowHandles();
				System.out.println(windowsid.size());
				Iterator<String> it=windowsid.iterator();
				System.out.println(it.next());
				
				System.out.println("**************");
				driver.navigate().to("https://in.rediff.com/");
	//handling popups
	windowsid=driver.getWindowHandles();
	System.out.println(windowsid.size());
	 it=windowsid.iterator();
	//System.out.println(it.next());
	
	//System.out.println(it.next());
	
	String mainwindow=it.next();
	String popupwindow=it.next();
	driver.switchTo().window(popupwindow);
	driver.close();
	driver.switchTo().window(mainwindow);
	}

}
