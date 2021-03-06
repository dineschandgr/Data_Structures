package io.datastructures.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		reverse(queue);
		System.out.println(queue);
	}
	
	public static void reverse(Queue<Integer> queue) {
		//add
		//remove
		//isEmpty
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty())
			stack.add(queue.remove());
		
		while(!stack.isEmpty()) 
			queue.add(stack.pop());
		
	}
}
