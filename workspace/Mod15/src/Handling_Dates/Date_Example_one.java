package Handling_Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Date_Example_one {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//string to date object
		String date="08/01/2014";
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date d =df.parse(date);
		//date object to String
	
		String finalydateis	=new SimpleDateFormat("dd").format(d);
		System.out.println(finalydateis);
		
		
	String month=new SimpleDateFormat("MMMM").format(d);
	String year=new SimpleDateFormat("yyyy").format(d);
	
	System.out.println(month);
	System.out.println(year);
	//for Date to be printed currently once we will have to set the 
	//current time by intializing date class once initialized work for all classes
	Date currentdate=new Date();
	//System.out.println(currentdate);
	
	//String day=new SimpleDateFormat("dd").format(d);
	//System.out.println(day);
	
	
	
	
	

	
	
		//Date 	parse(String text, ParsePosition pos)
		//Parses text from a string to produce a Date
		//Date is itself a class and returns an object of date class  
		/* dateformat.parse() and dateformat.format().

		dateformat.format() formats a java date object to a user readable string representation.

		If you have the string representation, you can use dateformat.parse() to get the Date object.
		*/
		//formatting (date -> text), parsing (text -> date), 
		
		
	}

}
