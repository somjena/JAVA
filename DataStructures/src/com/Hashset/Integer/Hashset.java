package com.Hashset.Integer;

public class Hashset {
	private Node[]a= new Node[10];
	private int count=0;
	
	
	public boolean Add(int key) {
		int index = key%a.length;//Hash --Function
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev= null;
		while(curr!=null) {
			if(key==curr.key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	
	
	public int size() {
		return count;
	}
	
	
	public void traverse() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.println(curr.key+" ");
				curr=curr.next;
			}
		}
	}

}
