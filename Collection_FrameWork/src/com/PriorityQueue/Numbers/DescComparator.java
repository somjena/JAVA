package com.PriorityQueue.Numbers;

import java.util.Comparator;

public class DescComparator implements Comparator<Integer>{

	

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}

}
