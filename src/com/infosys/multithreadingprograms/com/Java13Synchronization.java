package com.infosys.multithreadingprograms.com;

class Display2Thread{
	public synchronized void display1() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
		}
	}
	public synchronized void display2() {
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
		}
	}
}

class MyThread8 extends Thread{
	Display2Thread d;
	MyThread8(Display2Thread d){
		this.d=d;
	}
	public void run() {
		d.display1();
	}
}
class MyThread9 extends Thread{
	Display2Thread d;
	MyThread9(Display2Thread d){
		this.d=d;
	}
	public void run() {
		d.display2();
	}
}
public class Java13Synchronization {

	public static void main(String[] args) {
		Display2Thread d = new Display2Thread();
		MyThread8 t1 = new MyThread8(d);
		MyThread9 t2 = new MyThread9(d);
		t1.start();
		t2.start();
	}
}
