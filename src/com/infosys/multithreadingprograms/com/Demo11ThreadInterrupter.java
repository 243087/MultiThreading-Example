package com.infosys.multithreadingprograms.com;

class Interupt extends Thread{
	public void run() {
		try {
		for(int i=0;i<10;i++)
		{
			System.out.println("I am lazy Thread");
			Thread.sleep(2000);
		}
		}
		catch (InterruptedException e) {
		  System.out.println("I got interrupted by Thread Interrupter");
		}
	}
}
public class Demo11ThreadInterrupter {
 
	public static void main(String[] args) {
		Interupt it = new Interupt();
		it.start();
		it.interrupt();
		System.out.println("Main thread");
	}
}
