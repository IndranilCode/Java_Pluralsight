package com.indranil.fundnamental;

public class Main {

    public static void main(String[] args) {
        //1. Basic inheritence
        System.out.println("1. Basic Inheritence -------------------------------");
        new BasicInheritence().execute();

        //2. Data hiding
        System.out.println("2. Data hiding -------------------------------------");
        new DataHiding().execute();

        //3. Implicit method override
        System.out.println("3. Implicit method override ------------------------");
        new ImplicitMethodOverride().execute();

        //4. Explicit method override (@Override)
        System.out.println("4. Explicit method override ------------------------");
        new ExplicitMethodOverride().execute();

        //5. Object class
        System.out.println("5. Object class ------------------------------------");
        new ObjectClassDemo().execute();
    }
}
