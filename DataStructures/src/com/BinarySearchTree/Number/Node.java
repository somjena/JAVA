package com.BinarySearchTree.Number;

public class Node {
	Node left;
	Node right;
	int key;
	//constructor to initialize object
	public Node(Node left,Node right,int key) {
		this.left=left;
		this.right=right;
		this.key=key;
	}
	//Constructor Overloading
	public Node (int key) {
		this.key=key;
	}

}
