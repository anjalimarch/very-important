package Com.Test.JavaCollections;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
System.out.println(v.capacity());
for(int i=0;i<=10;i++){
	v.addElement(i);
	System.out.println(v);
	System.out.println("vector capacitytillten=="+(i+1)+"th"+v.capacity());
	
}
	            System.out.println("vector capacityu"+v.capacity());
	System.out.println(v);
	
}
	}


