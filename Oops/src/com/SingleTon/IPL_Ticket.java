package com.SingleTon;

public class IPL_Ticket {
    int seats = 50;

    private static IPL_Ticket i = null;

    private IPL_Ticket() {}

    public void bookTicket(int ticket) {
        if (seats >= ticket) { // Corrected condition
            seats -= ticket;
            System.out.println("Booked Seats: " + ticket);
           
        } else {
            System.out.println("Not enough seats available");
        }
    }
    public int getTicketInfo() {
    	return seats;
    }

    static IPL_Ticket getinstanceof() {
        if (i == null) {
            i = new IPL_Ticket();
        }
        return i;
    }
}
