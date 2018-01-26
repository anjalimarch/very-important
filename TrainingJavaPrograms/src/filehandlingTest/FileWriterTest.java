package filehandlingTest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter fileWriter=new FileWriter("nanhu.txt",true);
	//fileWriter.write(100);
	fileWriter.write("Anjali Mishra\n Pochu");
	char[] ch={'a','b','c'};
	fileWriter.write(ch);
	fileWriter.write("\n");
	fileWriter.flush();
	fileWriter.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
	}

}
