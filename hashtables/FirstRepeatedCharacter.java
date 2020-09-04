package io.datastructures.hashtables;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "green apple";
		System.out.println(" return val is "+getFirstRepeatedChar(str));
	}
	
	//O(n)
	public static char getFirstRepeatedChar(String str) {
		var charArray = str.toCharArray();
		Set<Character> charSet = new HashSet<>();
		for(char ch : charArray) {
			if(charSet.contains(ch))
				return ch;
				
			charSet.add(ch);
		}
		
		System.out.println(charSet);
		
		return Character.MIN_VALUE;
	}

}
