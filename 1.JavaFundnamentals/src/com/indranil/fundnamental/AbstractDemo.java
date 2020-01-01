package com.indranil.fundnamental;

abstract class PilotBase {
    //Concrete method
    public void displayMessage1() {
        System.out.println("PilotBase.displayMessage1 called");
    }

    //Abstract method
    public abstract void displayMessage2();
}

class CargoPilot extends PilotBase {

    @Override
    public void displayMessage2() {
        System.out.println("CargoPilot.displayMessage2 called [overrode abstract method PilotBase.displayMessage2]");
    }
}

public class AbstractDemo {
    public void execute() {
        //PilotBase pb = new PilotBase(); //Not allowed
        System.out.println("9a> Abstract class PilotBase cannot be instantiated : can have concrete or abstract method");

        System.out.println("9b> CargoPilot inheriting abstract PilotBase has to implement abstract method");
        CargoPilot cb = new CargoPilot();
        cb.displayMessage1();
        cb.displayMessage2();
    }
}
