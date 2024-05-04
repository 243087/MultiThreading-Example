package com.infosys.collection.com;

import java.util.Scanner;
import java.util.Vector;

public class Demo3Vector {

	public static void main(String[] args) {
		Vector<Object> vo = new Vector<Object>();
		vo.add("Rama");
		vo.addElement(" Sita");
		vo.add(1," Jay");
		System.out.println("Before User Input "+vo);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size ");
		int size=sc.nextInt();
		Vector<Object> vo1 = new Vector<Object>(size);
		
		System.out.println();
		for(int i=0;i<size;i++)
		{
			//Object ao = sc.next();
			vo1.add(sc.next());
		}
		
		System.out.println(vo1);

	}
}
