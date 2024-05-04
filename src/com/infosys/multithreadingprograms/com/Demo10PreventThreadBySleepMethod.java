package com.infosys.multithreadingprograms.com;

class SleepThread extends Thread{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
		  System.out.println("Hello Sleep Thread");
		  Thread.sleep(2000);
		}
		}
		catch (InterruptedException e) {

		}
	}
}
public class Demo10PreventThreadBySleepMethod {

	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();
		System.out.println("Main thread");
	}
}
