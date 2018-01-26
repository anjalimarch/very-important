import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Junit2 {
	public String name;
	public int  age;
	public void Jtest(String name,int age)
	{
		this.name=name;
		this.age=age;
		 
	}
	@Test
	public void TestMethod()
	{
		
		System.out.println("Name is: "+name +" and age is: "+age);
		
		
	}
@Parameters
public static Collection<Object[]>parameter()
{
	int i,j;
	Object[][] pData=new Object[i][j];
	for(int i=0;i<2;i++)
	{for(int j=0;j<2;j++)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int age = scan.nextInt();
		System.out.println(age);
		pData[i][j]=age;
		System.out.print(pData[i][j]);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scan.nextString();
		System.out.println(name);
		pData[i][j]=name;
		System.out.print(pData[i][j]);
		return  Arrays.asList(pData);
	}
		
	}
	
}


}
