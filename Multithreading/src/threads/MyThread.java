package threads;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 10; i > 0; i--) 
		{
		
			System.out.println("Thread #1 : " + i);
			
			try 
			{
				Thread.sleep(1000); //1000 ms pause between iterations
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is done! :)");
	}
}
