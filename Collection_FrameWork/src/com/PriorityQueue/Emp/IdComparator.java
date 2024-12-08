package com.PriorityQueue.Emp;

import java.util.Comparator;

public class IdComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		return o2.id-o1.id;
	}

}
