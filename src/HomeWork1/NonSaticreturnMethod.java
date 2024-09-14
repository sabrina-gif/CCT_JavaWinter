package HomeWork1;

public class NonSaticreturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonSaticreturnMethod NonSaticreturnMethodobj = new NonSaticreturnMethod();
		
		
		
		NonSaticreturnMethodobj.myMethod2(6, 6);
		boolean result2= NonSaticreturnMethodobj.myMethod2(6,6);
		
		System.out.println(result2);
		}
	

	
	
public boolean myMethod2(int a , int b)  {
	
	boolean c = !(a>=b);
	return c;}  
}
