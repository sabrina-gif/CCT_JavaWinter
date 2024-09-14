package Day05Array;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//int[] arr = new int [5];//multiple data into one variable
	//in one array we can store only same type of data type
	//arr[0] =2;
	//arr[1] = 5;//array will always work with loop not system.out.println
	//arr[2] = 7;
	//arr[3] = 8;
	//arr[4]= 9;
	
//integer String [] stArr = {5,6,7,8,9};//elements//as we can see 5 elements by count but in index we count from 0 thats why we deduct 1 from length

String [] stArr = {"sabrina","Farhana","Danyal","Ishita"};
	
	//int l = stArr.length;//here length is not method cause its not come with parenthesis so that this is the final variable
	
	                   //final variable is non access modifier,this variable is fixed we can't change anything
	//System.out.println(l);
	               //o>=4//here we compare length with index number
	               //1>=4
	               //2>=4
	//for(int i = 0; i <= l-1; i++)  //i means index number//for need to see all elements we have to deduct from length
	//for (int i = 0; i<=stArr.length-1; i++) //we can also use this by skipping ( int l = arr.length ) this method                            
	//{System.out.println(stArr[i]);}
	
	
	for (int i = 2; i<=stArr.length-1; i++) { //when we add it will be less than
		//2 = Danyal,2<=4-1(3);i3+1(4)
		System.out.println(stArr[i]);	
	
	//for (int i1 =stArr.length-1; i1 >=3;i1 -- ) //when we deduct i will be greater the given number
		 
	//{	System.out.println(stArr[i1 ]);}
	
	

	
	
	
	
	
	
	
	
	
	}
	
	}}

	