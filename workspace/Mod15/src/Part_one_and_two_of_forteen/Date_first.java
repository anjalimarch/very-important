package Part_one_and_two_of_forteen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_first {

	public static void main(String[] args) throws ParseException {
		String date="15/03/2015";
				SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
				Date d=df.parse(date); 
				Date currentdate=new Date();
				System.out.println(currentdate);
				System.out.println(d);
				String day=new SimpleDateFormat("dd").format(d);
				String month=new SimpleDateFormat("MMM").format(d);
				String year=new SimpleDateFormat("yyyy").format(d);	// TODO Auto-generated method stub
				System.out.println(day);
	System.out.println(month);
	
	System.out.println(year);/*

o/p-->
Fri Jan 29 01:20:01 IST 2016
Sun Mar 15 00:00:00 IST 2015
15
Mar
2015
*/
	
	}

}
