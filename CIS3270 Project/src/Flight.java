import java.util.Date;

public class Flight {
	
	public static void main(String[] args) {
		
	}
	int numOfPassengers;
	int flightNum;
	String date;//set date
	String departureTime;//set
	String arrivalTime;//get set
	
	String departingCity;//set
	String arrivingCity;//set
	boolean reserve;
	int maxPassengers;//get mass pass
	
	public Flight() {
	}
	
	public Flight(String date, String departureTime, String departingCity, String arrivingCity, int flightNum) {
		this.date = date;
		this.departureTime = departureTime;
		this.departingCity = departingCity;
		this.arrivingCity = arrivingCity;
		this.flightNum = flightNum;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	
	 String getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}	

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public int getFlightNum() {
		return flightNum;
	}
	
	public String getDepartingCity() {
		return departingCity;
	}
	
	public String getArrivingCity() {
		return arrivingCity;
	}
	
	//check is flight is reserved or not
	public boolean getReserved() {
		return reserve;
	}
	
	//set flight to reserved
	public void setReserve(boolean reserve) {
		this.reserve = reserve;
	}
	
	//flight CANT be booked if ALREADY BOOKED--------------
	//flight CANT be booked if times conflict--------------
	//flight CANT be booked if flight is full--------------
	//When flight is booked, correct number of passengers------------
	//when flight is booked, set flight time to reservationTime-----------
	//when flight is booked, set flight date to reservationDate---------
	//when flight is booked, set hasReservation to true

	public void bookFlight(Customer a, Flight b) {
		String[] c1 = a.getReservationDate().split("/",3);// creates string array with length of 3 containing [month], [day], [year]
		String[] f1 = b.getDate().split("/",3);// creates string array with length of 3 containing [month], [day], [year]
		
		String [] reserveTime = a.getReservationTime().split(":",2);//creates 1D array with length of 2 containing [hour], [minutes] 
		String [] departTime = b.getDepartureTime().split(":",2);//creates 1D array with length of 2 containing [hour], [minutes]
		String [] arriveTime = b.getArrivalTime().split(":",2);//creates 1D array with length of 2 containing [hour], [minutes]
		
		boolean isFull;
		
		//if time conflict
		if(Integer.parseInt(reserveTime[0]) < Integer.parseInt(arriveTime[0]) && Integer.parseInt(reserveTime[0]) > Integer.parseInt(departTime[0]) && c1[0] == f1[0] && c1[1] == f1[1]){
			System.out.println("There is a conflict between a previously booked flight and the one you are attempting to schedule.");
		
		//if same flight
		} else if(a.getReservationDate() == b.getDate() && a.getReservationTime() == b.getDepartureTime() && a.getHasReservation() == b.getReserved()) {
			System.out.println("This flight is already booked.");
		
		//if flight is full
		} else if(b.numOfPassengers == b.maxPassengers) {
			System.out.println("This flight is already full.");
			isFull = true;
		
		//flight is booked
		} else {
		a.setHasReservation(true);
		a.setReservationDate(b.getDate());//set customer reservation date to flight date
		a.setHasReservation(true);//set customer reservation time to flight time
		this.numOfPassengers++;//add passenger to flight
		}//if
		
	}//bookflight
	
	public void setMaxPass (int maxPass) {
		this.maxPassengers = maxPassengers;
	}
	
		//get fight information
		public String getFlightInfo(int flightNum, String date, String departureTime, String departingCity, String arrivingCity) {
				return "Flight Number is " + flightNum + ", date is " + date + ", departureTime is " + departureTime + ", departing from " + departingCity + ", arriving at " + arrivingCity; 
		}


		public int getMaxPassengers() {
			return maxPassengers;
		}



		public void setDepartingCity(String departingCity) {
			this.departingCity = departingCity;
		}

		public void setArrivingCity(String arrivingCity) {
			this.arrivingCity = arrivingCity;
		}

		
	}
