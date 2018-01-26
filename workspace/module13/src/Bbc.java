public class Bbc{
	
	public static void main(String args[]){
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
}
	}