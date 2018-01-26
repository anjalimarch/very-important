package Com.Test.JavaCollections;

import java.util.Comparator;

public class TestTresetComparator implements Comparator {

	
/*@Override
 * 	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i1>i2)
			return -1;

		else	if(i1<i2)
			return +1;
		   else 
		      return 0;
		
		
		
		
	}*/
	
	

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		//return -i1.compareTo(i2);
		
		//return i2.compareTo(i1);
	//	return +1;//insertin order
		//return -1;//reverse insertion order 
		return 0;//only first element will be inserted 
		
		
	}
//Customized sorting oerder
	//comparator java.util package
	//compare() and equals()
	
	///public int compare(Object obj1,Object obj2)
	//obj1-obj2=-ve
	//obj2-obj1=+ve
	//obj2==bj1=0
	//public boolean equals()
	
	


}
