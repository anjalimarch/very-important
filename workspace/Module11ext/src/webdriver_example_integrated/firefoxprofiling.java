package webdriver_example_integrated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class firefoxprofiling {
	@Test
	public void profile(){
	ProfilesIni prof=new ProfilesIni();
	//represent profiles n your machine
	FirefoxProfile seleniumprofile=prof.getProfile("selenium");
	//this is the part of firfox only in other browser its not there
	WebDriver driver  = new FirefoxDriver(seleniumprofile);
	}
}
