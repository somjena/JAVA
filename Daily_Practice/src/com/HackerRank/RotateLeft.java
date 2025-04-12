package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeft {
	
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	System.out.println(rotate(2,list));
}
public static List<Integer> rotate(int d,List<Integer> l) {
	int n = l.size();
    d = d % n; // Effective rotations
    List<Integer> rotated = new ArrayList<>();
   // Add elements from d to end
      rotated.addAll(l.subList(d, n));
    // Add elements from start to d
      rotated.addAll(l.subList(0, d));
      System.out.println(d);
   
    return rotated;


}
}
