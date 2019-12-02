package com.dwitech.eventic24.organizer.entity.ui;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class LoginRequest implements Serializable {
    @NotBlank(message="emailAddress is missing in request") private String emailAddress;
    @NotBlank(message="password is missing in request") private String password;

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
