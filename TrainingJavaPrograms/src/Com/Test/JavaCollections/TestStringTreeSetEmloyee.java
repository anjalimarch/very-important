package Com.Test.JavaCollections;

import java.util.TreeSet;

public class TestStringTreeSetEmloyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Anjali",60);
		Employee e2=new Employee("Test",40);
		Employee e3=new Employee("Mishra",30);
		Employee e4=new Employee("Suhaan",20);
		Employee e5=new Employee("Rudransh",0);
		Employee e6=new Employee("Tripathi",5);
		
		
		TreeSet t= new TreeSet(new MyTestEmpComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		
		System.out.println(t);
	}

}
