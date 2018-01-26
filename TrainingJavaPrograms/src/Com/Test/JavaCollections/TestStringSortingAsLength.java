package Com.Test.JavaCollections;

import java.util.TreeSet;

public class TestStringSortingAsLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet  T=new TreeSet(new TestNewCoparatorLengthString());
		T.add("A");
		T.add("YYYY");
		T.add("Z");
		T.add("ABC");
		T.add("A");
		T.add("XX");
		T.add(new StringBuffer("PP"));
		T.add(new StringBuffer("QWZ"));
		System.out.println(T);
	}

}
