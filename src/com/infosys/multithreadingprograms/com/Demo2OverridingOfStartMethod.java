package com.infosys.multithreadingprograms.com;

class MyThread3 extends Thread{
	public void start() {
		super.start();
		for(int i=0;i<10;i++) {
		System.out.println("Child Thread");
		}
	}
	public void run()
	{
		for(int i=0;i<10;i++) {
		System.out.println("Child@1 Thread");
		}
	}
}

public class Demo2OverridingOfStartMethod {
	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		for(int i=0;i<5;i++)
		System.out.println("Main Thread");
	}
}
