package com.example.lldesign.pocs.solid.computer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CPU {
    private String motherBoard;
    private Processor processor;
    private String ram;
    private String rom;
}
