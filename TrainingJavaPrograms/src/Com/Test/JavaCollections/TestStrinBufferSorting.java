package Com.Test.JavaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestStrinBufferSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t=new TreeSet(new TestMYComparatorOne());
t.add(new StringBuffer("B"));
t.add(new StringBuffer("T"));
t.add(new StringBuffer("C"));
t.add(new StringBuffer("Z"));
t.add(new StringBuffer("A"));
System.out.println(t);
	}

}
