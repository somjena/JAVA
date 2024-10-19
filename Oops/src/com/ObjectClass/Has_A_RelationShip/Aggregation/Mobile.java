package com.ObjectClass.Has_A_RelationShip.Aggregation;

public class Mobile {
	String m_name;
	int ram;
	int rom;
	String color;
	SimCard s;
	
	public Mobile(String m_name, int ram, int rom, String color) {
		this.m_name = m_name;
		this.ram = ram;
		this.rom = rom;
		this.color = color;
	}
	public void insertSim(SimCard s) {
		this.s=s;
		
	}
	@Override
	public String toString() {
		return "Mobile [m_name=" + m_name + ", ram=" + ram + ", rom=" + rom + ", color=" + color + ", s=" + s + "]";
	}
	
	

}
