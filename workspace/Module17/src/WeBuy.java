import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WeBuy 
{



public static void main(String args[])
{
	List<String> Productnamestobeadded=new ArrayList<String>();
	List<String> Productquqntity=new ArrayList<String>();
	Xls_Reader read=new Xls_Reader("D:\\Productinfowebuy.xlsx");
	int x=read.getRowCount("Product");
	for(int i=2;i<=x;i++)
	{
	String productname=read.getCellData("Product", "Product", i);
		
	System.out.println("----name-------"+productname);
	Productnamestobeadded.add(productname);
		String Quantitynum=read.getCellData("Product", "Quantity", i);	
		System.out.println("----quqntity----"+Quantitynum);
		
		Productquqntity.add(Quantitynum);
	
	}

	
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://uk.webuy.com/search/index.php?stext=*&section=&catid=956");

try {
	Thread.sleep(10000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
List<WebElement> allproductnames=driver.findElements(By.xpath("//div[@class='searchRecord']/div[2]/h1/a"));


for(int j=0;j<allproductnames.size();j++)
{
	
	System.out.println(allproductnames.get(j).getText());
	System.out.println(allproductnames.size());
/*if(Productnamestobeadded.contains(allproductnames.get(j).getText()))
{
	System.out.println("found"+allproductnames.get(j).getText());


allproductnames=driver.findElements(By.xpath("//div [@class='searchRecord']/div[2]/h1/a"));
}*/
}
	
//WebDriverWait wait=new WebDriverWait(driver,40);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[class='deliver-component-wrapper']")));


	
	
	
	
	
	
}	
	
	


}



