package com.stackroute.oops;

public class Polymorphism {

    //method overloading
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(Polymorphism.add(11,11));
        System.out.println(Polymorphism.add(12.3,12.6));
    }}

