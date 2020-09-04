package io.datastructures.linkedlist;

import java.util.Arrays;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addFirst(100);
		System.out.println("list contains "+list.contains(5));
		System.out.println("Index of "+list.indexOf(200));
		System.out.println("getKthFromTheEnd "+list.getKthFromTheEnd(-1));
		System.out.println(Arrays.toString(list.toArray()));
		list.printMiddle();
		
		LinkedList list1 = LinkedList.createWithLoop();
		System.out.println(list1.hasLoop());
		
	}
}
