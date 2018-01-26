import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbc_news {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/");
		 driver.findElement(By.linkText("News")).click();
		String url= driver.findElement(By.linkText("News")).getAttribute("href");
		boolean res=getResponseCode(url);
		System.out.println(res);
		 driver.findElement(By.partialLinkText("NY travel ban")).click();
	
	
	
	}


	public static boolean getResponseCode(String url)
	{//get response code from certain url
		int resp_code=0;
		
	try{
		resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
		//import from import org.apache.http.client.fluent.Request
		//illegal charactr character exception
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
