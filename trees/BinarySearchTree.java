package io.datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	
	private Node root;
	
	private class Node{
		
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			super();
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
		}
		
	}
	
	
	public void addElement(int element) {
		
		Node newNode = new Node(element);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Node current = root;
		while(true) {
			if(element < current.data) {
				if(current.left == null) {
					current.left = newNode;
					break;
				}
				current = current.left;
			}else { 
				if(current.right == null) {
					current.right = newNode;
					break;
				}
				current = current.right;
			}
					
		}
		
	}

	public boolean search(int element) {
		if(root == null) 
			throw new IllegalStateException();
			
		Node current = root;
		
		while(current != null) {
			if(element < current.data) 
				current = current.left;
			if(element > current.data) 
				current = current.right;	
			else
				return true;
		}
		
		return false;
			
	}
	
	public void traversePreOrder() {
		traversePreOrder(root);
	}
	
	private void traversePreOrder(Node root) {
		//root (print)
		//left
		//right
		
		//base condition
		if(root == null)
			return;
		System.out.println(root.data);
		traversePreOrder(root.left);
		traversePreOrder(root.right);
	}
	
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	
	private void traverseInOrder(Node root) {
		
		//left (print)
		//root
		//right
		
		//base condition
		if(root == null)
			return;
		traverseInOrder(root.left);
		System.out.println(root.data);
		traverseInOrder(root.right);
	}
	
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	
	private void traversePostOrder(Node root) {
		
		//left (print)
		//root
		//right
		
		//base condition
		if(root == null)
			return;
		traversePostOrder(root.left);		
		traversePostOrder(root.right);
		System.out.println(root.data);
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node root) {
		
		if(root == null)
			return -1;
		
		if(root.left == null && root.right == null)
			return 0;
		
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	public int minValue() {
		return minValue(root);
	}
	
	//Time Complexity of Binary Tree O(n)
	private int minValue(Node root) {
		if(isLeaf(root)) {
			return root.data;
		}
		var left = minValue(root.left);
		var right = minValue(root.right);
		return Math.min(Math.min(left,right) , root.data);
	}
	
	public int minValueBST() {
		return minValueBST(root);
	}

	//Time Complexity of Binary Tree O(log n)
	private int minValueBST(Node root) {
		if(isLeaf(root)) {
			return root.data;
		}
		return minValue(root.left);
	}
	
	private boolean isLeaf(Node root) {
		return root.left == null && root.right == null;
	}
	
	public boolean equals(BinarySearchTree tree) {
		if(tree == null)
			return false;
		return equals(this.root,tree.root);
	}
	
	private boolean equals(Node root1, Node root2) {
		if(root1 == null && root2 == null)
			return true;
		
		if(root1 != null && root2 != null)
			 return root1.data == root2.data
			 && equals(root1.left,root2.left)
			 && equals(root1.right,root2.right);
		
		return false;
	}
	
	public boolean validateBinaryTree() {
		return validateBinaryTree(root);
	}
	
	private boolean validateBinaryTree(Node root) {
		if(root == null || root.left == null || root.right == null)
			return true;
		
		if((root.left.data > root.data) || (root.right.data < root.data))
				return false;
		
		validateBinaryTree(root.left);
		validateBinaryTree(root.right);
		
		return true;
	}
	
	public void swapRoot() {
		var temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	public ArrayList<Integer> getNodesAtDistance(int k) {
		var list = new ArrayList<Integer>();
		getNodesAtDistance(root,k,list);
		return list;
	}
	
	private void getNodesAtDistance(Node root, int k,ArrayList<Integer> list) {
		if(root == null)
			return;
		
		if(k==0) {
			list.add(root.data);
			return;
		}
		getNodesAtDistance(root.left,k-1,list);
		getNodesAtDistance(root.right,k-1,list);
	}
	
	public void traverseLevelOrder() {
		for(int i = 0;i <= height();i++) {
			for(var value : getNodesAtDistance(i)) {
				System.out.println(value);
			}
		}
	}
	
	public int size() {
		return size(root);
	}
	
	private int size(Node root) {
		if(root == null)
			return 0;
		
		if(isLeaf(root)) {
			return 1;
		}
		//System.out.println(" ***** "+1 + size(root.left) + size(root.right));
		return 1 + size(root.left) + size(root.right);
	}
	
	public int countLeaves() {
		return countLeaves(root);
	}
	
	private int countLeaves(Node root) {
		if(root == null)
			return 0;
		
		if(isLeaf(root))
			return 1;
		
		return countLeaves(root.left) + countLeaves(root.right);
	}
	
	public int max() {
		if(root == null)
			throw new IllegalStateException();

		return max(root);
	}
	
	private int max(Node root) {
		if(root.right == null)
			return root.data;
		
		return max(root.right);
	}
	
	public boolean contains(int element) {
		return contains(root,element);
	}
	
	private boolean contains(Node root, int element) {
		if(root == null)
			return false;
		
		if(element == root.data)
			return true;

		return contains(root.left,element) || contains(root.right,element);
	}
	
	public boolean areSiblings(int value1, int value2) {
		return areSiblings(root, value1, value2);
	}
	
	private boolean areSiblings(Node root, int value1, int value2) {
		if(root == null)
			return false;

		if(root.left != null && root.right != null) {
			if( (root.left.data == value1 && root.right.data == value2) || (root.left.data == value2 && root.right.data == value1))
				return true;
		}
		
		return areSiblings(root.left,value1,value2) || areSiblings(root.right,value1,value2);
	}
	
	public List<Integer> getAncestors(int value){
		List<Integer> numList = new ArrayList<>();
		getAncestors(root, value, numList);
		return numList;
	}
	
	private boolean	getAncestors(Node root, int value, List<Integer> numList){
		if(root == null)
			return false;
		
		if(root.data == value)
			return true;
		
		if(getAncestors(root.left, value, numList) || getAncestors(root.right, value, numList)) {
			numList.add(root.data);
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}
	
	
}
