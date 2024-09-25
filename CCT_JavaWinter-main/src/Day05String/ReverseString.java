package Day05String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String  st = "We are learning Java";	
	
	String reverse = "";
	
	
	int l = st.length();//multiple character makes string
	System.out.println(l);
	for (int i = l-1; i>=0; i= i-1) {	
	//i = 20-1=19;19>=0;
		reverse = reverse + st.charAt(i);	// reverse = a
		                                      //reverse = a+v
		                                 //reverse = av+a //reverse = ava+j
	}	
	System.out.println(reverse);	
	}

}
