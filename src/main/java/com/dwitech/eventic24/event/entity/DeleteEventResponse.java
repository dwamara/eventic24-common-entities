package com.dwitech.eventic24.event.entity;

import com.dwitech.eventic24.CoreResponse;
import com.dwitech.eventic24.event.entity.ui.UIEvent;

public class DeleteEventResponse extends CoreResponse {
	private UIEvent event;

	public void setEvent(UIEvent event) { this.event = event; }
	public UIEvent getEvent() {
		return event;
	}


	@Override
	public String toString() {
		return "DeleteEventResponse{" +
				       "event=" + event +
				       ", success=" + success +
				       ", status='" + status + '\'' +
				       ", message='" + message + '\'' +
				       ", logTag='" + logTag + '\'' +
				       '}';
	}
}
