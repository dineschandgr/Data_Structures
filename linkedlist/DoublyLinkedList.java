package io.datastructures.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	public class Node {
		
		public int value;
		private Node next;
		private Node prev;
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
		
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			first = newNode;
			last = first;
		}else {
			newNode.next = first;
			first.prev = newNode;
			first = newNode;
		}
		size++;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		
		if(isEmpty()) {
			first = newNode;
			last = first;
		}else {
			last.next = newNode;
			newNode.prev = last;
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
			Node second = first.next;
			second.prev = null;
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
				System.out.println("nextNode" +current.value);
			}
			
			last.prev = null;
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
	
	public int indexFromLast(int value) {
		
		int index = 0;
		Node current = last;
		while(current != null){
			if(current.value == value){
				return index;
			}
			current = current.prev;
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
	
	  public void reverse() {
		  first = last;
		  Node current = last;
		  Node prevNode =  null;
		  while(current != null ) { 
			    current.next = current.prev;
		    	current.prev =  prevNode;
		  		prevNode = current; 
		  		current = current.next; 
		  } 
		  last = prevNode;
	}
	 
	
	public int findMiddleNode(){
		 Node rear = last;
		 Node front = first;
		 while(rear != null){
			 
			 if(rear.prev == front.next)
				 return rear.prev.value;
			 rear = rear.prev;
			 front = front.next;
		 }
		
		return -1;
	}
}