package com.indranil.fundnamental;

final class Flight8 { }

//NOTE: Inherit from final class Fligh8 Not-allowed
//class CargoFlight8 extends Flight8 {
//}

class Flight8b {
    public void display1() { System.out.println("Flight8b.display1 called"); }
    public final void display2() { System.out.println("Flight8b.display2 called"); } //Method marked final cannot be overridden
}

class CargoFlight8b extends Flight8b {
    @Override
    public void display1() { System.out.println("Flight8b.display1 called"); }
    //public final void display2() { System.out.println("Flight8b.display2 called"); } //Base method marked final cannot be overridden
}

public class FinalKeywordDemo {
    public void execute() {
        System.out.println("8a> Flight8 is final : cant be inherited from");
        System.out.println("8b> Flight8b.display2 is final : cant be overridden from");
    }
}
