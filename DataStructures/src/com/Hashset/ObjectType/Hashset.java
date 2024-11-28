package com.Hashset.ObjectType;

public class Hashset {
	 Node[]n=new Node[10];
	 int count;
	
	public boolean add(Object key) {
		int index = key.hashCode()%n.length;
		index=Math.abs(index);
		
		if(n[index]==null) {
			n[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=n[index];
		Node prev = null;
		
		while(curr!=null) {
			if(key.equals(curr.key))return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
		
		
	}
	public void traverse() {
		for(int i=0;i<n.length;i++) {
			Node curr=n[i];
			
			while(curr!=null) {
				System.out.println(curr.key+" ");
				curr=curr.next;
			}
		}
	}
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}

}
