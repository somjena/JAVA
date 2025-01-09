package com.BinarySearchTree.Number;

public class BinarySearchTree {
	private Node root;
	private int count;
	
	
	
	//add Method 
	public boolean add(int key) {
		if(root==null) {
			root =new Node(key);
			count++;
			return true;
		}
		Node curr=root;
		Node prev=null;
		
		while(curr!=null) {
			if(key<curr.key) {
				prev=curr;
				curr=curr.left;
			}
			
		}
	}
	

}
