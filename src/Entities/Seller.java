package Entities;

public class Seller extends User {

	private String sellerId;

	public Seller(int id, String email, String firstName, String lastName, String tcNumber, int yearOfBirth,
			String sellerId) {
		super(id, email, firstName, lastName, tcNumber, yearOfBirth);
		this.sellerId = sellerId;
	}

	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
