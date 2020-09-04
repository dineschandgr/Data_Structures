package io.datastructures.hashtables;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int[] numbers = {1,2,3,3,3,1,2,4};
		for(var number : numbers)
			set.add(number);
		
		System.out.println(set);
	}
}
