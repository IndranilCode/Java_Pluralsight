package com.indranil.fundnamental;

class Flight3 {
    public int getSeats() { return 150; }
}

class CargoFlight3 extends Flight3 {
    public int getSeats() { return 12; }
}

public class ImplicitMethodOverride {
    public void execute() {
        Flight3 f1 = new Flight3();
        System.out.println(String.format("3a> Flight3 f1: Seats => %s", f1.getSeats()));

        CargoFlight3 f2 = new CargoFlight3();
        System.out.println(String.format("3b> CargoFlight3 f2: Seats => %s", f2.getSeats()));

        Flight3 f3 = new CargoFlight3(); //Childs method is accessed
        System.out.println(String.format("3c> Flight3 f3 (from CargoFlight3 reference): Seats => %s", f3.getSeats()));
    }
}
