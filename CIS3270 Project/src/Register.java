import java.util.*;
public class Register {

	
	private StringBuilder firstName;
	private StringBuilder lastName;
	private StringBuilder username;
	private StringBuilder password;
	private StringBuilder address;
	private int customerID;
	private int zip;
	private StringBuilder state;
	private StringBuilder email;
	private StringBuilder ssn;
	private StringBuilder question;
	private StringBuilder answer;
	
	Register(){
		firstName = new StringBuilder("John");
		lastName = new StringBuilder ("Doe");
		customerID = (int) (1000*Math.random()+100);
	}//no arg
	
	Register(StringBuilder first, StringBuilder last, StringBuilder user, StringBuilder pass, StringBuilder address, int iD, int zip, StringBuilder state, StringBuilder email, StringBuilder ssn, StringBuilder question, StringBuilder answer){
		firstName = first;
		lastName = last;
		username = user;
		password = pass;
		this.address = address;
		customerID = iD;
		this.zip = zip;
		this.state = state;
		this.email = email;
		this.ssn = ssn;
		this.question = question;
		this.answer = answer;
		
		
	}//multiple arg
	
	
	StringBuilder getFirstName() {
		return firstName;
	}
	void setFirstName(StringBuilder firstName) {
		this.firstName = firstName;
	}
	StringBuilder getLastName() {
		return lastName;
	}
	void setLastName(StringBuilder lastName) {
		this.lastName = lastName;
	}
	StringBuilder getUsername() {
		return username;
	}
	void setUsername(StringBuilder username) {
		this.username = username;
	}
	StringBuilder getPassword() {
		return password;
	}
	void setPassword(StringBuilder password) {
		this.password = password;
	}
	StringBuilder getAddress() {
		return address;
	}
	void setAddress(StringBuilder address) {
		this.address = address;
	}
	int getZip() {
		return zip;
	}
	void setZip(int zip) {
		this.zip = zip;
	}
	
	int getcustomerID() {
		return customerID;
	}

	void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	StringBuilder getState() {
		return state;
	}
	void setState(StringBuilder state) {
		this.state = state;
	}
	StringBuilder getEmail() {
		return email;
	}
	void setEmail(StringBuilder email) {
		this.email = email;
	}
	StringBuilder getSsn() {
		return ssn;
	}
	void setSsn(StringBuilder ssn) {
		this.ssn = ssn;
	}
	StringBuilder getQuestion() {
		return question;
	}
	void setQuestion(StringBuilder question) {
		this.question = question;
	}
	StringBuilder getAnswer() {
		return answer;
	}
	void setAnswer(StringBuilder answer) {
		this.answer = answer;
	}

	
	
	
}//Register
