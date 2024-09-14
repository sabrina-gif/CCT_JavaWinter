package Day05String;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int v1 = 3;
char v2 = '5';
String v3 = "5";

String st1 = "Codecraft Tech"; //string literal  //string pool

String st2 = new String("Codecraft Tech");// string object   //string heap 

boolean b3 = st1.equals(st2);//it will check only the main variables //it use it more
System.out.println(b3);
boolean b4 = st1==st2; //it will only check variable's memory location
                       //when we use equal equal sign,we don't use this
System.out.println(b4);
              //012345
String value = "United states";//here we will find out how many character are here
//value is the variable
                              //for this to find out we will use length method
int elements = value.length();  
//length will always return integer value
                               // first we will type variable name then .dot

System.out.println(elements);
           //char method will show us the element which belong to the index number like 5 value belongs to element d
	char c =    value.charAt(5);      //index number always start with 0 //charAt method only works with index number
System.out.println(c);	                            //index number show us which element belongs to which number
	  //it returns char value
    char LastIndex = value.charAt(elements-1); //by using (elements-1) we can see the last characteristics or elements
 System.out.println(LastIndex);    //if we deduct 1 from actual length of elements we can see the last one element  

     String result1 = value.substring(5);//substring method //it will return string value
	System.out.println(result1); //it will show the whole element from where the given number begin
	
	String result2 = value.substring(2 , 5); //it use to see limited number like from 2nd to 5th number
	//it will show 2nd to 4th not the 5th element
	System.out.println(result2);
	
	boolean b = value.equals(st1);//this method use for string compare values 
	
	System.out.println(b);
	
	boolean b2 = result2.equals(result1);
	System.out.println(b2);
	
	
	
	
	
	
	
	
	}

}
