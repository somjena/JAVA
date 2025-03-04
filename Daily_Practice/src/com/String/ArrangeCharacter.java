package com.String;

public class ArrangeCharacter {
	public static void main(String[] args) {
		String s= "ram#123";
		//output= 123#ram
		StringBuilder letter = new StringBuilder();
		StringBuilder number = new StringBuilder();
		StringBuilder spcl = new StringBuilder();
		char []ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a' & ch[i]<='z') {
				letter.append(ch[i]);
			}else if (ch[i]>='0'&ch[i]<='9') {
				number.append(ch[i]);
			}else {
				spcl.append(ch[i]);
			}
		}
		String result = number.toString()+spcl.toString()+letter.toString();
		System.out.println(result);
	}

}
