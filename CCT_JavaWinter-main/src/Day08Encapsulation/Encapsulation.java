package Day08Encapsulation;

public class Encapsulation {

	
		
		//Encapsulation is used to hide the data using setter and getter method
		
		
		
		
		private String name = "CodeCraft Tech";				//write & read 
		private int SSN = 12345678;					    	//write access
		private String username = "Bangladeshi";			//read access
		
		
		
		
		
		
		// Setter Method - name								//set the data, Write
		public void setName(String value){
			name = value;
		}   
		
		// Getter Method - name								//get the data, Read
		public String getName(){
			return name;
		}
		
		//Setter Method - s s n								//set the data, Write
		public void setSSN(int value){
			SSN = value;
		}
		
		
		
		//Getter Method - user name							//get the data, Read
		public String getUserName(){
			return username;
		}
		
		
		
		}
