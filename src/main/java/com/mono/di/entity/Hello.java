package com.mono.di.entity;

import com.mono.di.ui.Printer;

public class Hello {

    private Printer printer;
    private String name;

    public Hello() {

    }

    public Hello(Printer printer, String name) {
        this.printer = printer;
        this.name = name;

        System.out.println("생성자 인젝션");
    }

    public void print(String message) {
        // System.out.println(this.name);
        if (this.name == null) {
            printer.print(message);
        }
        else {
            printer.print(String.format("Message : %s %s", name, message));
        }
    }


    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "printer=" + printer +
                ", name='" + name + '\'' +
                '}';
    }
}
