package io.datastructures.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

	//push
	//pop
	//peek
	//isEmpty
	
	private int[] stack;
	int top = 0;
	
	Stack(){
		stack = new int[10];
	}
	
	public void push(int element) {
		ResizeIfRequired();
		stack[top++] = element;
		System.out.println("top is "+top);
	}

	private void ResizeIfRequired() {
		if(top == stack.length) {
			int[] newStack = new int[stack.length*2];	
			for(int i = 0; i < top; i++)
				newStack[i] = stack[i];
			stack = newStack;
		}
	}
	
	public int pop() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack[--top];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return stack[top-1];
	}

	@Override
	public String toString() {
		var content = Arrays.copyOfRange(stack, 0, top);
		return Arrays.toString(content);
	}
	
	
}
