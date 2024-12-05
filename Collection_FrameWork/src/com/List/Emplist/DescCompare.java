package com.List.Emplist;

import java.util.Comparator;

public class DescCompare implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o2.empid-o1.empid;
	}

}
