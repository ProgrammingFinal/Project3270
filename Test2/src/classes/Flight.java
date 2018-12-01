package flight;

import java.util.Date;

public class Flight {
	
	int numOfPassengers;
	int flightNum;
	//scheduled date and time, not current
	String date;
	String time;
	int month; 
	int day; 
	int year; 
	int hour; 
	int minute;
	int second;
	
	String departingCity;
	String arrivingCity;
	boolean reserve;
	int maxPassengers;
	
	public Flight() {
	}
	
	public Flight(String date, String time, String departingCity, String arrivingCity, int flightNum) {
		this.date = date;
		this.time = time;
		this.departingCity = departingCity;
		this.arrivingCity = arrivingCity;
		this.flightNum = flightNum;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getTime() {
		return time;
	}
	
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public int getFlightNum() {
		return flightNum;
	}
	
	public String getFromCity() {
		return departingCity;
	}
	
	public String getToCity() {
		return arrivingCity;
	}
	
	//check is flight is reserved or not
	public boolean isReserved() {
		return reserve;
	}
	
	//set flight to reserved
	public void setReserve() {
		reserve = true;
	}
	
	//get fight information
	public String getFlightInfo(int flightNum, String date, String time, String departingCity, String arrivingCity) {
		return "Flight Number is " + flightNum + ", date is " + date + ", time is " + time + ", departing from " + departingCity + ", arriving at " + arrivingCity; 
	}
	
	//When a flight is booked, correct number of passengers
	public void bookFlight() {
		numOfPassengers = numOfPassengers + 1;
	}
	
	public void setMaxPass (int maxPass) {
		this.maxPassengers = maxPassengers;
	}
	public boolean isFull(int maxPassengers, int numOfPassengers) {
		boolean isFull; 
		if(numOfPassengers == maxPassengers || numOfPassengers >= maxPassengers) {
			isFull = true;
		} else {
			isFull = false;
		}
		return isFull;
	}
}

