package Com.Test.JavaCollections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class TestImplementationSerilizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList l1=new ArrayList();
		LinkedList l2= new LinkedList();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);

	}

}
