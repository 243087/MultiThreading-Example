package com.infosys.collection.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Demo1ArrayList {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> al= new ArrayList<>();
		
		ArrayList<Integer> al1=new ArrayList<>(List.of(15,20,30));
		al.add(10);
		al.add(0,10);
		//al.addAll(al1);
		al.addAll(1, al1);
		System.out.println(al);
		al.set(0,100);
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		//al.retainAll(al1);
		System.out.println(al.retainAll(al1));
		
		System.out.println(al);
		
		/*
		 * for(int i=0;i<al.size();i++) System.out.println(al.get(i));
		 * 
		 * for(Integer x:al) System.out.println(x);
		 * 
		 * for(var x:al) System.out.println(x);
		 */
		
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println("Check "+it.next());
		}
		
		
	}
}
