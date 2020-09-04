package io.datastructures.stacks;
import java.util.Stack;

public class DuplicateBracket {
	
	//push all characters until ')' is found
	
	public static boolean isDuplicateBracketFound(String str) {
		Stack<Character> stack = new Stack();
		for(char ch : str.toCharArray()) {
			if(ch != ')') {
				stack.push(ch);
			}else {
				int counter = 0;
				while(stack.pop() != '(') {
					counter++;
				}
				
				if(counter < 1)
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "((a+b)+(c+d))";
		System.out.println(isDuplicateBracketFound(str));
	}
}
