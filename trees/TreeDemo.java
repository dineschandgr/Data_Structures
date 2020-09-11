package DataStructures.Trees;

import DataStructures.Trees.Tree.Node;

public class TreeDemo {
	public static void main(String[] args) {
		Tree tree = new Tree();
		 int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 }; 
	        int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3};
		Node root = tree.constructTree(in,post);
		System.out.println(tree);
		tree.printPreOrder(root);
	}
}
