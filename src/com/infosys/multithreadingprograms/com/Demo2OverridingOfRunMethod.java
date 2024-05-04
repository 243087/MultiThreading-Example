package com.infosys.multithreadingprograms.com;

class MyThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("Thread class run method");
	}
	void run(String a)
	{
		for(int i=0;i<5;i++)
		System.out.println(a);
	}
}
public class Demo2OverridingOfRunMethod {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		t.run("Rahul check");
		for(int i=0;i<10;i++)
		System.out.println("Main Thread");
	}
}
