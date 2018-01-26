import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class creating_element {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en/mail/help/about.html");
		

		//WebElement ement=driver.findElement(By.xpath("//div[@class='wrapper']/div[2]/div[@class='banner']/h1"));
	//String txt =ement.getText();
//System.out.println(txt);
	
	String text =driver.findElement(By.xpath("//img[@src='//www.google.com/images/branding/googlelogo/1x/googlelogo_color_116x41dp.png']")).getAttribute("alt");
	System.out.println(text);
	
	driver.findElement(By.xpath("//a[@href='https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/']")).click();
	
	 driver.findElement(By.xpath("//input[@id='Email' and @placeholder='Enter your email' and @name='Email'] ")).sendKeys("anjali.mishra02");
	 driver.findElement(By.xpath("//input[@id='next' and @class='rc-button rc-button-submit' and @name='signIn'] ")).click();
	 System.out.println("Text");
	 
	 
	 
	}

}
