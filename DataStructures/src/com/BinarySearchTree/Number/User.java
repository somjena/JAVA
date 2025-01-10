package com.BinarySearchTree.Number;

public class User {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		System.out.println(bst.size());
		System.out.println(bst.isEmpty());
		bst.add(1);
		bst.add(2);
		System.out.println(bst.size());
		System.out.println(bst.isEmpty());
	}

}
