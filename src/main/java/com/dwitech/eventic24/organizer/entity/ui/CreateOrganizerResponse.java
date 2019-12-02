package com.dwitech.eventic24.organizer.entity.ui;

import com.dwitech.eventic24.CoreResponse;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.Response;
import java.util.Set;

public class CreateOrganizerResponse extends CoreResponse {
    private UIOrganizer uiOrganizer;

    public CreateOrganizerResponse() {
        super();
    }
    public CreateOrganizerResponse(Response.Status status, String message) { super(status, message); }
    public CreateOrganizerResponse(Set<? extends ConstraintViolation<?>> violations) {
        super(violations);
    }

    public UIOrganizer getUiOrganizer() { return uiOrganizer; }
    public void setUiOrganizer(UIOrganizer uiOrganizer) { this.uiOrganizer = uiOrganizer; }
}