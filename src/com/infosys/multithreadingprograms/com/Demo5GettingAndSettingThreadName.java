package com.infosys.multithreadingprograms.com;

class NameThread extends Thread{
	
}
public class Demo5GettingAndSettingThreadName {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Rahul");
		System.out.println(Thread.currentThread().getName());
		
		
		NameThread nt = new NameThread();
		System.out.println(nt.getName());
	}
}
