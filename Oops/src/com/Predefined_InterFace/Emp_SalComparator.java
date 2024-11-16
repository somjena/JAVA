package com.Predefined_InterFace;

import java.util.Comparator;

public class Emp_SalComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;

		if(e1.sal>e2.sal) return 1;
		if(e1.sal<e2.sal)return -1;
		else {
			return 0;
		}
	}

}
