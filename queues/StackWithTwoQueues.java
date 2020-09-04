package io.datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {
	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();
	int top;
	
	//O(1)
	public void push(int element){
		queue1.add(element);
		top = element;
	}
	
	//O(n)
	public int pop(){
		if(isEmpty())
			throw new IllegalStateException();
		
		while(queue1.size()>1) {
			top = queue1.remove();
			queue2.add(top);
		}
		
		swapQueues();
		
		return queue1.remove();
	}


	public void swapQueues() {
		Queue<Integer> tempQueue = queue1;
		queue1 = queue2;
		queue2 = tempQueue;
	}
	
	//O(1)
	public int peek(){
		if(isEmpty())
			throw new IllegalStateException();
		return top;
	}
	
	//O(1)
	public boolean isEmpty(){
		return queue1.isEmpty() && queue2.isEmpty();
	}
	
	//O(1)
	public int size(){
		return queue1.size() + queue2.size();
	}

	@Override
	public String toString() {
		return "StackWithTwoQueues [queue1=" + queue1 + ", queue2=" + queue2 + "]";
	}
	
	
}
