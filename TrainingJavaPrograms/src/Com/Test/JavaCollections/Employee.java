package Com.Test.JavaCollections;

public class Employee implements Comparable {

	String name;
	int empID;

	 Employee(String name, int empID) {

		this.name = name;
		this.empID = empID;

	}

	public String toString() {

		return name + "-----" + empID;

	}

	public int compareTo(Object obj) {

		int eId1 = this.empID;
		Employee e = (Employee) obj;
		int eId2 = e.empID;
		if (eId1 < eId2)

			return -1;

		else if (eId1 > eId2)

			return +1;

		else
			return 0;

	}
}
