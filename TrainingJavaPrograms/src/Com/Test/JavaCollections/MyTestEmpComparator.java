package Com.Test.JavaCollections;

import java.util.Comparator;

public class MyTestEmpComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		Employee emp1=(Employee)obj1;
		Employee emp2=(Employee)obj2;
		
		
		String empName1=emp1.name;
		String empName2=emp2.name;
		return	empName1.compareTo(empName2);
	}

}
