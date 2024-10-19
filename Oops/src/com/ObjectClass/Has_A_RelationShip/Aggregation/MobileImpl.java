package com.ObjectClass.Has_A_RelationShip.Aggregation;

public class MobileImpl {

	public static void main(String[] args) {
		Mobile m = new Mobile("oppo", 8, 128, "White");
		System.out.println(m);
		m.insertSim(new SimCard("jio", 6371326214L));
		System.out.println(m);

	}

}
