package com.dwitech.eventic24.event.entity.ui;

import javax.json.bind.annotation.JsonbTransient;
import java.sql.Date;
import java.sql.Time;

public class UIEventTime {
    private Date dateStart;
    private Time timeStart;
    private Date dateEnd;
    private Time timeEnd;
    private String timezone;
    @JsonbTransient private UIEvent event;

    public Date getDateStart() { return dateStart; }
    public void setDateStart(Date dateStart) { this.dateStart = dateStart; }

    public Time getTimeStart() { return timeStart; }
    public void setTimeStart(Time timeStart) { this.timeStart = timeStart; }

    public Date getDateEnd() { return dateEnd; }
    public void setDateEnd(Date dateEnd) { this.dateEnd = dateEnd; }

    public Time getTimeEnd() { return timeEnd; }
    public void setTimeEnd(Time timeEnd) { this.timeEnd = timeEnd; }

    public String getTimezone() { return timezone; }
    public void setTimezone(String timezone) { this.timezone = timezone; }

    public UIEvent getEvent() { return event; }
    public void setEvent(UIEvent event) { this.event = event; }


    @Override
    public String toString() {
        return "UIEventTime{" +
                       "dateStart=" + dateStart +
                       ", timeStart=" + timeStart +
                       ", dateEnd=" + dateEnd +
                       ", timeEnd=" + timeEnd +
                       ", timezone='" + timezone + '\'' +
                       ", event=" + event +
                       '}';
    }

}
