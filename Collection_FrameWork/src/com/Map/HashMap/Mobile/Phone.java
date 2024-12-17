package com.Map.HashMap.Mobile;

public class Phone {
	int rom;
	int ram;
	String color;
	Sim s;
	
	
	
	public Phone(int rom, int ram, String color) {
		this.rom = rom;
		this.ram = ram;
		this.color = color;
	}
	
	
	public Sim insertSim(Sim s) {
		return this.s=s;
		
	}


	@Override
	public String toString() {
		return "Phone [rom=" + rom + ", ram=" + ram + ", color=" + color + ", sim=" + s + "]";
	}
	
	
	
	
	
	
	
	

}
