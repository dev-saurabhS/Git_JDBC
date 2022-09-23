package com.ty.dto;

public class UserData {

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private long phone;
	private String dob;
	private String gender;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserData(String firstname, String lastname, String email, String password, long phone, String dob,
			String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.dob = dob;
		this.gender = gender;
	}

	public UserData() {
	}

	@Override
	public String toString() {
		return "UserData [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", phone=" + phone + ", dob=" + dob + ", gender=" + gender + "]";
	}

}
