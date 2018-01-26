package Handling_Dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import bsh.ParseException;

public class Hnadling_Calender_Example {
	static WebDriver driver;
	public static void main(String[] args) throws ParseException, java.text.ParseException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("http://www.makemytrip.com/");
		WebElement departure=driver.findElement(By.xpath("//a[@id='start_date_sec']"));
	
	Actions act = new Actions(driver);
	act.moveToElement(departure).build().perform();
	
	departure.click();//we have selected calender
	
		selectDate("02/04/2016");
	
	}//*[@id='ui-datepicker-div']/div[3]/div/a
	//*[@id='ui-datepicker-div']/div[2]/div/a
	
	public static void selectDate(String date) throws java.text.ParseException {
	
		SimpleDateFormat df = new 	SimpleDateFormat("dd/MM/yyyy");
		//we are retieving the given date from string to test 
			Date date_to_be_selected =df.parse(date);
		
	     //this line retrieve the current date 
	     Date currentday=new Date();//this line is usefullwhile running the program first on new machine
	     //here we need this instance of date class becaz in program we are comparing with the current date 
	    //retrieving month on the calender page
	     String month_displayed=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[1]")).getText();
	   //retieving year on the calendaer page
	     String year_displayed=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[2]")).getText();
	System.out.println(month_displayed);
	System.out.println(year_displayed);
	//making one string to compare with current
	String mon_yer_web=month_displayed+""+year_displayed;
	System.out.println(mon_yer_web);
	
	//this line will return the date in string format
	String day=new 	SimpleDateFormat("d").format(date_to_be_selected );
   //this line will return month in string format
	String month= new SimpleDateFormat("MMMMMMM").format(date_to_be_selected);
   //similarly return year
	String year=new SimpleDateFormat("yyyy").format(date_to_be_selected);
   
   System.out.println(day+month+year);
 //put the given date month and year in one string to compare
   String month_year_Exracted=month+year;
System.out.println(month_year_Exracted);
	
	String monthone= new SimpleDateFormat("M").format(date_to_be_selected);
	System.out.println(monthone);
	int monthcoversiontoint=Integer.parseInt(monthone);
	monthcoversiontoint=monthcoversiontoint-1;
	String conversiontostring=String.valueOf(monthcoversiontoint);
			String dayone=day+"-"+conversiontostring+"-"+year;
	System.out.println(dayone);
	
	
	while(true){
		
		if(month_year_Exracted.equals(mon_yer_web))
		{//select the given date
	System.out.println("**************");
			//WebElement movemousehere=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
			
	System.out.println("hello");		
			
			//Actions act = new Actions(driver);
			
	//act.moveToElement(movemousehere).build().perform();
			
	System.out.println("///////////////////");
		//WebElement datemove=driver.findElement(By.xpath("//a[text()='"+day+"']"));
driver.findElement(By.xpath("//td[@fare-date='"+dayone+"']/a")).click();
	System.out.println("lllllllllllllllll");
	
	//Actions actone = new Actions(driver);
	
	//actone.moveToElement(datemove).build().perform();
			
	System.out.println("lllllppppppp");	
	//datemove.click();
			
			
			
			System.out.println("found and selected");
		break;
		
		
		}
			else{ 
				
				if(date_to_be_selected .after(currentday))
				{
				driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/a/span")).click();	
					
					
				}else
				{
				driver.findElement(By.xpath("ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/a/span")).click();
				
				}
				
				
				
			    }
//again initialize becaz in cache memory these strings will be lost			
month_displayed=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[1]")).getText();
		   //retieving year on the calendaer page
year_displayed=driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/div/div/span[2]")).getText();
mon_yer_web=month_displayed+""+year_displayed;		
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}


