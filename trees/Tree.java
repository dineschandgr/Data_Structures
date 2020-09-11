package DataStructures.Trees;

import java.util.HashMap;
import java.util.Map;

public class Tree {
	
	public class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	public Node constructTree(int[] inOrder, int[] postOrder){
		for(int i = 0;i< inOrder.length;i++){
			map.put(inOrder[i],i);
		}
		
		return buildUtil(inOrder,postOrder,0,inOrder.length - 1, 0 ,postOrder.length - 1);
		
	}
	
	public Node buildUtil(int[] inOrder, int[] postOrder, int inStart, int inEnd, int pStart, int pEnd){
		
		if(inStart > inEnd || pStart > pEnd)
			return null;
		int data = postOrder[pEnd--];
		Node root = new Node(data);

		if(inStart == inEnd)
			return root;
		
		int index = map.get(data);
		
		root.right = buildUtil(inOrder,postOrder,index+1,inEnd,pStart,pEnd);
		root.left = buildUtil(inOrder,postOrder,inStart,index-1,pStart,pEnd);
		
		return root;
		
	}
	
	public void printPreOrder(Node root){
		 if (root == null) 
	            return; 
		System.out.println(root.data);
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
}
