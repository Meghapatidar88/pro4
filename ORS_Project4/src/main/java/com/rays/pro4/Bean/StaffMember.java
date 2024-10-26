package com.rays.pro4.Bean;

import java.time.LocalDate;

public class StaffMember extends BaseBean {
	private String Identifier;
	private String FullName;
	private LocalDate JoiningDate;
	private String division;
	private String PreviousEmployer;


	public String getIdentifier() {
		return Identifier;
	}

	public void setIdentifier(String identifier) {
		Identifier = identifier;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public LocalDate getJoiningDate() {
		return JoiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		JoiningDate = joiningDate;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPreviousEmployer() {
		return PreviousEmployer;
	}

	public void setPreviousEmployer(String previousEmployer) {
		PreviousEmployer = previousEmployer;
	}

	@Override
	public String getkey() {
		// TODO Auto-generated method stub
		return "id";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "Firstname";
	}

	
}
