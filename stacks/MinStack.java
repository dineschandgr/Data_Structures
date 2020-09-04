package io.datastructures.stacks;

public class MinStack {
	private Stack stack = new Stack();
	private Stack minStack = new Stack();
	
	
	public void push(int element) {
		stack.push(element);
		if(minStack.isEmpty())
			minStack.push(element);
		
		if(element < minStack.peek())
			minStack.push(element);
	}
	
	public int pop() {
		if(stack.isEmpty())
			throw new IllegalArgumentException();
		
		var pop = stack.pop();
		if(pop == minStack.peek())
			minStack.pop();
		
		return pop;
		
	}
	
	public int min() {
		return minStack.peek();
	}

	@Override
	public String toString() {
		return "MinStack [stack=" + stack + ", minStack=" + minStack + "]";
	}
	
	
	
}
