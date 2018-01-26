import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dice {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.dice.com/");
		driver.findElement(By.xpath("//input[@placeholder='Location']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Location']")).sendKeys("california");
		//driver.findElement(By.xpath("//input[@id='location']")).sendKeys(Keys.ENTER);
		//input[@value='Find Tech Jobs']
		driver.findElement(By.xpath("//button[text()='Find Tech Jobs']")).click();
		
		/*int i=2;
		while(isElementPresent("//div[@id='dice_paging_top']/ul/li/a[text()='"+i+"']"))
		{
			
			driver.findElement(By.xpath("//div[@id='dice_paging_top']/ul/li/a[text()='"+i+"']")).click();
			
			i++;
			
			
		}*/
		int i=1;
		while(isElementPresent("//a[@title='Go to next page']/span"))
		{
			
			driver.findElement(By.xpath("//a[@title='Go to next page']/span")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			
			
		}
	
	
	
	
	
	
	
	
	}
public static Boolean isElementPresent(String Xpath)
{
	int count =driver.findElements(By.xpath(Xpath)).size();
	if(count==0){
		return  false;
	}else{
		return true;
	}




}





}
