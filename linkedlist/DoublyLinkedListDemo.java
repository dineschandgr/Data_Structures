package io.datastructures.linkedlist;

import java.util.Arrays;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		java.util.LinkedList<String> x = new java.util.LinkedList<String>();
		DoublyLinkedList list = new DoublyLinkedList();
			list.addFirst(20);
			list.addFirst(10);
			list.addLast(100);
			System.out.println(list.size());
			System.out.println(Arrays.toString(list.toArray()));
			//System.out.println(Arrays.toString(list.toArray()));
			list.reverse();
			System.out.println(Arrays.toString(list.toArray()));
			list.reverse();
			list.addLast(200);
			System.out.println(Arrays.toString(list.toArray()));
			list.reverse();
			System.out.println(Arrays.toString(list.toArray()));
			list.reverse();
			System.out.println(Arrays.toString(list.toArray()));
			System.out.println("index from last "+list.indexFromLast(10));
			System.out.println("middle node is "+list.findMiddleNode());
			System.out.println("kth element from last is ");
	}

} 
