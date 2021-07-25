package threads;

public class MainClass {

	public static void main(String[] args) {
		
		/* Two ways to create a thread:
		 * 1. Thread class.
		 * 2. Runnable interface.
		 */
		
		MyThread t1 = new MyThread();
		MyRunnable run1 = new MyRunnable();
		Thread t2 = new Thread(run1);  //passing Runnable object to a thread.
		
		/* JVM waits only for user threads to terminate before exiting. */
		
		//t1.setDaemon(true); //t1 is daemon
		//t2.setDaemon(true); //t2 is daemon
		
		t1.start();
		
		/*
		try 
		{
			t1.join(); 
			//the calling thread (for ex.main) waits until t1 is terminated or for a specific time unit
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		*/
		
		t2.start();
	}
}
