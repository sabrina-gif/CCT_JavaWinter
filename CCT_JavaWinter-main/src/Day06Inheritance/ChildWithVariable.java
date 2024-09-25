package Day06Inheritance;

public class ChildWithVariable extends ParentWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 ParentWithVariable obj = new  ParentWithVariable (3,5);
	int result1 = obj.x;
	int result2 = obj.y;
	System.out.println(result1);
	System.out.println(result2);
	
	
	
	}

		
		public 	ChildWithVariable (int p, int q) {  //we have to have another constructor also in child
	
	super(p,q);//to initialize the child constructor we need to use super keyword
	
	
	
	}

}
