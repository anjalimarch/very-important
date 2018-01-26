package Elementfield;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Set<String> s=new HashSet<String>();
	//set is an interface
	//hashset is implemnting that interface
	//set is dynamic datastructutre
	//set does not return data in sequential form 
	s.add("chair");
	s.add("table");
	s.add("computer");
	s.add("bed");
	s.add("chair");//no dupliction is allowed in set
	System.out.println(s.size()+"-->returns the size of set ");
	
	Iterator<String> it=s.iterator();
	System.out.println(it.next());
	System.out.println(it.next());
	//System.out.println(it.next());
	//System.out.println(it.next());
	while(it.hasNext())
	{
	System.out.println(it.next());	
	}
	
	
	}

}
