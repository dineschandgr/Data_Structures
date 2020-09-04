package io.datastructures.hashtables;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "a green apple";
		System.out.println(" return val is "+getFirstNonRepeatedChar(str));
	}
	
	public static char getFirstNonRepeatedChar(String str) {
		var charArray = str.toCharArray();
		Map<Character,Integer> charMap = new HashMap<>();
		for(char ch : charArray) {
			int count = charMap.containsKey(ch) ? count = charMap.get(ch) : 0;
			charMap.put(ch,++count);
		}
		
		System.out.println(charMap);
		
		 for(char ch : charArray) {
			 if(charMap.get(ch) ==1)
				 return ch;
		 }
		
		return Character.MIN_VALUE;
	}

}
