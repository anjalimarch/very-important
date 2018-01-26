package Com.Test.JavaCollections;

import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String args[]){
		TreeSet t=new TreeSet(); 
		t.add(new StringBuffer("A"));//Objects should be homogeneous and comparable
		//String Buffer objects are not comparable
		//as String BUffer does not implement comparable
		t.add(new StringBuffer("Z"));
		t.add(new  StringBuffer("L"));
		t.add( new  StringBuffer("B"));
		System.out.println(t);
		
		//Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
		//at java.util.TreeMap.compare(Unknown Source)
		
		
		
		
		
		
		
		
	}
}
