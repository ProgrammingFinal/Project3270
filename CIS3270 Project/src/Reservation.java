import java.util.Date;

class Reservation {

	private Date dateReserved;
	private Date dateOfFlight;
	private int reservationNum;
	private int flightNum;
	private String provider;
	private String depart;
	private String arrive;
	
	Reservation() {
		reservationNum = (int) (2000*Math.random()+1000);//random number between 1000 and 1999
		flightNum = (int) (3000*Math.random()+2000);//random number between 2000 and 2999
	}//no arg 
	
	Reservation(Date dateReserved, Date dateOfFlight, int reservationNum, int flightNum, String provider, String depart, String arrive){
		this.dateReserved = dateReserved;
		this.dateOfFlight = dateOfFlight;
		this.reservationNum = reservationNum;
		this.flightNum = flightNum;
		this.provider = provider;
		this.depart = depart;
		this.arrive = arrive;
	}//multiple arg constructor

	Date getDateReserved() {
		return dateReserved;
	}

	void setDateReserved(Date dateReserved) {
		this.dateReserved = dateReserved;
	}

	Date getDateOfFlight() {
		return dateOfFlight;
	}

	void setDateOfFlight(Date dateOfFlight) {
		this.dateOfFlight = dateOfFlight;
	}

	int getReservationNum() {
		return reservationNum;
	}

	void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}

	String getProvider() {
		return provider;
	}

	void setProvider(String provider) {
		this.provider = provider;
	}

	String getDepart() {
		return depart;
	}

	void setDepart(String depart) {
		this.depart = depart;
	}

	String getArrive() {
		return arrive;
	}

	void setArrive(String arrive) {
		this.arrive = arrive;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
