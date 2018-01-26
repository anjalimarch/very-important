import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		
		// we can find multiple link elements by combination of  xpath 
		
		String part1="//*[@id='popular_cat']/h3[";	
		String part2   ="]/a";
		
		
				
		for(int i=1;i<=14;i++)
		{
			System.out.println("*************************");
			String text =d.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			
			//get response code
			String url=d.findElement(By.xpath(part1+i+part2)).getAttribute("href");
			getResponseCode(url);
			
			
			d.findElement(By.xpath(part1+i+part2)).click();
			System.out.println("this is the title"+d.getTitle());	
	
			d.navigate().back();
			
		
		
		}
		
		
		}
	 public static boolean getResponseCode(String url)
	{//get response code from certain url
		int resp_code=0;
		
	try{
		resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		//import from import org.apache.http.client.fluent.Request
		//illegal charactr  exception,pipe character shud not b used in 
		//url
		//problem in website sequal injection character has been used
		System.out.println("URL"+url+resp_code);
	}catch(Exception e){
		e.printStackTrace();
		
	}if(resp_code==200)
		return true;
	else 
		return false;




}
	}
