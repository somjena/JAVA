package com.Interface.MarkerInterface;
interface washable{
	
}
class Car implements washable{
	
}
class Laptop{
	
}
class Bike implements washable{
	
}
class garage{
	public static void wash(Object o) {
	    if( o instanceof washable) {
	    	System.out.println(o.getClass().getSimpleName() + " is Washed");
	    }else {
	    	System.out.println(o.getClass().getSimpleName() + " Not Washed");
	    }
	}
}
public class Washerman {

	public static void main(String[] args) {
		garage.wash(new Car());
		garage.wash(new Laptop());
		garage.wash(new Bike());
		

	}

}
