package com.SingleTon;
class MovieHall{
	int Seats = 50;
	private static MovieHall m =null;
	private MovieHall() {
		
	}
	
	
public void bookTicket(int Ticket) {
	if(Ticket<=Seats) {
		Seats-=Ticket;
		System.out.println(Ticket + " is Booked ");
			System.out.println("Hurry Up Only "+ Seats + " Tickets Available");
	}else {
		System.out.println("Sorry Only "+ Seats+" Tickets Available");
	}
}
public static MovieHall getInstance() {
	if(m==null) {
		 m=new MovieHall();
		return m;
	}else {
		return m;
	}
}
public int getSeats() {
	return Seats;
}
}
public class BookMyShow {

	public static void main(String[] args) {
		MovieHall user1 = MovieHall.getInstance();
		MovieHall user2 = MovieHall.getInstance();
		user1.bookTicket(40);
		user2.bookTicket(12);
		user1.getSeats();
		user2.getSeats();
		
		
	}

}
