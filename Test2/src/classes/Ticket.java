package classes;

public class Ticket {

	boolean reservationStatus;
	
	Flight f1 = new Flight();
	
	public Ticket() {
	}
	
	
	//if returns true, it is reserved. if false, not reserved
	public boolean reservationStatus() {
		return f1.isReserved();
	}
	
	public boolean cancelTicket(Flight f1) {
		return f1.isReserved() == false;
	}
	
	public void ticketInquiry() {
		System.out.println("The flight number is " + f1.getFlightNum());
		System.out.println("The flight time is " + f1.getTime());
		System.out.println("The flight date is " + f1.getDate());
		System.out.println("The number of passengers is " + f1.getNumOfPassengers());
		System.out.println("The flight is to " + f1.getToCity());
		System.out.println("The flight is from " + f1.getFromCity());
		
		
	}
	

}
