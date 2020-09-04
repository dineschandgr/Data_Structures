package io.datastructures.trees;

public class BinarySearchTreeDemo {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addElement(7);
		bst.addElement(4);
		bst.addElement(9);
		bst.addElement(1);
		bst.addElement(6);
		bst.addElement(8);
		bst.addElement(10);
		System.out.println(bst);
		System.out.println(bst.search(10));
		bst.traversePreOrder();
		bst.traverseInOrder();
		bst.traversePostOrder();
		System.out.println("height of tree "+bst.height());
		System.out.println("min value is "+bst.minValue());
		System.out.println("min value is "+bst.minValueBST());
		System.out.println("size of tree is "+bst.size());
		System.out.println("count leaves "+bst.countLeaves());
		bst.addElement(201);
		System.out.println("max value in the tree is "+bst.max());
		System.out.println("element contains "+bst.contains(201));
		System.out.println("are siblings "+bst.areSiblings(10,8));
		
		
	}
}
