package io.datastructures.trees;

public class NodesDistanceDemo {

	public static void main(String[] args) {
		BinarySearchTree tree1 = new BinarySearchTree();
		tree1.addElement(7);
		tree1.addElement(4);
		tree1.addElement(9);
		tree1.addElement(1);
		tree1.addElement(6);
		tree1.addElement(8);
		tree1.addElement(10);
		tree1.addElement(20);		
		var list = tree1.getNodesAtDistance(1);
		list.forEach(System.out::println);
		System.out.println(" ====");
		tree1.traverseLevelOrder();
	}

}
