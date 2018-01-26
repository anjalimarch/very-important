import java.util.ArrayList;
import java.util.Hashtable;

public class CollectionApi {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int x[] = new int[5];
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
	int p=list.size();
	for(int i=0;i<p;i++)
	{
		System.out.println(list.get(i));
	}	
		
	Hashtable<String,String> table1=new Hashtable<String,String>();
	table1.put("name", "Pochu");
	table1.put("Place", "Hyderabad");	
	//table.put("Mumma", "Manna");
	//table.put("Mumma", "Manna2");
	//System.out.println(table.get("Mumma"));
	//System.out.println(table.get("Place"));
	//System.out.println(table.get("name"));
	
	Hashtable<String,String> table2=new Hashtable<String,String>();
	table2.put("name", "Tripathi");
	table2.put("Place", "kondapur");	
	//table.put("Mumma", "Manna");
	//table.put("Mumma", "Manna2");
	//System.out.println(table.get("Mumma"));
	//System.out.println(table.get("Place"));
	//System.out.println(table.get("name"));
	Hashtable<String,Hashtable<String,String>> tab=new Hashtable<String,Hashtable<String,String>>();
	tab.put("Person1", table1);
	tab.put("Person", table2);	
	//table.put("Mumma", "Manna");
	//table.put("Mumma", "Manna2");
	
	System.out.println(tab.get("Person1").get("Person"));
	
	}
	}


