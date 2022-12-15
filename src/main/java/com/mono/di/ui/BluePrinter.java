package com.mono.di.ui;

public class BluePrinter implements Printer {
    @Override
    public void print(String message) {

        System.out.println("------------------BluePrinter Stars------------------");
        System.out.println(message);
        System.out.println("------------------BluePrinter Ends------------------");
    }
}