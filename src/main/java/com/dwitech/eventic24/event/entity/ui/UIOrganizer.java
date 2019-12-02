package com.dwitech.eventic24.event.entity.ui;

import java.util.List;

public class UIOrganizer {
    private String code;
    private String emailAddress;
    private String firstname;
    private String lastname;
    private String msisdn;
    private String organization;
    private List<UIEvent> events;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public List<UIEvent> getEvents() { return events; }
    public void setEvents(List<UIEvent> events) { this.events = events; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    public String getMsisdn() { return msisdn; }
    public void setMsisdn(String msisdn) { this.msisdn = msisdn; }

    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }

    @Override
    public String toString() {
        return "UIOrganizer{" +
                       "code='" + code + '\'' +
                       ", emailAddress='" + emailAddress + '\'' +
                       ", firstname='" + firstname + '\'' +
                       ", lastname='" + lastname + '\'' +
                       ", msisdn='" + msisdn + '\'' +
                       ", organization='" + organization + '\'' +
                       ", events=" + events +
                       '}';
    }
}
