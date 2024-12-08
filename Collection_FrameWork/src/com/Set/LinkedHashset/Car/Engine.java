package com.Set.LinkedHashset.Car;

public class Engine {
	int cc;
	
	public Engine(int cc) {
		this.cc=cc;
	}
	@Override
	public String toString() {
		return cc+"CC";
	}
	public int hashCode() {
		return cc;
	}
	public boolean equals(Object o) {
		Engine e = (Engine)o;
		return this.cc==e.cc;
	}

}
