package com.indranil.fundnamental;

class Flight4 {
    public int getSeats() { return 150; }
}

class CargoFlight4 extends Flight4 {
    @Override
    public int getSeats() { return 12; }
}

public class ExplicitMethodOverride {
    public void execute() {
        Flight4 f1 = new Flight4();
        System.out.println(String.format("4a> Flight4 f1: Seats => %s", f1.getSeats()));

        CargoFlight4 f2 = new CargoFlight4();
        System.out.println(String.format("4b> CargoFlight4 f2: Seats => %s", f2.getSeats()));

        Flight4 f3 = new CargoFlight4(); //Childs method is accessed
        System.out.println(String.format("4c> Flight4 f3 (from CargoFlight4 reference): Seats => %s", f3.getSeats()));
    }
}
