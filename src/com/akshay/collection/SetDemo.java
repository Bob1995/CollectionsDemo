package com.akshay.collection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hashset=new HashSet<Integer>();
		hashset.add(9);
		hashset.add(2);
		hashset.add(10);
		hashset.add(2);
		System.out.println("Hashset:"+hashset);
		hashset.add(null);
		
		
		List<Integer>arrayList=new ArrayList<>(hashset);
		System.out.println("Arraylist: "+arrayList);
		
		
		
		

	}

}
