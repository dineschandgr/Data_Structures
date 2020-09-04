package io.datastructures.trees;

public class ValidateBinaryTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.addElement(7);
		tree1.addElement(29);
		tree1.addElement(9);
		tree1.addElement(1);
		tree1.addElement(6);
		tree1.addElement(8);
		tree1.addElement(10);
		
		System.out.println(tree1);
		tree1.swapRoot();
		System.out.println(" valid binary tree "+tree1.validateBinaryTree());
	}

}
