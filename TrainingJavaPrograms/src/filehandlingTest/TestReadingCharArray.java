package filehandlingTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReadingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		
		File f=new File("nanhu.txt");
		char [] ch=new char[ (int) f.length()];
		try {
			 fr=new FileReader("nanhu.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			 fr.read(ch);
			 
			 
			for(char ch1:ch){
				
				System.out.println(ch1);
			}
		
				
				System.out.println();
				
				
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
