package com.infosys.collection.com;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo2LinkedList {

	public static void main(String[] args) {
		LinkedList<Object> l1 =  new LinkedList<Object>();
		l1.add("Rahul");
		l1.add("will work in Amazon within ");
		l1.add(8);
		l1.add("months");
		System.out.print(l1);
		l1.add("and earns "+150000+"per months");
		
		
		ListIterator<Object> lt = l1.listIterator();
		while(lt.hasNext())
		{
			System.out.print(lt.next());
		}
		
		System.out.println();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(93);
		l2.addLast(null);
		System.out.println(l2);
		
		l1.addAll(l2);
		System.out.println(l1);
		
		System.out.println("Check "+Arrays.toString(l1.toArray()));
	}
}
