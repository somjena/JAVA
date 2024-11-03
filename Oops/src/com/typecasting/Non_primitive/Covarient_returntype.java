package com.typecasting.Non_primitive;
class AA extends Object{
	public static Object m1() {
		return new AA();
	}
}
class BB extends Object{
	
}
class CC extends BB{
	public static BB m1() {
		return new CC();
	}
}
class Demof{
	public static void call(Object o) {
		System.out.println(o.getClass().getSimpleName()+ " M1 Called ");
		
	}
}
public class Covarient_returntype {

	public static void main(String[] args) {
		Demof.call(new AA());
		Demof.call(new BB());
		Demof.call(new CC());
		

	}

}
