package Day03Methods;

public class ConstructorIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorIntro obj = new ConstructorIntro(5);

int result = obj.x;

System.out.println(result);
	
	}

	
	
	int x; //global variable 
	                                      //special type of method
	 ConstructorIntro(int m)   {        //creating constructor class name and method name has to be same
		                                 //no static or void keyword
		x=  m;                         //we need constructor for initializing global variable

}
	
	
 	//default constructor already create while creating the object of class
	
}                               //default constructor has no parameters
	

