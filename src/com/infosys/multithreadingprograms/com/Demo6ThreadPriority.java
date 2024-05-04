package com.infosys.multithreadingprograms.com;

class ThreadPriority extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Demo6ThreadPriority {
  public static void main(String[] args) {
	  ThreadPriority t = new ThreadPriority();
	  t.setPriority(9);
	  t.start();
	  for(int i=0;i<10;i++)
		  System.out.println("Main Thread");
  }
}
