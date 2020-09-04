package io.datastructures.stacks;

import java.util.EmptyStackException;

public class StackUsingLinkedList {
	
	private class Node {
		
		private int value;
		private Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
	}
	
	private Node top;
	private Node last;
	private int size;
	
	public void push(int element) {
		Node newNode = new Node(element);
		
		if(isStackEmpty()) {
			top = newNode;
			last = newNode;
		}else {
			top.next = newNode;
			top = newNode;
		}
		
	}

	private boolean isStackEmpty() {
		return top==null;
	}
	
	public int pop() {
		
		if(isStackEmpty())
			throw new EmptyStackException();
		
		int pop = top.value;
		Node current = last;
		if(top == last) {
			top = last = null;
			return pop;
		}
			
		while(current.next != top) {
			current = current.next;
		}
		
		current.next = null;
		top = current;
		return pop;
		
	}
	
	public int peek() {
		return top.value;
	}
	
	public boolean isEmpty() {
		return isStackEmpty();
	}
	
	@Override
	public String toString() {
		return "StackUsingLinkedList [top=" + top.value + ", last=" + last + ", size=" + size + "]";
	}
}
