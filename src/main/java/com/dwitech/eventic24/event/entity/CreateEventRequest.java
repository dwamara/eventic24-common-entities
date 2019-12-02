package com.dwitech.eventic24.event.entity;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class CreateEventRequest implements Serializable {
	@NotBlank(message="organizerCode is missing in request") private String organizerCode;
	@NotBlank(message="description is missing in request") private String description;
	@NotBlank(message="type is missing in request") private String type;
	@NotBlank(message="address is missing in request") private String address;
	@NotBlank(message="dateStart is missing in request") private String dateStart;
	@NotBlank(message="dateEnd is missing in request") private String dateEnd;
	@NotBlank(message="timezone is missing in request") private String timezone;
	@NotBlank(message="ticketWording is missing in request") private String ticketWording;
	@NotBlank(message="ticketPrice is missing in request") private double ticketPrice;
	@NotBlank(message="currency is missing in request") private String currency;
	private String visual;
	private String timeStart;
	private String timeEnd;

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getType() { return type; }
	public void setType(String type) { this.type = type; }

	public String getVisual() { return visual; }
	public void setVisual(String visual) { this.visual = visual; }

	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	public String getDateStart() { return dateStart; }
	public void setDateStart(String dateStart) { this.dateStart = dateStart; }

	public String getTimeStart() { return timeStart; }
	public void setTimeStart(String timeStart) { this.timeStart = timeStart; }

	public String getDateEnd() { return dateEnd; }
	public void setDateEnd(String dateEnd) { this.dateEnd = dateEnd; }

	public String getTimeEnd() { return timeEnd; }
	public void setTimeEnd(String timeEnd) { this.timeEnd = timeEnd; }

	public String getTimezone() { return timezone; }
	public void setTimezone(String timezone) { this.timezone = timezone; }

	public String getTicketWording() { return ticketWording; }
	public void setTicketWording(String ticketWording) { this.ticketWording = ticketWording; }

	public double getTicketPrice() { return ticketPrice; }
	public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }

	public String getCurrency() { return currency; }
	public void setCurrency(String currency) { this.currency = currency; }

	public String getOrganizerCode() { return organizerCode; }
	public void setOrganizerCode(String organizerCode) { this.organizerCode = organizerCode; }

	@Override
	public String toString() {
		return "CreateEventRequest{" +
				"organizerCode='" + organizerCode + '\'' +
				", description='" + description + '\'' +
				", type='" + type + '\'' +
				", visual='" + visual + '\'' +
				", address='" + address + '\'' +
				", dateStart='" + dateStart + '\'' +
				", timeStart='" + timeStart + '\'' +
				", dateEnd='" + dateEnd + '\'' +
				", timeEnd='" + timeEnd + '\'' +
				", timezone='" + timezone + '\'' +
				", ticketWording='" + ticketWording + '\'' +
				", ticketPrice=" + ticketPrice +
				", currency='" + currency + '\'' +
				'}';
	}
}
