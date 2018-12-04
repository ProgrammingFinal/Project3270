package application;

public class Seat {

	int seatNum;
	boolean isBooked;

	public Seat() {
	}

	public Seat(int seatNum, boolean isBooked) {
		this.seatNum = seatNum;
		this.isBooked = isBooked;
	}

	public void setBooked() {
		boolean isBooked = true;
	}

	public boolean getIsBooked() {
		return isBooked;
	}

	public boolean cancelBooked() {
		return isBooked == false;
	}

	public int getSeatNum(int seatNum) {
		return this.seatNum = seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
}