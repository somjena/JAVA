package com.String;
public class Occuranceofword {
	public static void main(String[] args) {
		String s= "java is very java easy";
		String []words=s.split(" ");
		boolean []res = new boolean[words.length];
		for(int i=0;i<res.length;i++) {
			if(res[i]) {
				continue;
			}
			int count= 1;
			for(int j=i+1 ;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					res[j]=true;
				}	
			}
			System.out.println(words[i] +" = "+count);
		}
	}

}
