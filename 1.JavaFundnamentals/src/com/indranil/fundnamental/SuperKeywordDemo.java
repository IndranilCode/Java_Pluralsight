package com.indranil.fundnamental;

class Flight7 {
    int seats = 150;

    public void displayMessage() {
        System.out.println("Flight7.displayMessage called");
    }
}

class Cargo7 extends Flight7 {
    int seats = 12;

    @Override
    public void displayMessage() {
        super.displayMessage(); //NOTE: super calls base class method
        System.out.println("Cargo7.displayMessage called");
    }
}

public class SuperKeywordDemo {
    public void execute() {
        Cargo7 c7 = new Cargo7();
        c7.displayMessage();
    }
}
