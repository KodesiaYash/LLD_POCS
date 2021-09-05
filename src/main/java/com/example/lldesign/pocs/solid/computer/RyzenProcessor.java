package com.example.lldesign.pocs.solid.computer;

public class RyzenProcessor implements Processor {
    private String frequency = "5ghz";
    private int heatingCoeff = 6;
    @Override
    public void run() {
        System.out.println("Ryzen processor is running with frq " + frequency);
    }

    @Override
    public void heat() {
        System.out.println("Ryzen processor is heated to " + (10*heatingCoeff));
    }
}
