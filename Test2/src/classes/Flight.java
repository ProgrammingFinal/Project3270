package classes;

import java.util.Date;

public class Flight {
	
	//set to private
	private static int numOfPassengers;
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
	private static boolean reserve;
	private static int maxPassengers;
	
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
	
	//flight object with parameters 
	public Flight(String date, String arrivalTime, String departureTime, String departingCity, String arrivingCity, int flightNum) {
		this.date = date;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.departingCity = departingCity;
		this.arrivingCity = arrivingCity;
		this.flightNum = flightNum;
	}
	
	//Getters and setters
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
	public int maxPassengers() {
		return maxPassengers;
	}
	public void setMaxPass (int maxPass) {
		this.maxPassengers = maxPassengers;
	}

	//check if flight is reserved or not
	public boolean checkReserved() {
		return reserve;
	}
	
	//Book a flight and add 1 to total number of passengers
		
		
		
	//get fight information
	public String getFlightInfo(int flightNum, String date, String arrivalTime, String departureTime, String departingCity, String arrivingCity) {
		return "Flight Number is " + flightNum + ", date is " + date + ", departure time is " + departureTime + ", arrival time is " + arrivalTime + ", departing from " + departingCity + ", arriving at " + arrivingCity; 
	}
	
	public interface bookFlight{
		public default void book() {
			if(isFull(maxPassengers, numOfPassengers)==false) {
				reserve=true;
				numOfPassengers = numOfPassengers + 1;
			}else {
				System.out.println("Flight is full");
			};
	}
	
	//check if flight is full and return boolean value
	public static boolean isFull(int maxPassengers, int numOfPassengers) {
		boolean isFull; 
		if(numOfPassengers == maxPassengers || numOfPassengers >= maxPassengers) {
			isFull = true;
		} else {
			isFull = false;
		}
		return isFull;
		}
	}
}

