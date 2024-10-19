package com.ObjectClass.Has_A_RelationShip.Aggregation;

public class SimCard {
	String sname;
	long num;
	
	public SimCard(String sname, long num) {
		this.sname = sname;
		this.num = num;
	}

	@Override
	public String toString() {
		return "SimCard [sname=" + sname + ", num=" + num + "]";
	}
	
	
	

}
