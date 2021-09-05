package com.example.lldesign.pocs.solid.computer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BezelLessMonitor extends Monitor{
    // brand, model,screenSize, screenType
    private String bezelSize;
    public BezelLessMonitor(String brand, String model, String screenSize, String screenType, String bezelSize) {
        super(brand, model, screenSize, screenType);
        this.bezelSize = bezelSize;
    }
}