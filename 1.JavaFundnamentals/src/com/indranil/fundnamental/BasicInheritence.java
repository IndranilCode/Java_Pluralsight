package com.indranil.fundnamental;

class Flight {
    public short seats = 150;
    public short passenger = 0;

    public void add1Passenger() {
        this.passenger += 1;
    }
}

class CargoFlight extends Flight {
    public short parcels = 0;

    public void add1Parcel() {
        this.parcels += 1;
    }
}

public class BasicInheritence {

    public void execute() {
        Flight f1 = new Flight();
        f1.add1Passenger();
        System.out.println(String.format("1a> Flight f1: Passenger => %s", f1.passenger));

        CargoFlight f2 = new CargoFlight();
        f2.add1Passenger();
        f2.add1Parcel();
        System.out.println(String.format("1b> CargoFlight f2: Passenger => %s, Parcel => %s", f2.passenger, f2.parcels));

        Flight f3 = new CargoFlight(); //Note: Parents reference from child
        f3.add1Passenger();
        //f3.add1Parcel(); //Note: Not available
        //f3.parcel //Note: Not available
        System.out.println(String.format("Flight f3 (from CargoFlight reference): Passenger => %s", f3.passenger));

        //CargoFlight f4 = new Flight(); //Note: Compile error
    }
}
