package Entities;

public class Gamer extends User{
	private String gamerNumber;

	public Gamer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gamer(int id, String email, String firstName, String lastName, String tcNumber, int yearOfBirth,String gamerNumber) {
		super(id, email, firstName, lastName, tcNumber, yearOfBirth);
		this.gamerNumber=gamerNumber;
		
	}

	public String getgamerNumber() {
		return gamerNumber;
	}

	public void setgamerNumber(String gamerNumber) {
		this.gamerNumber = gamerNumber;
	}
}
