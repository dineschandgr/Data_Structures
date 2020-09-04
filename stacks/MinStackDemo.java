package io.datastructures.stacks;

public class MinStackDemo {

	public static void main(String[] args) {
		MinStack stack = new MinStack();
		stack.push(10);
		stack.push(8);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		System.out.println(stack);
		System.out.println("min value is "+stack.min());
		stack.pop();
		System.out.println("min value is "+stack.min());
		stack.pop();
		System.out.println("min value is "+stack.min());
		stack.pop();
		System.out.println("min value is "+stack.min());
	}

}
