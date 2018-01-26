package Elementfield;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unpredictablepopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://in.rediff.com/");
		
	Set<String>windowid=driver.getWindowHandles();
	Iterator<String>it=windowid.iterator();
	System.out.println(windowid.size());
	//System.out.println(windowid.size());
	if(windowid.size()==2)
	{System.out.println("?????????????");
	
		String mainwindow=it.next();
		String popupwindow=it.next();
		driver.switchTo().window(popupwindow);
		driver.close();
		driver.switchTo().window(mainwindow);
	System.out.println("?????????????");
	
	}
	else{
		System.out.println("***************");
		//driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	}

}
