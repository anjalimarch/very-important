import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {

	public static void main(String[] args)throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException  {
		// TODO Auto-generated method stub

	
		//sampleTest("xxxXX");
		String x="sampleTest";
		//String meth=read name from xls file
		Method method= ReflectionApi.class.getMethod(x, String.class);
		method.invoke(method, "hello");
		
		
        System.out.println("end");
	}
	
	public static void sampleTest(String x){
		System.out.println("in sample test-- "+x);
	
	
	
	
	
	}

}
