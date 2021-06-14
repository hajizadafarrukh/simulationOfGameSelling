package Entities;

public class Campaign {
	
	private int campId;
	private String campName;
	private int discount;
	
	public Campaign(int campId, String campName, int discount) {
		super();
		this.campId = campId;
		this.campName = campName;
		this.discount = discount;
	}
	public int getCampId() {
		return campId;
	}
	public void setCampId(int campId) {
		this.campId = campId;
	}
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
