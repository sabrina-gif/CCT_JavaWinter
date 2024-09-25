package Day02Methods;

public class VoidAndReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
myMethod1(1,2);

boolean result = myMethod2(1,2);
System.out.println(result);
	}
	
	public static void myMethod1(int a, int b)  {     //void method
		
		int c = a+b;
		System.out.println(c);
		
		
		
	}
	public static boolean myMethod2 (int a, int b)  { //return type method
		boolean c = a > b;
		
		return c;
	}
	
	
}
