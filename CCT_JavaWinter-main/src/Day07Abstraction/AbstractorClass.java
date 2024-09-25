package Day07Abstraction;

public abstract class AbstractorClass {//we have to mention abstract before  class name
//abstraction is a concept that helps to hide method's implementation
//class is blueprint of the object and object is the result of class 
//before the class we have abstraction	//abstraction has two abstract class and interface class
	
	abstract public void imyMethod1 (int x, int y);//in abstract ,we have no body rather than that we have to type semicolon
	                                              // abstract method or unimplemented method
	                                              //gonna give access of this class
	abstract public void imyMethod2 (int x, int y);//abstract method or unimplemented method
	                  //in abstract can start with i
	 public void myMethod3 (int x, int y) { //implemented method
	  int Z = x+y;
	 
	//abstract class can have both implemented method and unimplemented method 
	 //abstract class can't be 100 percent abstraction 

	}
	 
	 public AbstractorClass() { //we can make constructor in abstractor class
		 //abstract can also extends another abstract class and regular class both
	 
	 }
}

