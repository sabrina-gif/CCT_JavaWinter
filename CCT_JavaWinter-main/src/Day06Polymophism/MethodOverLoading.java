package Day06Polymophism;

public class MethodOverLoading {           //poly morphism many forms of method

     //in the same class
	//method's name will be same
	//arguments are different
	//1. quantity of arguments
	//2. change data types of the arguments
// 3.changing the sequence/order of arguments doesn't really matter
//1.can we overload the method-yes
//2.can we overload a constructor-yes
//3.can we override the main method(public static void)-no
	//4.can we inherit a constructor-no//we can invoke
	//5.can we override the constructor-no
//6.can we override an overloaded method-yes
	//7.can we overload an overridden method-yes
	//we can overload the constructor
	//overloading is considered as compile time polymorphism
public void myMethod(int args) {
}


public void myMethod(double a) {
	
}
public void myMethod(String x) {

}
public void myMethod (int a, int b) {
}
public void myMethod (int a,String b) {
}





}














