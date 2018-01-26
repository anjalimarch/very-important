package filehandlingTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("nanhu.txt");
			
			try {
				int i=fr.read();
				while(i!=-1){
					
					System.out.println((char)i);
					
					 i=fr.read();
					
				}
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
