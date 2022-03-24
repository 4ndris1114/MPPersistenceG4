package model;

public class Entity {
	
	private String fname;
	private String lname;
	private String address;
	private int zipcode;
	private String city;
	private int phoneNo;
	private String email;
	private double salary;
	private EntityType.type entityType;
	
	
	//Constructor for Customer type / Supplier type
	public Entity (String fname, String lname, int phoneNo, String email, EntityType.type entityType) {
		this.fname = fname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.entityType = entityType;
	}
	
	//Constructor for Employee
	public Entity (String fname, String lname, int phoneNo, String email, double salary, EntityType.type entityType) {
		this.fname = fname;
		this.lname = lname;
		this.phoneNo = phoneNo;
		this.email = email;
		this.salary = salary;
		this.entityType = entityType;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the phoneNo
	 */
	public int getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
