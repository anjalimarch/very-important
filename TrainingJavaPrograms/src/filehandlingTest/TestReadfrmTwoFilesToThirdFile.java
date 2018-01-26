package filehandlingTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestReadfrmTwoFilesToThirdFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("nanhu.txt");
		FileReader fr1=new FileReader("D:\\very important\\TrainingJavaPrograms\\xyz\\Puchini.txt");	
     BufferedReader bf=new BufferedReader(fr);
    
     PrintWriter pw=new PrintWriter("pochu.txt");
String line=bf.readLine();
while(line!=null){
	pw.println(line);
	System.out.println(line);
	
	line=bf.readLine();
	
}
BufferedReader bf1=new BufferedReader(fr1);
String line1=bf1.readLine();
while(line1!=null){
	pw.println(line1);
	System.out.println(line1);
	
	line1=bf1.readLine();
	
}
	
	pw.close();
	pw.flush();
	bf.close();
	}
	
	

}
