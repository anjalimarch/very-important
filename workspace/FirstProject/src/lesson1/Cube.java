package lesson1;

public class Cube {
	
	
	int length;
	int breadth;
	int hieght;
	
	public int volume()
	{
		return(length*breadth*hieght);
	}
Cube()
{
	length=10;
	breadth=20;
	hieght=30;
	}
Cube(int l,int b,int h)
{ 
	length=l;
	breadth=b;
	hieght=h;
}
}
