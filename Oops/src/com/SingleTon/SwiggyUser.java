package com.SingleTon;
class Resturant{
	int MealCount=30;
	int Biriyani=10;
	private static Resturant r = null;
	private Resturant(){
		
	}
	public void bookFood(int m,int b) {
		if(m<MealCount && b<Biriyani) {
			MealCount-=m;
			Biriyani-=b;
			System.out.println("Your Order Confirmed "+"\n"+"Meals :- "+MealCount +"\n"+"Biriyani :-"+Biriyani);
		}else {
			System.out.println("Your Booking Can Book "+ MealCount + " Meal && "+ Biriyani + " Biriyani  In Your Order");
		}
		
	}
	public static Resturant getIntanceof() {
		if(r==null) {
			r=new Resturant();
			return r;
		}else {
			return r;
		}
	}
	public int TotalFood() {
		return MealCount+Biriyani;
	}
}
public class SwiggyUser {

	public static void main(String[] args) {
		Resturant user1 = Resturant.getIntanceof();
		Resturant user2 = Resturant.getIntanceof();
		user1.bookFood(20, 4);
		user2.bookFood(30,20);

	}

}
