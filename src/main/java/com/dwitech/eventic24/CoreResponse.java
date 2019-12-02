package com.dwitech.eventic24;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.Response.Status;
import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;

import static javax.ws.rs.core.Response.Status.BAD_REQUEST;

public class CoreResponse implements Serializable {
	protected boolean success = false;
	protected String status;
	protected String message;
	protected String logTag;

	protected CoreResponse(Set<? extends ConstraintViolation<?>> violations) {
		new CoreResponse(violations, null);
	}

	protected CoreResponse(Set<? extends ConstraintViolation<?>> violations, final String logTag) {
		this.setStatus(BAD_REQUEST);
		this.setLogTag(logTag);
		this.message = violations.stream()
				.map(ConstraintViolation::getMessage)
				.collect(Collectors.joining(", "));
	}

	protected CoreResponse(Status status, String message) {
		this.setStatus(status);
		this.message = message;
	}

	public CoreResponse() { }

	public String getMessage() { return message; }
	public void setMessage(String message) { this.message = message; }

	public String getStatus() { return status; }
	public void setStatus(Status status) { this.status = status.name(); }

	public boolean isSuccess() { return success; }
	public void setSuccess(boolean success) { this.success = success; }

	public String getLogTag() { return logTag; }
	public void setLogTag(String logTag) { this.logTag = " " + logTag; }
}
