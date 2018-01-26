package filehandlingTest;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriterFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
PrintWriter pw=new PrintWriter("nanhu.txt");
pw.write(100);
pw.write(100);
pw.print(true);
pw.write('C');
pw.write(100);
pw.write("anjaliMishra");
pw.flush();
pw.close();
	}

}
