package io.datastructures.trees;

public class AncestorsDemo {

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.addElement(7);
		tree1.addElement(4);
		tree1.addElement(9);
		tree1.addElement(1);
		tree1.addElement(6);
		tree1.addElement(8);
		tree1.addElement(10);
		
		System.out.println("Ancestors of a value "+tree1.getAncestors(88));
	}

}
