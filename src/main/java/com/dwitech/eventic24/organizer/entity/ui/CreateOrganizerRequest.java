package com.dwitech.eventic24.organizer.entity.ui;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class CreateOrganizerRequest implements Serializable {
    @NotBlank(message="firstname is missing in request") private String firstname;
    @NotBlank(message="lastname is missing in request") private String lastname;
    @NotBlank(message="emailAddress is missing in request") private String emailAddress;
    @NotBlank(message="password is missing in request") private String password;
    @NotBlank(message="msisdn is missing in request") private String msisdn;
    private String organization;

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getMsisdn() { return msisdn; }
    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }
}