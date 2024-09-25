package HomeWork2;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Compare(5);//as per condition this number is not greater than 5 
Compare(45);//as per condition this number is greater than 5,between 8 and 10,greater than 33
Compare(20);
	}
	public static void Compare (int number)  { // if condition has to be always true otherwise main body will not gonna work

	if (number>5 && (number>=8 && number<=10) || number>33) //in case of && operator if one condition is false then result is false
//compare5//false&&          false                false //so result is bad number
//compare45//true&&          true             || true//so result is good number	
//compare20//true&&           true            ||false//so result is bad number 
	{ System.out.println("good number")	; }

else   { System.out.println("bad number");   }
	


	
	}

}
