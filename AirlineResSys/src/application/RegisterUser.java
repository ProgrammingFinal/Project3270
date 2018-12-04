package application;

public class RegisterUser {

	
	String firstName;
	String lastName;
	private String username;
	private String password;
	private String address;
	private int customerID;
	private int zip;
	private String state;
	private String email;
	private String ssn;
	private String question;
	private String answer;
	
	RegisterUser(){
		firstName = new String("John");
		lastName = new String ("Doe");
		customerID = (int) (1000*Math.random()+100);
	}//no arg
	
	RegisterUser(String first, String last, String user, String pass, String address, int iD, int zip, String state, String email, String ssn, String question, String answer){
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
	
	
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String getUsername() {
		return username;
	}
	void setUsername(String username) {
		this.username = username;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
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
	
	String getState() {
		return state;
	}
	void setState(String state) {
		this.state = state;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getSsn() {
		return ssn;
	}
	void setSsn(String ssn) {
		this.ssn = ssn;
	}
	String getQuestion() {
		return question;
	}
	void setQuestion(String question) {
		this.question = question;
	}
	String getAnswer() {
		return answer;
	}
	void setAnswer(String answer) {
		this.answer = answer;
	}

	
	
	
}//Register