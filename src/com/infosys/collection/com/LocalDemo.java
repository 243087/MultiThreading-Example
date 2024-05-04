package com.infosys.collection.com;

import java.util.ArrayList;
import java.util.Scanner;

public class LocalDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the element to add arrayList or enter done to finish");
		
		while(true) {
			String check=sc.nextLine();
			if(check.equalsIgnoreCase("done"))
				break;
			else
			{
				int num= Integer.parseInt(check);
				al.add(num);
			}
		}
		System.out.print("Elements in arrayList are :");
		
		for(Integer x:al)
			System.out.print(x+" ");
		/*
		 * System.out.println("ENter the size of elemnt"); int size=sc.nextInt(); int
		 * []arr=new int[size]; for(int i=0;i<arr.length;i++) { arr[i]=sc.nextInt(); }
		 * for(Integer x:arr) System.out.println(x);
		 */
		
	}
}
