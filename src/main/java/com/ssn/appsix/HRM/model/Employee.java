package com.ssn.appsix.HRM.model;

import java.util.List;

public class Employee {
	
	private String employeeId;
	
	private String firstName;
	 
	private String lastName;
 
	private String department;
 
	private String additionalNotes;
	
	
	private String gender;
	
	
	private boolean visaApproved = true;
	
	private List<String> languagesKnown;
	 
	private List<String> hobbies;
	private List<String> qualifications;
 
	private List<String> socialProfiles;
	
	private String paymentMode;
	

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAdditionalNotes() {
		return additionalNotes;
	}

	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}

	
	





	
	public Employee(String employeeId, String firstName, String lastName, String department, String additionalNotes,
			String gender, boolean visaApproved, List<String> languagesKnown, List<String> hobbies,
			List<String> qualifications, List<String> socialProfiles, String paymentMode) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.additionalNotes = additionalNotes;
		this.gender = gender;
		this.visaApproved = visaApproved;
		this.languagesKnown = languagesKnown;
		this.hobbies = hobbies;
		this.qualifications = qualifications;
		this.socialProfiles = socialProfiles;
		this.paymentMode = paymentMode;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}

	public Employee() {
		super();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public List<String> getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(List<String> languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<String> getSocialProfiles() {
		return socialProfiles;
	}

	public void setSocialProfiles(List<String> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}

	public boolean isVisaApproved() {
		return visaApproved;
	}

	public void setVisaApproved(boolean visaApproved) {
		this.visaApproved = visaApproved;
	}
	
	
	
}
