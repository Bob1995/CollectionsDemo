package com.akshay.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(2);// Adding duplicates
	//	arrayList.add(null);// Adding null
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(9);
		
		//Iteration with foreach
		for (Integer arrayListValue : arrayList) {
			System.out.println("Arraylist value:"+arrayListValue);
		}


		//Ascending order
		Collections.sort(arrayList);
		System.out.println("Arraylist in ascending order:"+arrayList);
		
		
		//Descending order
		Collections.sort(arrayList, Collections.reverseOrder());
		System.out.println("Arraylist in descending order:" + arrayList);
	}

}
