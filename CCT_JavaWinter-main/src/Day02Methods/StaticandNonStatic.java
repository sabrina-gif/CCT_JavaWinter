package Day02Methods;

public class StaticandNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 myMethod1(2,1);
 
 StaticandNonStatic StaticandNonStaticobj = new StaticandNonStatic();   //creation object//class is the blueprint of the object
 
 StaticandNonStaticobj.myMethod2(2, 2);                 ///object is the result of class
 
 int result = StaticandNonStaticobj.myMethod3(4, 4);
 
 System.out.println(result);
 
 
 
	}
		
		public static void myMethod1(int a, int b)  {     //static  method //static
			
			int c = a+b;                            //class is a object
			System.out.println(c);
			
			
		}
		
		public void myMethod2(int a, int b)  {     //non static
			
			int c = a+b;
			System.out.println(c);
			
			}	
		
		public int myMethod3(int a, int b) {//non static return type
			
			int c = a + b;
					
			return c; 
		
					
		}
		

}	


