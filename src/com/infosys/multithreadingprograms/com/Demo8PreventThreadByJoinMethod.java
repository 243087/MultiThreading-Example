package com.infosys.multithreadingprograms.com;


class JoinMethod extends Thread{
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
public class Demo8PreventThreadByJoinMethod {
  public static void main(String[] args) throws InterruptedException {
	JoinMethod jm = new JoinMethod();
	jm.start();
	jm.join();                  //Here main thread is waiting until the completion of the child thread
	for(int i=0;i<10;i++)       //We are implementing the task by doing like main thread calls join method on child thread object
		System.out.println("Main Thread");
}
}
