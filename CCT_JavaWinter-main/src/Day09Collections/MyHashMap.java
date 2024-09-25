package Day09Collections;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//key and value pair
	
HashMap <String,Integer> map = new HashMap <String,Integer> ();


            map.put("Farhana", 101);
	   map.put("Sabrina", 102);
	
	int val = map.get("Farhana");
	
	System.out.println(val);
	}

}
