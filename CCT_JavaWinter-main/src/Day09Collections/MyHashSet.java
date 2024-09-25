package Day09Collections;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//does not maintain sequences/order
		//doesn't allow duplicate values
		//no get method
		String st1 = "Queens";
		String st2="Manhattan";
		String st3="Brooklyn";
		String st4 = "Bronx";
		String st5 = "Staten Island";
          
	HashSet <String> set = new HashSet <String>();
	
	set.add(st5);
	set.add(st3);
	set.add(st2);
	set.add(st1);
	set.add(st4);
	
	int len = set.size();
	
	System.out.println(len);
	
	
	
	}

}
