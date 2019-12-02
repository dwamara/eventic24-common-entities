package com.dwitech.eventic24.event.entity;

import com.dwitech.eventic24.CoreResponse;
import com.dwitech.eventic24.event.entity.ui.UIEvent;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class CreateEventResponse extends CoreResponse {
	private UIEvent event;

	public CreateEventResponse(Set<? extends ConstraintViolation<?>> violations) {
		super(violations);
	}
	public CreateEventResponse() { super(); }

	public void setEvent(UIEvent event) { this.event = event; }
	public UIEvent getEvent() {
		return event;
	}

	@Override
	public String toString() {
		return "CreateEventResponse{" +
				       "event=" + event +
				       ", success=" + success +
				       ", status='" + status + '\'' +
				       ", message='" + message + '\'' +
				       ", logTag='" + logTag + '\'' +
				       '}';
	}
}
