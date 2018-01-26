package Com.Test.JavaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet1 {
	public static void main(String args[]){
	
	/*TreeSet t=new TreeSet();    //default natural sorting order
	TreeSet t1= new TreeSet(Comparator c);//Customized Sorting
	
	TreeSet t2= new TreeSet(Collection c1);//
	
         TreeSet t3= new TreeSet(SortedSet)*/
	
	TreeSet t=new TreeSet(); 
	t.add("A");
	t.add("B");
	t.add("a");
	t.add("L");
	t.add("Z");
	t.add(null);// java.lang.NullPointerException becaz comparision is required
	System.out.println(t);
	//DNSO [A, B, L, Z, a]
	
}
}