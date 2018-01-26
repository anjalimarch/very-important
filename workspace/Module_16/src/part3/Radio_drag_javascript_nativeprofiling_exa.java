package part3;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import listener_selenium.MyListener;

public class Radio_drag_javascript_nativeprofiling_exa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxProfile prof= new FirefoxProfile(); //using profiling because some times mouse movements not work without it 
prof.setEnableNativeEvents(true);
WebDriver web_driver = new FirefoxDriver(prof);
		
		web_driver.manage().window().maximize();
		web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		EventFiringWebDriver driver = new EventFiringWebDriver(web_driver);
		MyListener myListener = new MyListener();
		driver.register(myListener);
		
		//driver.get("http://www.makemytrip.com/promotion/includes/Explore15_Intflights_31122015.php?intid=HPLP_hero_IF_Live_SKYHIGH_01012016");
		driver.get("http://www.makemytrip.com/holidays/india/search?dest=kashmir&channel=ONSITE&intid=DFLP_hero_DOM_Sale_kashmir_27012016##page_header");
		web_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		//driver.findElement(By.xpath("//a[@class='close']")).click();
	
	//	((JavascriptExecutor)driver).executeScript("changeTripType();");//changeTripType() this is onclick functionto move mouse
		
	//	((JavascriptExecutor)driver).executeScript("document.getElementById('oneway').click()");
	
		((JavascriptExecutor)driver).executeScript("popUpClose();");
	
	}
	}
