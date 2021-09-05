package com.example.lldesign.pocs.solid.computer;

public class IntelProcessor implements Processor{

    private String frequency ="2ghz";
    private int heatingCoeff = 5;
    @Override
    public void run() {
        System.out.println("Intel processor is running with frq " + frequency);
    }

    @Override
    public void heat() {
        System.out.println("Intel processor is heated to " + (10*heatingCoeff));
    }
}
