package io.datastructures.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStacks {
	private int[] stack;
	private int top1;
	private int top2;
	
	public TwoStacks(int capacity) {
	    if (capacity <= 0)
	        throw new IllegalArgumentException("capacity must be 1 or greater.");
	    
		stack = new int[capacity];
		top2 = capacity;
	}
	
	public void push1(int element) {
		if(isFull1()) 
			throw new IllegalStateException();
		stack[top1++] = element;
	}
	
	public int pop1() {
		if(isEmpty1())
			throw new EmptyStackException();
		return stack[--top1];
	}

	public boolean isFull1() {
		return top1 == top2;
	}
	
	public boolean isEmpty1() {
		return top1 == 0;
	}
	
	public void push2(int element) {
		if(isFull2()) 
			throw new IllegalStateException();
		stack[--top2] = element;
	}
	
	public int pop2() {
		if(isEmpty2())
			throw new EmptyStackException();
		return stack[top2++];
	}

	public boolean isFull2() {
		return top2 == top1;
	}
	
	public boolean isEmpty2() {
		return top2 == stack.length;
	}
	
	@Override
	public String toString() {
		var content = Arrays.copyOfRange(stack, 0, top2);
		return Arrays.toString(content);
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stack));
	}
}
