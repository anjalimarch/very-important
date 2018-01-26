package lesson1;


import java.util.Scanner;
import lesson2.SpecialForModifiers;



public class MyFirstClass {
/*
 * this is my first project
 */
	public static void main(String[] args)
	{ 
		SpecialForModifiers spl=new SpecialForModifiers();
		//spl.setAmita(78);
		System.out.println(spl.getAmita());
		
		
	
	
	//access modifiers
		/*
		 * 
		 * 
		 * 
		 */
		 /* Student mark =new Student();
		 /* System.out.println(mark.name);(private variables cant be accessed directly)
		this stament will give error
		*/
		 
		//  mark.setName("mark the hero");
		  //mark.setAge(12);
       //  System.out.println(mark.getAge()); 
	
		  
		 // System.out.println(mark.getName());
		 
		  
	
		  //private variables can be accessed by getter and setters but not directly 
		
		
		
	
		
		
		
		
		
		
		
		
		/*all about static for interview
		 * case 1:
		 * static variable ko nonstatic field  k thru call kara sakte without class name
		 public static int nofstudents=0;
		 public  int getnofstudenta()
	{
		return(nofstudents);
	}
		 
		 case2:
		 static variable ko static field k thru call kara sakte with class name
		 public static int nofstudents=0;
		 public static int getnofstudenta()
	{
		return(nofstudents);
	}
		 case3: ns variable ko static field k thru call nai kara sakte with or without classname kaise bhi
		
		  int nofstudents=0;
		 public static int getnofstudenta()
	{
		return(nofstudents);
	}
		 */
		/*
		 *  Student one = new Student();
		 */
		/*
		 *  System.out.println(one.getnofstudenta());
		 */
		/*
		 *  Student two = new Student();
		 */
		/* 
		 *  System.out.println(two .getnofstudenta());
		 */
		 /*
		  * Hello hel =new Hello(); 
		 * 
		 */

		/* System.out.println(hel.age);
		hel.dosomethingbig();
		System.out.println(Hello.age1);
		Hello.dosomething();
		// System.out.println(add(1,36));
		//method overloading
		 //System.out.println(add(3.14,2.666));
		 //System.out.println(add(3.8,2.6));
		 
		
		
		//System.out.println(a+b);
		//static
		
		
		
		
		
		
		
		
	//	int[] myArray={100,26,27,46,53} ;
		//System.out.println(myArray[1]);
		/*for(int i=0;i<5;i++)
		{
			System.out.println(myArray[i]);
		}*/
		/*for(int element : myArray)
		{
			System.out.println(element);
		}*/
		
		
		/*
		 * Student stu1=new Student();
		 
		Student stu2=new Student();
		Student stu3=new Student();
		stu1.setSt_id(23)   ;
		stu2.setSt_id(34);
		stu3.setSt_id(56);
		int rid1=stu1.getSt_id();
		int rid2 =stu2.getSt_id();
	     int rid3=stu3.getSt_id();
	System.out.println( rid2 );

	stu1.setSt_name("mark");
	 stu1.setSt_age(72);
	String name1=stu1.getSt_name();
	int age1=stu1.getSt_age();
	stu2.setSt_name("bob");
	stu2.setSt_age(73);
	String name2= stu2.getSt_name();
			int age2=stu2.getSt_age();
	stu3.setSt_name("michalle");
	stu3.setSt_age(74);
	String name3=stu3.getSt_name();
	int age3=stu3.getSt_age();

	System.out.println(age1 );
	System.out.println(name1);
	System.out.println(age2 );
	System.out.println(name2);
	System.out.println(age3 );
	System.out.println(name3);
		/*int result = multiply(4,5);
	System.out.println("hello"+ result);
	
	
		
		//String result=myCode ("tom");
		//System.out.println("hello"+ result);
		//myCode ("hank");
		//myCode ("is");
		
		//myFirstmethod();
		
		// TODO Auto-generated method stub
//this /*
		//is my first class
		//byte x=10;
		//short y=20;
		//int z=30;
		/*long w=40;
		float my_variable=(float)4.5;
		double my_double=11.28;
		char my_char='A';
		boolean is_bolean=true;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		System.out.println(my_variable);
		System.out.println(my_double);
		System.out.println(my_char);
		System.out.println(is_bolean);
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int user_input_number = scan.nextInt();
		System.out.println("print the entered value");
		System.out.print(user_input_number);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the decimal value");
		double user_input_double= scan1.nextDouble();
		System.out.println("print the entered value");
		System.out.print(user_input_double);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("enter the decimal");
		float user_input_decimal = scan2.nextFloat();
		System.out.println("print the entered value");
		System.out.print(user_input_decimal);
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("enter the string");
		String user_input_string = scan3.nextLine();
		System.out.println("print the entered value");
		System.out.print(user_input_string);
			
		
		System.out.println("hello mishra");
		*/
		
		/*int b=0;
		while(b<=-1)
		{
			System.out.println(b);
			b++;
			}
		System.out.println("---------------");
	int a=0;
	do
	{
		System.out.println(a);
		a++;
		
	}while(a <= -1);
	*/
	//int[]My_Int_Array={20,30,40,50,60}	;
	//System.out.println(My_Int_Array[1]);
	/*int index =0;
	while(index<5)
	{
		System.out.println(My_Int_Array[index]);
		index++;
	}*/
		/*String My_String_Variablr="HELLo" + "world" ;	
		System.out.println(My_String_Variablr);	
	int My_String_lenth=My_String_Variablr.length();
	System.out.println(My_String_Variablr.length());
	String myStringinlowerCase=My_String_Variablr.toLowerCase();
	System.out.println(myStringinlowerCase);
	String myStringReplace=My_String_Variablr.replace('o', 'm');
	System.out.println(myStringReplace);
	*/
		/* Cube c1=new Cube();
	System.out.println(c1.volume())	;
	Cube c2=new Cube(5,4,11);
	System.out.println(c2.volume())	;
		*/
		
	
	
	
	}//main close
	
	
	/*//method overloading
	 * public static int add(int a, int b )
	 
	{
		return(a+b);
	}
	// System.out.println(a+b);
	
	public static double add(double a ,double b ) 
	{
		return(a+b);
	}
	//System.out.println(a+b);
	public static float add(float a,float b )
	{
		return(a+b);
	}*/
	
	/*public static void myFirstmethod()
	{
	System.out.println("hello i am the first method of your main class");	
	}

public static String myCode (String name)
        { //System.out.println(name);
	         return(name);
	         }
*/
	/*public static int multiply(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
		return (c);
	}
*/









}//class close

