package Entities;

public class User {
	private int userId;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int DateYear;
	
	public User(int userId, String firstName, String lastName, int dateYear,String nationalityId) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		DateYear = dateYear;
		this.nationalityId = nationalityId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateYear() {
		return DateYear;
	}
	public void setDateYear(int dateYear) {
		DateYear = dateYear;
	}
}
