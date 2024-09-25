package Day09Collections;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// array list maintains the sequence
		//allows duplicate values
		//array and array list difference
//collections work with object		
String st1 = "Queens";
String st2="Manhattan";
String st3="Brooklyn";
String st4 = "Bronx";
String st5 = "Staten Island";
String st6 = "Bronox";
//array comes from list interface and list interface comes from collections
	ArrayList <String> List = new ArrayList <String> ();//for array list we have to create object first under array list not class
	//in array list object we have to mention data type like string,integer etc
	
	
	List.add(st1);//this one is add method through this we can check is all the values add in list
	List.add(st2);
	List.add(st4);
	List.add(st3);
	List.add(st5);
	List.add(st6);
	System.out.println(List);
	
	List.remove(st5);
	int len = List.size();//size method find out how many variables added in list
	
	System.out.println(len);
	
	String val = List.get(2);
	System.out.println(val);
	
	
	
	for (String s : List) {  //for each loop //there is no condition
		System.out.println(s);
	}
	
	int num1 = 5;
	int n2 =2;
	int n3= 8;
	
	ArrayList <Integer> numList = new ArrayList<Integer> ();
	
	//wrapper class
	//*used for autoboxing and unboxing
	//*used for data conversion
	//*used for exception handling
	
	
	
	
	
	
	
	
	
	}

}
