package com.dwitech.eventic24.organizer.entity.ui;

import com.dwitech.eventic24.CoreResponse;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SearchOrganizersResponse extends CoreResponse {
    private List<UIOrganizer> uiOrganizers = new ArrayList<>();

    public SearchOrganizersResponse() { }
    public SearchOrganizersResponse(Response.Status status, String message) { super(status, message); }
    public SearchOrganizersResponse(Set<? extends ConstraintViolation<?>> violations) {
        super(violations);
    }

    public List<UIOrganizer> getUiOrganizers() { return uiOrganizers; }
    public void setUiOrganizers(List<UIOrganizer> uiOrganizers) { this.uiOrganizers = uiOrganizers; }
    public void setUiOrganizer(UIOrganizer uiOrganizer) { this.uiOrganizers.add(uiOrganizer); }
}
