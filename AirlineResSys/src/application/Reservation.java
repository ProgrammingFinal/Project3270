package application;

import java.util.Date;

public class Reservation {

	private Date dateReserved;
	private Date dateOfFlight;
	private int reservationNum;
	private int flightNum;
	private String provider;
	private String depart;
	private String arrive;
	
	Reservation() {
		reservationNum = (int) (2000*Math.random()+1000);//random number between 1000 and 1999
		setFlightNum((int) (3000*Math.random()+2000));//random number between 2000 and 2999
	}//no arg 
	
	Reservation(Date dateReserved, Date dateOfFlight, int reservationNum, int flightNum, String provider, String depart, String arrive){
		this.dateReserved = dateReserved;
		this.dateOfFlight = dateOfFlight;
		this.reservationNum = reservationNum;
		this.setFlightNum(flightNum);
		this.provider = provider;
		this.depart = depart;
		this.arrive = arrive;
	}//multiple arg constructor

	public Date getDateReserved() {
		return dateReserved;
	}

	public void setDateReserved(Date dateReserved) {
		this.dateReserved = dateReserved;
	}

	public Date getDateOfFlight() {
		return dateOfFlight;
	}

	public void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}


	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}	
	
	
	public int getReservationNum() {
		return reservationNum;
	}

	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getArrive() {
		return arrive;
	}

	public void setArrive(String arrive) {
		this.arrive = arrive;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}