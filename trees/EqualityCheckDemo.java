package io.datastructures.trees;

public class EqualityCheckDemo {

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.addElement(7);
		tree1.addElement(4);
		tree1.addElement(9);
		tree1.addElement(1);
		tree1.addElement(6);
		tree1.addElement(8);
		tree1.addElement(10);
		
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2.addElement(7);
		tree2.addElement(4);
		tree2.addElement(9);
		tree2.addElement(1);
		tree2.addElement(6);
		tree2.addElement(8);
		
		System.out.println(" tree1 is equal to tree2 "+tree1.equals(tree2));
	}

}
