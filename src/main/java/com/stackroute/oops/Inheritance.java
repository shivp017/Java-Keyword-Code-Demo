package com.stackroute.oops;

public class Inheritance {

        void eat(){
            System.out.println("eating...");
        }
    }
    class Dog extends Inheritance{
        void bark(){System.out.println("Dog barking...");}
    }
    class BabyDog extends Dog{
        void weep(){System.out.println("baby dog weeping...");}
    }
    class TestInheritance2{
        public static void main(String args[]){
            BabyDog d=new BabyDog();
            d.weep();
            d.bark();
            d.eat();
        }}



