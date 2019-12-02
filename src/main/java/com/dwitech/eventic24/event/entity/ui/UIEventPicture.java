package com.dwitech.eventic24.event.entity.ui;

public class UIEventPicture {
    private String path;

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

    @Override
    public String toString() {
        return "UIEventPicture{" +
                       "path='" + path + '\'' +
                       '}';
    }
}
