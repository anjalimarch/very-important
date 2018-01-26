package Com.Test.JavaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetDecending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t=new TreeSet(new TestTresetComparator());

t.add(10);
t.add(0);
t.add(15);
t.add(20);
t.add(20);

System.out.println(t);




	}

}
