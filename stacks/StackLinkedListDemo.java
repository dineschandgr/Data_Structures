package io.datastructures.stacks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("peek is "+stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("peek is "+stack.peek());
		System.out.println("stack empty is "+stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println("stack empty is "+stack.isEmpty());
		
	}

}
