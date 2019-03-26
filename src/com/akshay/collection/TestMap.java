package com.akshay.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	private static void hashMapBasic() {

		Map<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(3, "L");
		hashmap.put(1, "B");
		hashmap.put(2, "A");

		System.out.println("HashMap Values" + hashmap);

		System.out.println("**Hashmap sorting:***");

		System.out.println("Sorting basis on Keys:");
		System.out.println("Ascending Order:");
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Descending Order:");
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("Sorting basis on Values:");
		System.out.println("Ascending Order:");
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("Descending Order:");
		hashmap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

		hashmap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		Map<Integer, String> treemap = new TreeMap<Integer, String>();

		treemap.put(3, "L");
		treemap.put(1, "B");
		treemap.put(2, "A");

		System.out.println("TreeMap Values" + treemap);

		System.out.println("Entryset Function:" + treemap.entrySet());
		System.out.println("Keyset function:" + treemap.keySet());
		System.out.println("Values in Map" + treemap.values());

	}

	public static void main(String[] args) {
		hashMapBasic();
	}

}
