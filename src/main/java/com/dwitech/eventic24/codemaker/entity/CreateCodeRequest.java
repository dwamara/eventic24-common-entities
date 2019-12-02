package com.dwitech.eventic24.codemaker.entity;

import javax.validation.constraints.NotBlank;

public class CreateCodeRequest {
    @NotBlank(message="codeType is missing in request") private String codeType;
    @NotBlank(message="eventCode is missing in request") private String eventCode;
    @NotBlank(message="organizerCode is missing in request") private String organizerCode;
    @NotBlank(message="codeContent is missing in request") private String codeContent;
    private String firstname;
    private String lastname;

    public String getCodeType() { return codeType; }
    public void setCodeType(String codeType) { this.codeType = codeType; }

    public String getCodeContent() { return codeContent; }
    public void setCodeContent(String codeContent) { this.codeContent = codeContent; }

    public String getEventCode() { return eventCode; }
    public void setEventCode(String eventCode) { this.eventCode = eventCode; }

    public String getOrganizerCode() { return organizerCode; }
    public void setOrganizerCode(String organizerCode) { this.organizerCode = organizerCode; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }

    @Override
    public String toString() {
        return "CreateCodeRequest{" +
                       "codeType='" + codeType + '\'' +
                       ", eventCode='" + eventCode + '\'' +
                       ", organizerCode='" + organizerCode + '\'' +
                       ", codeContent='" + codeContent + '\'' +
                       ", firstname='" + firstname + '\'' +
                       ", lastname='" + lastname + '\'' +
                       '}';
    }
}