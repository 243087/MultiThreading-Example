package com.infosys.multithreadingprograms.com;


class YieldThread extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class Demo7PreventThreadByYieldMethod {

	public static void main(String[] args) {
		YieldThread yt = new YieldThread();
		yt.start();
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
}
