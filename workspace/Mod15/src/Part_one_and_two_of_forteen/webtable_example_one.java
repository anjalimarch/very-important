package Part_one_and_two_of_forteen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable_example_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	
		//printing all cmpny name and company prices 
		List<WebElement> companynames=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
	List<WebElement> companyprices=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[3]"));
		
	for(int i=0;i<companynames.size();i++)	
	{
		
		
		System.out.println(companynames.get(i).getText()+"**************"+companyprices.get(i).getText());
		
		
	}
		
		
		
		
		
		
		
		
	}

}
