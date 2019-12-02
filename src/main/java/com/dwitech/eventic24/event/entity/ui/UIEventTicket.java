package com.dwitech.eventic24.event.entity.ui;

import javax.json.bind.annotation.JsonbTransient;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class UIEventTicket {
    private String description;
    private BigDecimal price;
    private boolean validYn;
    private Timestamp validUntil;
    @JsonbTransient private UIEvent event;
    private String currency;

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public boolean isValidYn() { return validYn; }
    public void setValidYn(boolean validYn) { this.validYn = validYn; }

    public Timestamp getValidUntil() { return validUntil; }
    public void setValidUntil(Timestamp validUntil) { this.validUntil = validUntil; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public UIEvent getEvent() { return event; }
    public void setEvent(UIEvent event) { this.event = event; }

    @Override
    public String toString() {
        return "UIEventTicket{" +
                       "description='" + description + '\'' +
                       ", price=" + price +
                       ", validYn=" + validYn +
                       ", validUntil=" + validUntil +
                       ", event=" + event +
                       ", currency='" + currency + '\'' +
                       '}';
    }
}
