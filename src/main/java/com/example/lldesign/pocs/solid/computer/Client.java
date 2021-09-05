package com.example.lldesign.pocs.solid.computer;

public class Client {
    public static void main(String args[]) {
        IntelProcessor intelProcessor = new IntelProcessor();
        Processor processor = decideProcessor(false);
        // LSP, DI
        CPU cpu = new CPU("Tomhawk",processor,"8gb","1tb");
        // Open-Close principle
        BezelLessMonitor bezelLessMonitor = new BezelLessMonitor("HP","24f","27","LED","thin");
        Computer computer = new Computer(cpu,bezelLessMonitor);
        computer.displayComputerDetails();
        System.out.println(computer.getMonitor().getBrand());
    }

    public static Processor decideProcessor(boolean value) {
        IntelProcessor intelProcessor = new IntelProcessor();
        RyzenProcessor ryzenProcessor = new RyzenProcessor();
        if(value)
            return intelProcessor;
        else
            return ryzenProcessor;
    }
}