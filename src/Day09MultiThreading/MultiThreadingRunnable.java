package Day09MultiThreading;

public class MultiThreadingRunnable implements Runnable {

		public void run(){
			try{
				System.out.println("Thread from Runnable Interface " + Thread.currentThread().getId() + " is running");
			} catch (Exception e){
				System.out.println("Exception is caught");
			}
		}

		}


