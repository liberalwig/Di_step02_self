package com.mono.di.ui;

public class MonoPrinter implements Printer {
    @Override
    public void print(String message) {

        System.out.println("------------------MonoPrinter Stars------------------");
        System.out.println(message);
        System.out.println("------------------MonoPrinter Ends------------------");
    }
}