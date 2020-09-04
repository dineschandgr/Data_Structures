package io.datastructures.linkedlist;

import java.util.NoSuchElementException;

public class LinkedList {
	
	private class Node {
		
		private int value;
		private Node next;
		public Node(int value) {
			super();
			this.value = value;
		}
	}

	
	private Node first;
	private Node last;
	private int size;
	
	public Node getFirst() {
		return first;
	}
	public void setFirst(Node first) {
		this.first = first;
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
	
	public void addFirst(int value) {
		
		var newNode = new Node(value);
		
		if(isEmpty()) {
			first = newNode;
			last = first;
		}else {
			newNode.next = first;
			first = newNode;
		}
		size++;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public void addLast(int value) {
		var newNode = new Node(value);
		
		if(isEmpty()) {
			first = newNode;
			last = first;
		}else {
			last.next = newNode;
			last = newNode;
		}
		
		size++;
	}
	
	public void deleteFirst() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		if(first == last) {
			first = last = null;
		}else {
			var second = first.next;
			first.next = null;
			first = second;
		}
		size--;
	}
	
	public void deleteLast() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		if(first == last) {
			first = last = null;
		}else {		
			Node current = first;
			while(current.next != last){
				current = current.next;
			}
			
			current.next = null;
			last = current;
		}
		size--;
	}
	
	public boolean contains(int value) {
		return indexOf(value) != -1;
	}
	
	public int indexOf(int value) {
		
		int index = 0;
		Node current = first;
		while(current != null){
			if(current.value == value){
				return index;
			}
			current = current.next;
			index++;
		}
		
		return -1;
	}
	
	//O(1)
	public int size() {
		return size;
	}
	
	public int[] toArray() {
		int index = 0;
		int[] array = new int[size];
		Node current = first;
		while(current != null){
			array[index++] = current.value;
			current = current.next;
		}
		return array;
	}
	
	
	//10 -> 20 -> 30 -> 40
	//p     c     n
	//		p     c     n
	
	//10 <-20  <- 30 <- 40
	
	public void reverse() {
		
		if(isEmpty())
			return;
		
		Node prev = first;
		Node currNode = first.next;
		
		while(currNode != null) {
			
			Node nextNode = currNode.next;
			
			currNode.next = prev;
			prev = currNode;
			currNode = nextNode;
			
		}
		
		last = first;
		last.next = null;
		first = prev;
	}
	
	//10 20 30 40 50
	
	// k= 1 - 0 distance
	//k =2 - 1 distance
	//k=3 - 2 distance
	// so use k-1 distance between 2 pointers
	
	
	public int getKthFromTheEnd(int k){
		
		if(isEmpty())
			throw new IllegalStateException();
		
		Node firstPointer = first;;
		Node secondPointer = first;
		for(int i = 0; i< k-1;i++) {
			secondPointer = secondPointer.next;
			
			if(secondPointer == null)
				throw new IllegalArgumentException();
		}
		
		while(secondPointer != last) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next;
		}
		
		return firstPointer.value;
	}
	
	public void printMiddle() {
		
		//odd numbers
		//10 - 1
		//10  20 30 - 2
		//10 20 30 40 50 - 3
		//10 20 30 40 50 60 70 - 4
		//10 20 30 40 50 60 70 80 90 - 5
		
		//even numbers
		//2 - 1,2
		//4 - 2,3
		//6 - 3,4
		//8 - 4,5
		if(isEmpty())
			throw new IllegalArgumentException();
		
		Node firstPointer = first;
		Node secondPointer = first;
 		while(secondPointer != last && secondPointer.next != last) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next.next;
		}
 		
 		if(secondPointer == last)
 			System.out.println("Middle node is "+firstPointer.value);
 		else {
 			System.out.println("Middle node is "+firstPointer.value + "," +firstPointer.next.value);
 		}
		
		
	}
	
	//Floyd’s Cycle-finding Algorithm
	public boolean hasLoop() {
		
		//10 20 30 40 50
		Node firstPointer = first;
		Node secondPointer = first;
		
		while(secondPointer != null && secondPointer.next != null) {
			firstPointer = firstPointer.next;
			secondPointer = secondPointer.next.next;
			
			if(secondPointer == firstPointer) {
				System.out.println("loop found ");
				return true;
			}
		}
		
		return false;
		
	}
	
	 public static LinkedList createWithLoop() {
		    var list = new LinkedList();
		    list.addLast(10);
		    list.addLast(20);
		    
		    // Get a reference to 20
		    var node = list.last;
		    list.addLast(30);

		  

		    list.addLast(40);
		    list.addLast(50);

		    // Create the loop
		    list.last.next = node;

		    return list;
		  }
}
