package filehandlingTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBbufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("nanhu.txt");
BufferedReader bf=new BufferedReader(fr);
String line=bf.readLine();
while(line!=null){
	
	System.out.println(line);
	
	line=bf.readLine();
	
}
		
bf.close();
		
		
	}

}
