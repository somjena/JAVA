package com.String;

public class OccuranceWord {

	public static void main(String[] args) {
		String word = "java is java is easy";
		String words[]=word.split(" ");
		
		boolean []flag = new boolean[words.length];
		
		for(int i =0;i<=flag.length;i++) {
			if(flag[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;i<=words.length;i++) {
				if(words[i].equals(words[j])) {
					
				count++;
				flag[j]=true;
					
				}
			}
			System.out.println(words[i]+" "+count);
		}

	}

}
