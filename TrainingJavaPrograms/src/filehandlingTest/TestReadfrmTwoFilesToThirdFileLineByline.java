package filehandlingTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestReadfrmTwoFilesToThirdFileLineByline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("D:\\very important\\TrainingJavaPrograms\\test.txt");
		File f=new File("D:\\very important\\TrainingJavaPrograms\\xyz");
		if((f.isDirectory())){
		String []s=f.list();
		for(String s1:s){
			File f1=new File(f,s1);
			if(f1.isFile()){
		
		FileReader fr = new FileReader(f1);
		BufferedReader bf = new BufferedReader(fr);
		
		String line = bf.readLine();
		
		while (line != null) {
		
			pw.println(line);
			line = bf.readLine();
		}
		
	/*	while (line1 != null) {
			
			System.out.println(line1);
			
		}*/
		
		pw.flush();
		
	}}
}
}}