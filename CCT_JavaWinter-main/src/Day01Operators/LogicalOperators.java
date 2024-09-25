package Day01Operators;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int a = 2; 
    int b = 3;
    int c = 4;
     int d = 5; 
     
     
     boolean result1 = (a==b) && (a<b) && (c>=d);    //And operators------at least 1 condition false,result false
     
    		 System.out.println(result1);
	
    		 boolean result2 = (a<=b) || (a>b);     //OR operators-----at least one condition true,result true
    		 System.out.println(result2);
	
	boolean result3 = !(a>b) ;    // not operator------ opposite result
	
	
	System.out.println(result3); 
	
	
	
	
	
	
	
	
	}

}
