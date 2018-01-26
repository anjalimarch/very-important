package readingproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {

	
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));	
		Properties prop = new Properties();
		//FileInputStream fs = new FileInputStream("C:\\Users\\welcome\\workspace\\Module7\\src\\Config\\Employee.properties"); or
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\Config\\Employee.properties");
	
	prop.load(fs);//Reads a property list (key and element pairs) from the input byte stream
	
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("age"));
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("testSiteName"));	

	}

}
