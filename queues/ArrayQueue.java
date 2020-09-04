package io.datastructures.queues;

import java.util.Arrays;

public class ArrayQueue {

	//enqueue
	//dequeue
	//peek
	//isEmpty
	//isFull
	
	// 10,20,30,40,0
	//	F        R
	// F= 0 
	// R = 3
	
	private int[] queue;
	private int front;
	private int rear;
	int count;
	
	public ArrayQueue(int capacity) {
		queue = new int[capacity];
	}
	
	public void enqueue(int element) {
		if(isFull())
			throw new IllegalStateException();
		
		queue[rear] = element;
		rear = (rear+1) % queue.length ; 
		count++;
	}
	
	public int dequeue() {
		if(isEmpty())
			throw new IllegalStateException();
		var item = queue[front];
		queue[front] = 0;
		front = (front + 1) % queue.length;
		count--;
		return item;
	}
	
	public int peek() {
		return queue[front];
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		if(count == queue.length)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "ArrayQueue [queue=" + Arrays.toString(queue) + "]";
	}
	
	
}
