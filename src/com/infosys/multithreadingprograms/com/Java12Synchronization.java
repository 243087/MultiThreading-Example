package com.infosys.multithreadingprograms.com;

class Display{
	public synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.println("Good Morning");
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}
class MyThread7 extends Thread {
 
	Display d;
	String name;
	MyThread7(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run() {
		d.wish(name);
	}
}
public class Java12Synchronization{
	public static void main(String[] args) {
		Display d = new Display();
		MyThread7 t1 = new MyThread7(d,"Sachin");
		MyThread7 t2 = new MyThread7(d,"Dhoni");
		t1.start();
		t2.start();
	}
}
