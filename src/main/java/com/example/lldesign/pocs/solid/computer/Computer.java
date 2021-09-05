package com.example.lldesign.pocs.solid.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Computer {
    private CPU cpu;
    private Monitor monitor;
    public void displayComputerDetails() {
        System.out.println("Computer Details are");
        System.out.println(cpu.toString());
        System.out.println(monitor.toString());
        System.out.println(monitor.getBrand());
        cpu.getProcessor().heat();
        cpu.getProcessor().run();
    }
}
