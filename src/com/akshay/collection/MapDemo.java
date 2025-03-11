package com.akshay.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	private static void hashMapBasic() {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(3, "L");
		hashmap.put(1, "B");
		hashmap.put(2, "A");

		System.out.println("HashMap Values" + hashmap);

		System.out.println("Entryset Function:" + hashmap.entrySet());
		System.out.println("Keyset function:" + hashmap.keySet());
		System.out.println("Values in Map" + hashmap.values());

		List<Integer> arrayList = new ArrayList<>(hashmap.keySet());
		System.out.println("Arraylist:"+arrayList);
		
		Collections.sort(arrayList);
		Collections.sort(arrayList,Collections.reverseOrder());
		System.out.println("Array list in reverse order:"+arrayList);

//		
//		Map<Integer, String> treemap = new TreeMap<Integer, String>();
//
//		treemap.put(3, "L");
//		treemap.put(1, "B");
//		treemap.put(2, "A");
//
//		System.out.println("TreeMap Values" + treemap);

	}

	public static void main(String[] args) {
		hashMapBasic();
	}

}
