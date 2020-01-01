package com.indranil.fundnamental;

class PilotBase2 {
    public PilotBase2() { System.out.println("PilotBase2 default const called"); }
    public PilotBase2(String msg1) { System.out.println(String.format("PilotBase2 1 param const called. Msg : {%s}", msg1)); }
}

class CargoPilot2 extends PilotBase2 {
    public CargoPilot2() { System.out.println("CargoPilot2 default const called"); } //NOTE: Calling this by default calls base 1st then this

    public CargoPilot2(String msg1) {
        super(msg1);
        System.out.println(String.format("CargoPilot2 1 param const called. Msg : {%s}", msg1));
    }

    public CargoPilot2(String msg1, String msg2) {
        this(msg1);
        System.out.println(String.format("CargoPilot2 2 param const called. Msg1 : {%s} , Msg2 : {%s}", msg1, msg2));
    }
}

public class ConstructorInheritenceOrder {
    public void execute() {
        //Only default constructor
        CargoPilot2 cp1 = new CargoPilot2();

        CargoPilot2 cp2 = new CargoPilot2("Hello");

        CargoPilot2 cp3 = new CargoPilot2("Hello", "Indranil");
    }
}
