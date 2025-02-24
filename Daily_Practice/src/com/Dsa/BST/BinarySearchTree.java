package com.Dsa.BST;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	Node root; //root element
	int count = 0; //to count no of elements.
	boolean flag; //to identify the duplicate elements
	
	//user called add method
	public boolean add(int key)
	{
		flag = true;
		root = add(root, key);
		return flag;
	}

	//adding element in the binary tree
	public Node add(Node n, int k) {
		if(n == null) {
			n = new Node(k);
			count++;
			return n;
		}
		
		//checking the element is big or small comparing to root.
		//if it is small then add it to the left side of the node.
		if(k < n.key) {
			n.left = add(n.left, k);
		}
		//if the element is greater then add right side of the node.
		else if(k > n.key) {
			n.right = add(n.right, k);
		}
		//else the element already exist, so don't add return false.
		else {
			flag = false;
		}
		return n;
	}
	
	//no of element
	public int Size() {
		return count;
	}
	
	//tree is empty or not empty it will check.
	public boolean isEmpty() {
		return count == 0;//true or false
	}
	
	//traversal methods(DFS)
	//user call program.
	public void preOrder() //pre-order traversal
	{
		preOrder(root);
	}
	
	public void preOrder(Node n) {
		if(n == null) return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	//post-order traversal
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(Node n) {
		if(n == null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	
	//In-order traversal
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node n) {
		if(n == null) return;
		inOrder(n.left);
		System.out.print(n.key+" ");
		inOrder(n.right); //In-order called as storing sorted order elements in a tree.
	}
	
	
	//traversal methods(BFS)- Level order traversal.
	public void levelOrder() {
		//we are implementing the Queue interface LinkedList() class to traversing the tree.
		Queue q =  new LinkedList();
		
		if(root != null) q.add(root);
		while(!q.isEmpty()) {
			Node n = (Node)q.poll();//downcasting done, to access the object type in the node type.
			System.out.print(n.key+" ");
			if(n.left != null) q.add(n.left);
			if(n.right != null) q.add(n.right);
		}
		System.out.println();
	}
	
	
	//searching an element in the tree.
	//user calling program
	public boolean contains(int key) {
		return contains(root,key);
	}
	
	private boolean contains(Node n, int key) {
		if(n == null) return false; //if the root node is not there that means the tree is empty.
		
		if(key < n.key) {
			return contains(n.left, key);//if the searched element is smaller than root, then it must present in the left side of the tree
		}
		else if(key > n.key) {
			return contains(n.right,key);//if the searched element is greater than root, then it must present in the right side of the tree
		}
		else {
			return true;
		}
	}
	
	
	//finding the smallest element node in the tree.
	//user program
	public int smallKey() {
		Node minNode = getMinNode(root);
		return minNode.key;
	}
	
	private Node getMinNode(Node n) {
		if(n.left == null) return n;
		return getMinNode(n.left);
	}
	
	//finding the smallest element node in the tree.
	//user program
	public int bigKey() {
		Node maxNode = getMaxNode(root);
		return maxNode.key;
	}
			
	private Node getMaxNode(Node n) {
		if(n.right == null) return n;
		return getMaxNode(n.right);
	}
	
	
	//removing/deleting the node from tree.
	public void remove(int key) {
		root = removeNode(root, key);
	}
	
	private Node removeNode(Node n, int key) {
		//to search and locate where the node is present in the tree.
		if(n == null) return null;
		
		if(key < n.key) {
			n.left = removeNode(n.left, key);
		}
		else if(key > n.key) {
			n.right = removeNode(n.right, key);
		}
		else //this means we found the element
		{
			//scenario-1(leaf node, means the node don't have any child nodes)
			if(n.left == null && n.right == null) {
				n = null;
			}
			//scenario-2(node has only one left node)
			else if(n.right == null) {
				n = n.left;
			}
			//scenario-3(node has only one right node)
			else if(n.left == null) {
				n = n.right;
			}
			//scenario-4(node has both child nodes)
			else {
				Node maxNode = getMaxNode(n.left);//going to the left side find the maximum node.
				int temp = maxNode.key;
				maxNode.key = n.key;
				n.key = temp;
				//deleting that node
				n.left = removeNode(n.left, key);
			}
		}
		return n;
	}
}