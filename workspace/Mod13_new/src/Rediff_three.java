import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Rediff_three {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.navigate().to("http://shopping.rediff.com/?sc_cid=inhome_icon");
			
			// we can find multiple link elements by Single  xpath 
			
			List<WebElement> links=d.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
			
			
					
			for(int i=0;i<links.size();i++)
			{
				System.out.println("*************************");
				
				links=d.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
				String Text=links.get(i).getText();
				System.out.println(Text);
				links.get(i).click();
				System.out.println(d.getTitle()+"this the title" );
				System.out.println("this is the title"+d.getTitle());	
				d.navigate().back();
				
			
			
			}
			
			
			
			
			

		}

	}


