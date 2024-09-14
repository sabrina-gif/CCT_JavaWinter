package Day09MultiThreading;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//multi threading is a java feature that allows concurrent execution of two or more parts of a program
		//threads can be created by using two mechanism 
	
		 /* Multi threading is a Java feature that allows concurrent execution of two or more parts of a program.
		
		Threads can be created by using two mechanisms : 

			1. Extending the Thread class 
			2. Implementing the Runnable Interface */
		
		
		

		 /* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
		
		Threads can be created by using two mechanisms : 

			1. Extending the Thread class 
			2. Implementing the Runnable Interface */
		
		
		

		
			int n =4;
			for (int i =0; i< n; i++){
				MultiThreadingThread MultithreadingThreadObj = new MultiThreadingThread(); // Extending the Thread class
				MultithreadingThreadObj.start();
			}
			
			
			
			int m = 4;
			for (int i =0; i< m; i++){
				Thread ThreadObj = new Thread(new MultiThreadingRunnable()); // Implementing the Runnable Interface
				ThreadObj.start();
			}
		}

		
		
}
	
	
	
