package Day02Methods;

public class Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethodWithoutPerameter(); 
		
		myMethodWithParameter(5,6);

	}
	
	public static void     myMethodWithoutPerameter()            {
		
	int a = 5;
	int b= 6;
	int c = a+b;
	System.out.println(c);
		
		
		
	}
	public static void myMethodWithParameter(int a ,int b)  {
		
		int c = a+b;
		System.out.println(c);
		
	}
	
	

}
