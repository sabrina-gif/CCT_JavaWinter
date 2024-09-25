package HomeWork1;


public class NonStaticvoidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	NonStaticvoidMethod NonstaticvoidMethodobj = new NonStaticvoidMethod();
	
	NonstaticvoidMethodobj.myMethod1();
	
	NonstaticvoidMethodobj.myMethod2(6, 12); 
	}
	
public void myMethod1 ()  {

int a = 6;
int b = 12;
int c = b / a;

System.out.println(c);

}

public void myMethod2 (int a , int b)   {
	
	int c = a*b;
	System.out.println(c);
}
	
}




