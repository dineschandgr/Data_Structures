package io.datastructures.queues;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueWithTwoStacks {
	private Stack<Integer> firstStack;
	private Stack<Integer> secondStack;
	
	public QueueWithTwoStacks() {
		firstStack = new Stack<Integer>();
		secondStack = new Stack<Integer>();
	}
	
	public void enqueue(int element){
		firstStack.push(element);
	}
	
	public int dequeue(){
		checkSecondStackEmpty();
		return secondStack.pop();
	}

	private void checkSecondStackEmpty() {
		if(secondStack.isEmpty()){	
			while(!firstStack.isEmpty()){
				secondStack.push(firstStack.pop());
			}
		}
	}
	
	public int peek(){
		if(isEmpty())
			throw new EmptyStackException();
		return secondStack.peek();
	}
	
	public boolean isEmpty(){
		return secondStack.isEmpty();
	}

	@Override
	public String toString() {
		return "QueueWithTwoStacks [firstStack=" + firstStack + ", secondStack=" + secondStack + "]";
	}

}
