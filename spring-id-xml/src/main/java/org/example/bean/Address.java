package org.example.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String streetName="79 park avenue.";

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
