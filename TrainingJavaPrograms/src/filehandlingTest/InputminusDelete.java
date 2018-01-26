package filehandlingTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class InputminusDelete {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("outputone.txt");
		
		BufferedReader bf = new BufferedReader(new FileReader("input.txt"));
		String line=bf.readLine();
		while(line!=null){
			
			boolean available=false;
			
			BufferedReader bf2= new BufferedReader(new FileReader("delete.txt"));
			String target=bf2.readLine();
			while(target!=null){
			if(target.equals(line)){
				available=true;
				break;
			}
			
			target=bf2.readLine();
			
			}
			if(available==false){
				
				pw.println(line);
				pw.flush();
				
			}
			
			line=bf.readLine();
		
	}}
}
