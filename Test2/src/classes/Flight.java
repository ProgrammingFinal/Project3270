package classes;

import java.util.Date;

public class Flight {
	
	int numOfPassengers;
	int flightNum;
	String date;
	String arrivalTime;
	String departureTime;
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
	
	public Flight(String date, String arrivalTime, String departureTime, String departingCity, String arrivingCity, int flightNum) {
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.departingCity = departingCity;
		this.arrivingCity = arrivingCity;
		this.flightNum = flightNum;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getArrivalTime() {
		return arrivalTime;
	}
	
	public String getDepartureTime() {
		return departureTime;
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
	public boolean checkReserved() {
		return reserve;
	}
	//Book a flight and add 1 to total number of passengers
		public void bookFlight() {
			if(isFull(maxPassengers, numOfPassengers)==false) {
				reserve=true;
				numOfPassengers = numOfPassengers + 1;
			}else {
				System.out.println("Flight is full");
			}
		}
	//get fight information
	public String getFlightInfo(int flightNum, String date, String time, String departingCity, String arrivingCity) {
		return "Flight Number is " + flightNum + ", date is " + date + ", time is " + time + ", departing from " + departingCity + ", arriving at " + arrivingCity; 
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

