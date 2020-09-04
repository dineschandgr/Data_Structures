package io.datastructures.stacks;import java.util.Arrays;

public class StackDemo {
	public static void main(String[] args) {
		String str = "123456789";
		StringReverser stringReverser = new StringReverser();
		var result = stringReverser.reverse(str);
		System.out.println(result);
		
		String str1 = "<>";
		BalanceBracket balanceBracket = new BalanceBracket();
		System.out.println("bracket balanced "+balanceBracket.isBalanced(str1));
		
		Stack stack = new Stack();
		stack.push(1);
		System.out.println(stack.pop());
		stack.push(2);
		stack.push(3);
		System.out.println("peek "+stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		stack.push(4);
		stack.push(5);
		stack.push(100);
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		
	}
}
