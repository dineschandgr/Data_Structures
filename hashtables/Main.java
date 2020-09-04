package io.datastructures.hashtables;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"aaa");
		map.put(2,"bbb");
		map.put(3,"ccc");
		map.put(null,"ccc");
		map.remove(null);
		//O(1)
		map.containsKey(3);
		//O(n)
		map.containsKey("aaa");
		System.out.println(map);
		
		for(var item : map.entrySet())
			System.out.println(item);
		
		System.out.println(map.remove(3));
		
	}

}
