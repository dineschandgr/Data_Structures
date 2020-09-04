package io.datastructures.stacks;

public class TwoStacksDemo {

	public static void main(String[] args) {
		TwoStacks stack = new TwoStacks(5);
		stack.push1(1);
		stack.push1(2);
		stack.push1(100);
		stack.push2(3);
		stack.push2(4);
		stack.printStack();
		System.out.println(stack.pop2());
		System.out.println(stack.pop2());
		System.out.println(stack.pop1());
		System.out.println(stack.pop1());
		System.out.println(stack.isEmpty1());
		System.out.println(stack.isEmpty2());
		stack.printStack();
		
	}

}
