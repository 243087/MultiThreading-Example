package com.infosys.multithreadingprograms.com;

class MyThread2 extends Thread{
	
}

public class Demo3WhatHappenWhenNotOverrideRunMethod {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		t.start();
		for(int i=0;i<5;i++)
		System.out.println("Main Thread");
	}
}
