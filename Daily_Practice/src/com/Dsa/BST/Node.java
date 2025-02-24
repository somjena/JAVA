package com.Dsa.BST;
public class Node {
	int key; // adding/searching element
	Node left; //left element
	Node right; //right element
	
	public Node(int key) {
		this.key = key;
	}

	public Node(int key, Node left, Node right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	
}
