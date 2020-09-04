package io.datastructures.queues;

public class ArrayQueueDemo {
	public static void main(String[] args) {
		ArrayQueue arrayQueue = new ArrayQueue(5);
		arrayQueue.enqueue(10);
		arrayQueue.enqueue(20);
		arrayQueue.enqueue(30);
		System.out.println(arrayQueue.isFull());
		System.out.println(arrayQueue);
		
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.dequeue());
		System.out.println(arrayQueue.isEmpty());
		System.out.println(arrayQueue.peek());
		arrayQueue.enqueue(40);
		arrayQueue.enqueue(50);
		arrayQueue.enqueue(60);
		arrayQueue.enqueue(70);
		arrayQueue.dequeue();
		arrayQueue.enqueue(80);
		System.out.println(arrayQueue);
		
		
	}
}
