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

        //6. Object equality check
        System.out.println("6. Object equality check ---------------------------");
        new ObjectEqualityCheck().execute();

        //7. Super keyword demo
        System.out.println("7. Super keyword -----------------------------------");
        new SuperKeywordDemo().execute();

        //8. Final keyword demo
        System.out.println("8. Final keyword -----------------------------------");
        new FinalKeywordDemo().execute();

        //9. Final keyword demo
        System.out.println("9. Abstract demo -----------------------------------");
        new AbstractDemo().execute();

        //10. Constructor inheritence order demo
        System.out.println("10. Constructor inheritence order demo ------------");
        new ConstructorInheritenceOrder().execute();
    }
}
