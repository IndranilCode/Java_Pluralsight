package com.indranil.fundnamental;

class Flight6 {
    int seats;
    int passengers;

    //NOTE: Only parameterized construction w/o default is not allowed
    public Flight6(int seats, int passengers) {
        this.seats = seats;
        this.passengers = passengers;
    }

    public Flight6() { }
}

class Flight6OverriddenEquals {
    int seats;
    int passengers;

    //NOTE: Only parameterized construction w/o default is not allowed
    public Flight6OverriddenEquals(int seats, int passengers) {
        this.seats = seats;
        this.passengers = passengers;
    }

    public Flight6OverriddenEquals() { }

    @Override
    public boolean equals(Object var1) {
        if (! (var1 instanceof Flight6OverriddenEquals)) {
            return false;
        }

        Flight6OverriddenEquals o = (Flight6OverriddenEquals)var1;
        return this.seats == o.seats && this.passengers == o.passengers;
    }
}

public class ObjectEqualityCheck {
    public void execute() {
        Flight6 f1 = new Flight6(150, 10);
        Flight6 f2 = new Flight6(150, 10);
        System.out.println(String.format("6a> Is Flight6 f1 == f2 => %s [because this is reference =]", f1==f2));
        System.out.println(String.format("6a> Is Flight6 f1.equals(f2) => %s [because this is reference =]", f1.equals(f2)));

        Flight6OverriddenEquals f3 = new Flight6OverriddenEquals(150, 10);
        Flight6OverriddenEquals f4 = new Flight6OverriddenEquals(150, 10);
        Flight6OverriddenEquals f5 = new Flight6OverriddenEquals(151, 11);
        System.out.println(String.format("6b> Is Flight6OverriddenEquals f3 == f4 => %s [because this is reference =]", f3==f4));
        System.out.println(String.format("6b> Is Flight6OverriddenEquals f3.equals(f4) => %s [because equals is overrode]", f3.equals(f4)));
        System.out.println(String.format("6b> Is Flight6OverriddenEquals f3 == f5 => %s [because this is reference =]", f3==f5));
        System.out.println(String.format("6b> Is Flight6OverriddenEquals f3.equals(f5) => %s [because equals is overrode]", f3.equals(f5)));
    }
}
