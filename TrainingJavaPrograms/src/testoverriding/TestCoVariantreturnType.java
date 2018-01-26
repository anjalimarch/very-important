package testoverriding;

public class TestCoVariantreturnType {

	TestCoVariantreturnType get(){return this;}  
	void message(){System.out.println("welcome to covariant return type");}  
	  
	public static void main(String args[]){  
	new TestCoVariantreturnType().get().message();  
	}  

}
