package com.dwitech.eventic24.organizer.entity.ui;

import com.dwitech.eventic24.CoreResponse;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.Response;
import java.util.Set;

public class ChangePasswordResponse extends CoreResponse {
    private UIOrganizer uiOrganizer;

    public ChangePasswordResponse() { }
    public ChangePasswordResponse(Response.Status status, String message) { super(status, message); }
    public ChangePasswordResponse(Set<? extends ConstraintViolation<?>> violations) { super(violations); }

    public UIOrganizer getUiOrganizer() { return uiOrganizer; }
    public void setUiOrganizer(UIOrganizer uiOrganizer) { this.uiOrganizer = uiOrganizer; }
}
