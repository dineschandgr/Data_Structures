package io.datastructures.queues;

public class StackWithTwoQueuesDemo {

	public static void main(String[] args) {
		StackWithTwoQueues stack = new StackWithTwoQueues();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("size of stack is "+stack.size());
		System.out.println(stack);
		System.out.println("peek "+stack.peek());
		System.out.println("pop "+stack.pop());
		System.out.println(stack);
		System.out.println("pop "+stack.pop());
		System.out.println(stack);
		System.out.println("pop "+stack.pop());
		System.out.println(stack);
		System.out.println("pop "+stack.pop());
		System.out.println(stack);
		System.out.println("pop "+stack.pop());
		stack.push(60);
		stack.push(70);
		stack.push(80);
		System.out.println(stack);
		System.out.println("size os stack is "+stack.size());
		
		
	}

}
