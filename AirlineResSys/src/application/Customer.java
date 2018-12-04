package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Customer extends User {

	public static void main(String[] args) {



	}//main
    Scanner input = new Scanner(System.in);

	private String reservationDate;
	private String reservationTime;
	private boolean hasReservation;

	Customer() {
		reservationDate = "12/29/2018";
		reservationTime = "8:00 AM";
		hasReservation = true;
	}


	public String getReservationDate() {
		return reservationDate;
	}


	public void setReservationDate(String reservationDate) {
		this.reservationDate = reservationDate;
	}


	public String getReservationTime() {
		return reservationTime;
	}


	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}


	public boolean getHasReservation() {
		return hasReservation;
	}


	public void setHasReservation(boolean hasReservation) {
		this.hasReservation = hasReservation;
	}
	
	//setHasReservation

}//class