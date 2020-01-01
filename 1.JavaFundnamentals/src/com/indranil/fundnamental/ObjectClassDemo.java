package com.indranil.fundnamental;

class Flight5 {
    int seats = 150;

    public void add1Seat() {
        this.seats ++;
    }
}

class CargoFlight5 extends Flight5 {
    int seats = 12;
    int parcels = 1000;

    public void add1Parcel() {
        this.parcels ++;
    }
}

public class ObjectClassDemo {
    public void execute() {
        //Object array can contain any objects
        System.out.println("5a> Object array can contain any objects -> as all classes derive from object");
        Object[] stuffs = new Object[3];
        stuffs[0] = new Flight5();
        stuffs[1] = new CargoFlight5();
        stuffs[2] = new Object();

        System.out.println("5b> Object from Flight5 reference");
        Object o = new Flight5();
        //o.add1Seat(); //Not allowed
        //Flight5 f = o; //Not allowed
        o = new CargoFlight5(); //Allowed : Re-pointing o to another object
        //o.add1Parcel(); //Not allowed

        //Casting from objects : This is possible
        System.out.println("5c> Casting object to Flight5");
        Object o2 = new Flight5();
        if(o2 instanceof Flight5) {
            Flight5 flight5 = (Flight5)o2;
            flight5.add1Seat();
            System.out.println(String.format("5c> Flight5 flight5 : Seats => %s", flight5.seats));
        }
    }
}
