package com.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
	Node root;
	public void add(int key) {
		root = new Node(key);
		populate(root);
	}
	
	public void populate(Node n) {
		System.out.println("Do u want to insert ele in left side of:"+n.key);
		boolean left=new Scanner(System.in).nextBoolean();
		if(left) {
			n.left=new Node(new Scanner(System.in).nextInt());
			populate(n.left);
		}
		System.out.println("Do u want to insert ele in right side of:"+n.key);
		boolean right=new Scanner(System.in).nextBoolean();
		if (right) {
			n.right=new Node(new Scanner(System.in).nextInt());
			populate(n.right);
		}
	}
	public void PreetyDisplay() {
		PreetyDisplay(root,0);
		
	}
	public void PreetyDisplay(Node n,int level) {
		
	}

}
