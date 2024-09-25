package Day09MultiThreading;

public class MultiThreadingThread extends Thread{

	
		 /* Multi threading is a Java feature that allows concurrent execution of two or more parts of a program.
		
		Threads can be created by using two mechanisms : 

			1. Extending the Thread class 
			2. Implementing the Runnable Interface */
		
		
		public void run(){
			try{
				System.out.println("Thread from Thread Class " + Thread.currentThread().getId() + " is running");
			} catch (Exception e){
				System.out.println("Exception is caught");
			}

		
			

		}

}
