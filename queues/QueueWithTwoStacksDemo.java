package io.datastructures.queues;

public class QueueWithTwoStacksDemo {

	public static void main(String[] args) {
		QueueWithTwoStacks queue = new QueueWithTwoStacks();
		queue.enqueue(10);
		queue.enqueue(20);
		//System.out.println(queue.peek());
		queue.enqueue(30);
		System.out.println(queue);
		System.out.println("deque is "+queue.dequeue());
		System.out.println("deque is "+queue.dequeue());
		System.out.println("deque is "+queue.dequeue());
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println("deque is "+queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.peek());
		

	}

}
