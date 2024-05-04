package com.infosys.multithreadingprograms.com;

class PreventThreadByJoin extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			try {
			  Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				
			}		
		}
	}
}

public class Demo9PreventThreadByJoinMethodEg2 {
	  public static void main(String[] args) throws InterruptedException {
			JoinMethod jm = new JoinMethod();
			jm.start();
                                        //Here main thread is waiting until the completion of the child thread
			for(int i=0;i<10;i++)       //We are implementing the task by doing like main thread calls join method on child thread object
				System.out.println("Main Thread");
			jm.join();  
		}
}
