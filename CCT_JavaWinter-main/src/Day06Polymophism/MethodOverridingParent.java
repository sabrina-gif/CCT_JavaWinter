package Day06Polymophism;

public class MethodOverridingParent {

//need at least 2 class
	//method's name will be same
	//arguments will be same
	//here is our goal methods and arguments name has to be same
//this is object oriented methods we only focus on void methods not static void one
//we can't override the main method cause it has static
//we can not override the constructor	
	//overriding is considered as runtime polymorphism	
	public void myMethod (int x,int y) {
		
	}
	
	public void myMethod2 (int x,int y) {
	}
	public void myMeyhod3 (int x, int y) {
	}
	
	public static void myMethod4 (int x, int y) {//if we see static word in any method we can't over ride any static method
	}

public MethodOverridingParent() {
}
}






