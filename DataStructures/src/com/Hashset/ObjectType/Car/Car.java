package com.Hashset.ObjectType.Car;

public class Car {
	String cname;
	long carno;
	int serialno;
	
	
	public Car(String cname,long carno,int serialno) {
		this.cname=cname;
		this.carno=carno;
		this.serialno=serialno;
	}
	@Override
	public String toString() {
		return "CarName:-"+cname+"\n"+"carNo:-"+carno+"\n"+"Serial-No"+serialno;
	}
	@Override
	public int hashCode() {
		return serialno;
	}
	@Override
	public boolean equals(Object key) {
		Car c = (Car)key;
		return cname.equals(c.cname) && c.carno==carno && c.serialno==serialno;
				}

}
