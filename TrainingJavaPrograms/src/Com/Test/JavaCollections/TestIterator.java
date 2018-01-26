package Com.Test.JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;



public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer I;
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++){
			
			al.add(i);
			
			
			
		}
		System.out.println(al);
		
	Iterator it=al.iterator();
	
	while( it.hasNext()){
		
		 I=(Integer)it.next();
		System.out.println(I);
		if(I%2==0){
			
			it.remove();
			
		}
		
	}
		
	System.out.println(al);

	}

}
