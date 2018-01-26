package Com.Test.JavaCollections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetDecendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet t=new TreeSet(new TestTresetComparatorString());

t.add("Mummy");
t.add("Papa");
t.add("Anjali");
t.add("Amita");
t.add("Pochu");

t.add("Pochu");


System.out.println(t);




	}

}
