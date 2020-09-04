package io.datastructures.stacks;

import java.util.Stack;

public class StringReverser {
	
	public String reverse(String input) {
		
		if(input == null)
			throw new IllegalArgumentException();
		
		Stack<Character> stack = new Stack<>();
		StringBuffer reversed = new StringBuffer();
		for(char c : input.toCharArray())
			stack.push(c);
		
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		return reversed.toString();
	}
}
