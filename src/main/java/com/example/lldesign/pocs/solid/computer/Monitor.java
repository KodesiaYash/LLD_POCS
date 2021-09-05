package com.example.lldesign.pocs.solid.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Monitor {
    private String brand;
    private String model;
    private String screenSize;
    private String screenType;
}
