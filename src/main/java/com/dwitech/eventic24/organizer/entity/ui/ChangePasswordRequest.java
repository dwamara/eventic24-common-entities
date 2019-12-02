package com.dwitech.eventic24.organizer.entity.ui;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ChangePasswordRequest implements Serializable {
    @NotBlank(message="oldPassword is missing in request") private String oldPassword;
    @NotBlank(message="newPassword is missing in request") private String newPassword;
    @NotBlank(message="emailAddress is missing in request") private String emailAddress;

    public String getOldPassword() { return oldPassword; }
    public void setOldPassword(String oldPassword) { this.oldPassword = oldPassword; }

    public String getNewPassword() { return newPassword; }
    public void setNewPassword(String newPassword) { this.newPassword = newPassword; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
}
