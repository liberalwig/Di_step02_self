package com.mono.di.ui;

public class ColorPrinter implements Printer{
    @Override
    public void print(String message) {

        System.out.println("------------------ColorPrinter Stars------------------");
        System.out.println(message);
        System.out.println("------------------ColorPrinter Ends------------------");
    }
}