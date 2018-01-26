package Com.Test.JavaCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("Venky");
	l.add("Chiru");
	l.add("venky2");
	l.add("test");
	
	System.out.println(l);
	ListIterator it=l.listIterator();
	while(it.hasNext()){
		String s=(String)it.next();
		if(s.equals("Venky"))
		
		{
			
			it.remove();
		}else if(s.equals("Venky2")){
			it.add("Chaitu");
			
			
		}
		else if(s.equals("Chiru")){
			it.set("Charan");
			
			
		}
		
		
	}
	System.out.println(l);
	}
	
}
