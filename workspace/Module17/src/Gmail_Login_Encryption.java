import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Gmail_Login_Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxProfile pro= new FirefoxProfile();
		 WebDriver driver = new FirefoxDriver(pro);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com");
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anjalimarch24");
	
	//driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anjalimarch24");
	driver.findElement(By.xpath("//input[@id='next']")).click();
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(Encodedpassword("cnVkcmFzaGFzaGky"));
	driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys(Keys.ENTER);
	
	
	}
	//String  orignal_pass="rudrashashi2";
public static String Encodedpassword(String encrypted){
	
	//String  orignal_pass="rudrashashi2";
	 //byte[] encoded = Base64.encodeBase64(orignal_pass.getBytes()); 
	// System.out.println("Original String: " +  orignal_pass);
  //  System.out.println("Base64 Encoded String : " + new String(encoded));
  //  String encryptpass=new String(encoded);
    //decoding byte array into base64
    byte[] decoded = Base64.decodeBase64(encrypted);      
    System.out.println("Base 64 Decoded  String : " + new String(decoded));
	String decodepass=new String(decoded);
	return decodepass;
	
	
}



}
