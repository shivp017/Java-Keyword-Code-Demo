package com.stackroute.oops;
//program to add number using polymorphism
public class Polymorphism {

    //method overloading
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    void run() {
        System.out.println("Added result");
    }
}

class TestOverloading2 extends Polymorphism {
    public static void main(String[] args) {
        System.out.println(Polymorphism.add(10, 10));
        System.out.println(Polymorphism.add(12.4, 12.6));
        Polymorphism polymorphism = new Polymorphism();//method overidden
        polymorphism.run();
    }
}

