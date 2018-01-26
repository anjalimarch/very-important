import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.eclipse.jetty.server.Request;
//import org.eclipse.jetty.server.Request;
//import org.eclipse.jetty.http.HttpTester.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_four {
public static WebDriver d=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//handling rediff two's if less than 14 elements say 9 then it ll 
		//throw an excepton that element is not found
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 d =new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
		
		// we can find multiple link elements by combination of  xpath 
		
		String part1="//*[@id='popular_cat']/h3[";	
		String part2   ="]/a";
		
		
				
		//for(int i=1;i<=14;i++)
		int i=1;
		while(isElementPresent(part1+i+part2))
		{
			System.out.println("*************************");
			String text =d.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(text);
			d.findElement(By.xpath(part1+i+part2)).click();
			System.out.println("this is the title"+d.getTitle());	
			d.navigate().back();
			
		i++;
		
		}
	}	
		
	public static boolean isElementPresent(String xpath_expression){
	
		
		List <WebElement> links=d.findElements(By.xpath(xpath_expression));
		
		if(links.size()==0)
			return false;
		else
			return true;
		
	}
		
	public static boolean getResponseCode(String url)
	{
		int resp_code=0;
		
	try{
		resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		System.out.println("URL"+url+resp_code);
	}catch(Exception e){
		e.printStackTrace();
		
	}if(resp_code==200)
		return true;
	else 
		return false;
		
		
	}
	
	
	
}	
		
		
		
		
	


