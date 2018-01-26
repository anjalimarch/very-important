package Com.Test.JavaCollections;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack  s=new Stack();
s.push("a");
s.push("B");
s.push("C");
System.out.println(s);
System.out.println(s.search("A"));
System.out.println(s.search("a"));
	}

}
