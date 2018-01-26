package filehandlingTest;

import java.io.File;
import java.io.IOException;

public class testfile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File f=new File("pochu.txt");
try {
	f.createNewFile();
	
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
File fdir=new File("Durga123anjaliPractice");

fdir.mkdir();


File fnewfile=new File(fdir,"pochu1.txt");
try {
	fnewfile.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
File fdir2=new File("D:\\very important\\TrainingJavaPrograms");

fdir2.mkdir();

	
	
File fdir9=new File("D:\\very important\\TrainingJavaPrograms\\xyz","Puchini.txt");
try {
boolean result=	fdir9.createNewFile();
boolean result1=	fdir9.exists();
boolean result12=	fdir9.isFile();
boolean isdirectory=	fdir2.isDirectory();

String [] s=fdir2.list();

for(String s1:s){
	
	
	System.out.println(s1);
	
}
/*System.out.println(result);
System.out.println(isdirectory);*/


} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println(fdir9.length());

System.out.println(fdir.delete());


	}
	
	
	

}
