package com.indranil.fundnamental;

class Flight2 {
    public short seats = 150;
    public short engines = 2;

    public void add1Seat() {
        this.seats ++;
    }

    public void add1Engine() {
        this.engines ++;
    }
}

class CargoFlight2 extends Flight2 {
    public short seats = 12;
    public short engines = 4;

    public void add1Engine() {
        this.engines ++;
    }
}

public class DataHiding {

    public void execute() {
        Flight2 f1 = new Flight2();
        System.out.println(String.format("2a> Flight2 f1: Seats => %s , Engines => %s", f1.seats, f1.engines));
        f1.add1Seat();
        f1.add1Engine();
        System.out.println(String.format("2a> Flight2 f1 [after +1 seat]: Seats => %s, Engines => %s", f1.seats, f1.engines));

        CargoFlight2 f2 = new CargoFlight2();
        System.out.println(String.format("2b> CargoFlight2 f2: Seats => %s, Engines => %s", f2.seats, f2.engines)); //Child's variable is accessed
        f2.add1Seat(); //parent's method is accessed (since child didn't override it)
        f2.add1Engine(); //child's method is accessed (since child overrode)
        System.out.println(String.format("2b> CargoFlight2 f2 [after +1 seat]: Seats => %s, Engines => %s", f2.seats, f2.engines));

        Flight2 f3 = new CargoFlight2(); //Parent's variable is accessed
        System.out.println(String.format("2c> Flight2 f3 (from CargoFlight2 reference): Seats => %s, Engines => %s", f3.seats, f3.engines));
        f3.add1Seat(); //parent's method is accessed (child didn't override)
        f3.add1Engine(); //child's method is accessed (as child overrode)
        System.out.println(String.format("2c> Flight2 f3 (from CargoFlight2 reference)[after +1 seat]: Seats => %s, Engines => %s", f3.seats, f3.engines)); //Only parent's variable is shown
    }
}
