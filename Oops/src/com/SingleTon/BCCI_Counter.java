package com.SingleTon;

public class BCCI_Counter {
	public static void main(String[] args) {
		IPL_Ticket user1 = IPL_Ticket.getinstanceof();
		IPL_Ticket user2 = IPL_Ticket.getinstanceof();
		
		
		System.out.println(user1.getTicketInfo());
		user1.bookTicket(50);
		
		user2.bookTicket(10);
		
	}

}
