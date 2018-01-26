package filehandlingTest;

import java.io.File;

public class TestDisplayOnlyFileName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fdir2=new File("D:\\very important\\TrainingJavaPrograms");
		String [] s=fdir2.list();

		for(String s1:s){
			if (s1.equals("xyz")){
			     File fdir3=new File(s1);
		              if(	fdir3.exists()){
			
			             String [] s2=		fdir3.list();
			               for(String s3:s2){
				                           File f=new File(s1,s3);
		                                   	if(	f.isDirectory()){
				                                       System.out.println(s3);
			}
			}
			
		}
			
			
		}
	
	}

}}
