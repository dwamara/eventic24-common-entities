package com.dwitech.eventic24.event.entity.ui;

public class UIAddress {
    private String fullText;

    public String getFullText() { return fullText; }
    public void setFullText(String fullText) { this.fullText = fullText; }

    @Override
    public String toString() {
        return "UIAddress{" +
                       "fullText='" + fullText + '\'' +
                       '}';
    }
}
