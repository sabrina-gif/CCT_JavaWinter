package HomeWork1;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

boolean result = myMethod1();
System.out.println(result);
	
boolean result2  = myMethod2(3,12);
	System.out.println(result2);
	
	
	}
public static boolean myMethod1()  {
	 int a = 3;
	 int b = 12;
	 boolean c = a < b;
	 return c;
	 
}
public static boolean myMethod2 (int a,int b)   {
	boolean c = a>b;
	return c;
}


	}
