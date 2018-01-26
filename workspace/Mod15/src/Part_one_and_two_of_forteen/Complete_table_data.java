package Part_one_and_two_of_forteen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Complete_table_data {
public static void main(String args[]){
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.navigate().to("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

	List<WebElement> companynames=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr/td[1]"));
	List<WebElement> col=driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr[1]/td"));
	
	int columns=col.size();
	String part1="//*[@class='dataTable']/tbody/tr[";
			 String part2="]/td";
					 
	int rows=companynames.size();
	System.out.println(columns+"cr"+rows);
	for(int i=1;i<=rows;i++)
	{
		List<WebElement>rowcells =driver.findElements(By.xpath("//*[@class='dataTable']/tbody/tr["+i+"]/td"));
	//System.out.println(rowdata.get(i).getText());
		for(int j=0;j<rowcells.size();j++)
		
		{
		String celldata =rowcells.get(j).getText() ;
		System.out.print(celldata =rowcells.get(j).getText() );
		System.out.print("------------------");
		}
		
	}
	
}}
