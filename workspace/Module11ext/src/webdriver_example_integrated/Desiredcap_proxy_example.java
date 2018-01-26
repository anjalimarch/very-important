package webdriver_example_integrated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Desiredcap_proxy_example {
	public static  void main(String args[]){
	
		DesiredCapabilities cap = new DesiredCapabilities()	;
		cap.setBrowserName("Mozila");
		cap.setCapability(CapabilityType.BROWSER_NAME,"Mozila");
		cap.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		
      WebDriver driver=new FirefoxDriver(cap);
	
	}	
	
	}


