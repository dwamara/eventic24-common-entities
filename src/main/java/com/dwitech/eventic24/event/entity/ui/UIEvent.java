package com.dwitech.eventic24.event.entity.ui;

import javax.json.bind.annotation.JsonbTransient;
import java.util.List;

public class UIEvent {
    private String code;
    private String deletedYn;
    private String description;
    private UIAddress address;
    private UIOrganizer organizer;
    private String type;
    @JsonbTransient private List<UIEventPicture> eventPictures;
    @JsonbTransient private List<UIEventTicket> eventTickets;
    @JsonbTransient private List<UIEventTime> eventTimes;
    private String qrCode;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDeletedYn() { return deletedYn; }
    public void setDeletedYn(String deletedYn) { this.deletedYn = deletedYn; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public UIAddress getAddress() { return address; }
    public void setAddress(UIAddress address) { this.address = address; }

    public UIOrganizer getOrganizer() { return organizer; }
    public void setOrganizer(UIOrganizer organizer) { this.organizer = organizer; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public List<UIEventPicture> getEventPictures() { return eventPictures; }
    public void setEventPictures(List<UIEventPicture> eventPictures) { this.eventPictures = eventPictures; }

    public List<UIEventTicket> getEventTickets() { return eventTickets; }
    public void setEventTickets(List<UIEventTicket> eventTickets) { this.eventTickets = eventTickets; }

    public List<UIEventTime> getEventTimes() { return eventTimes; }
    public void setEventTimes(List<UIEventTime> eventTimes) { this.eventTimes = eventTimes; }

    public String getQrCode() { return qrCode; }
    public void setQrCode(String qrCode) { this.qrCode = qrCode; }

    @Override
    public String toString() {
        return "UIEvent{" +
                       "code='" + code + '\'' +
                       ", deletedYn='" + deletedYn + '\'' +
                       ", description='" + description + '\'' +
                       ", address=" + address +
                       ", organizer=" + organizer +
                       ", type='" + type + '\'' +
                       ", eventPictures=" + eventPictures +
                       ", eventTickets=" + eventTickets +
                       ", eventTimes=" + eventTimes +
                       ", qrCode='" + qrCode + '\'' +
                       '}';
    }
}
