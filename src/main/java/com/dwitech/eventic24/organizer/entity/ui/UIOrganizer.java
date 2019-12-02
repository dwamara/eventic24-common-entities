package com.dwitech.eventic24.organizer.entity.ui;

public class UIOrganizer {
	private String code;
	private String firstname;
	private String lastname;
	private String organization;
	private String emailAddress;
	private String msisdn;
	private String verificationToken;

	public String getCode() { return code; }
	public void setCode(String code) { this.code = code; }

	public String getFirstname() { return firstname; }
	public void setFirstname(String firstname) { this.firstname = firstname; }

	public String getLastname() { return lastname; }
	public void setLastname(String lastname) { this.lastname = lastname; }

	public String getOrganization() { return organization; }
	public void setOrganization(String organization) { this.organization = organization; }

	public String getEmailAddress() { return emailAddress; }
	public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

	public String getMsisdn() { return msisdn; }
	public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

	public String getVerificationToken() { return verificationToken; }
	public void setVerificationToken(String verificationToken) { this.verificationToken = verificationToken; }

	@Override
	public String toString() {
		return "UIOrganizer{" +
				       "code='" + code + '\'' +
				       ", firstname='" + firstname + '\'' +
				       ", lastname='" + lastname + '\'' +
				       ", organization='" + organization + '\'' +
				       ", emailAddress='" + emailAddress + '\'' +
				       ", msisdn='" + msisdn + '\'' +
				       ", verificationToken='" + verificationToken + '\'' +
				       '}';
	}
}
