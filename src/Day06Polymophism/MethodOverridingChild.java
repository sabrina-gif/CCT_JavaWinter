package Day06Polymophism;

public class MethodOverridingChild extends MethodOverridingParent {

	public void myMethod(int x, int y) {    //we have to create same method in child inheritence
	//overriden
}


	public void myMethod2 (int x,int y) {//overiden
	}
	public void myMeyhod3 (int x, int y) {
	}

	public static void myMethod4 (int x, int y) {//why here we don't see green arrow cause this one is static which 
		//only belongs to the parent class
	}




}
