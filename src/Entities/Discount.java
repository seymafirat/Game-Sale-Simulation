package Entities;

public class Discount {
	private int discountId;
	private String discountName;
	
	public Discount(int discountId, String discountName) {
		super();
		this.discountId = discountId;
		this.discountName = discountName;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
}
