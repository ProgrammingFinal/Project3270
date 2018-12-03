package classes;

import java.util.Date;

public class Flight {
	
	private int numOfPassengers;
	private int flightNum;
	private String date;
	private String arrivalTime;
	private String departureTime;
	private int month; 
	private int day; 
	private int year; 
	private int hour; 
	private int minute;
	private int second;
	private String departingCity;
	private String arrivingCity;
	private boolean reserve;
	private int maxPassengers;
	
	//no arg constructor
	public Flight() {
		this.numOfPassengers = 0;
		this.flightNum = 0;
		this.date = "";
		this.arrivalTime="";
		this.departureTime="";
		this.month=0; 
		this.day = 0; 
		this.year=0; 
		this.hour=0; 
		this.minute=0;
		this.second=0;
		this.departingCity="";
		this.arrivingCity="";
		this.reserve = false;
		this.maxPassengers=0;
	
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
	public int maxPassengers() {
		return maxPassengers;
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
	public String getFlightInfo(int flightNum, String date, String arrivalTime, String departureTime, String departingCity, String arrivingCity) {
		return "Flight Number is " + flightNum + ", date is " + date + ", departure time is " + departureTime + ", arrival time is " + arrivalTime + ", departing from " + departingCity + ", arriving at " + arrivingCity; 
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

