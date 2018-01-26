package lesson1;

public class Student {
	private int age;
	private String name= "this is mahesh ";
	public static int nofstudents=0;
	Student()
	{ 
		nofstudents++;
	}
	Student(int x,String y,int z)
	{    
		nofstudents++;
	}
	public static int getnofstudenta()
	{
		return(nofstudents);
	}
	//public 
	String getName() {
		return name;
	}
	//public 
	 void setName(String name) {
		this.name = name;
	}
	//public
	 int getAge() {
		return age;
	}
	//public
	 void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int	st_id;

String	st_name;
public String getSt_name() {
	return st_name;
}
public void setSt_name(String st_name) {
	this.st_name = st_name;
}
int	st_age;

public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}


public int getSt_age() {
	return st_age;
}
public void setSt_age(int st_age) {
	this.st_age = st_age;
}*/

}
