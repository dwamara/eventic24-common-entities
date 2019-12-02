package com.dwitech.eventic24.organizer.entity.ui;

import com.dwitech.eventic24.CoreResponse;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.Response;
import java.util.Set;

public class ActivateOrganizerResponse extends CoreResponse {
    private UIOrganizer uiOrganizer;
    public ActivateOrganizerResponse(Set<? extends ConstraintViolation<?>> violations) {
        super(violations);
    }

    public ActivateOrganizerResponse() {

    }
    public ActivateOrganizerResponse(Response.Status status, String message) {
        super(status, message);
    }

    public UIOrganizer getUiOrganizer() { return uiOrganizer; }
    public void setUiOrganizer(UIOrganizer uiOrganizer) { this.uiOrganizer = uiOrganizer; }
}
