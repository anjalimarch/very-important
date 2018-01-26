package filehandlingTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fr=new FileWriter("nanhu.txt");
		BufferedWriter bfr=new BufferedWriter(fr);
		
		bfr.write(100);
		bfr.newLine();
		char[] ch={'a','b','v','n','m'};
		
		bfr.write("Pochu:Luv u");
		bfr.newLine();
		bfr.write("Software Solutions");
		bfr.flush();
		bfr.close();
	}

}
