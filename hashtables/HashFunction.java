package io.datastructures.hashtables;

import java.util.HashMap;
import java.util.Map;

public class HashFunction {
	public static void main(String[] args) {
		
		String str = "orange";
		System.out.println(str.hashCode());
		/*
		 * Map<String,String> map = new HashMap<>(); map.put("123456-A", "mosh");
		 * System.out.println(hash("123456-A"));
		 */
	}
	
	public static int hash(String key) {
		String s = "";
		int hash = 0;
				
		for(var ch : key.toCharArray())
			hash +=ch;
		return hash % 100;
		
	}
}
